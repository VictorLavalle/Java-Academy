package com.javatechie.spring.batch.config;

import com.javatechie.spring.batch.entity.Customer;
import com.javatechie.spring.batch.repository.CustomerRepository;

import lombok.AllArgsConstructor;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;

//This configuration class enables Spring batch processing
@Configuration
@EnableBatchProcessing
//All constructor args are autowired using Lombok's AllArgsConstructor
@AllArgsConstructor
public class SpringBatchConfig {

    //Spring batch provides JobBuilderFactory and StepBuilderFactory to create Job and Step
    //and autowire them using constructor
    private JobBuilderFactory jobBuilderFactory;
    private StepBuilderFactory stepBuilderFactory;
    private CustomerRepository customerRepository;


    //Defining bean for FlatFileItemReader to read data from csv file
    @Bean
    public FlatFileItemReader<Customer> reader() {
        FlatFileItemReader<Customer> itemReader = new FlatFileItemReader<>();

        //Setting the resource of the csv file to be read
        itemReader.setResource(new FileSystemResource("src/main/resources/customers.csv"));
        itemReader.setName("csvReader");
        //Skipping the first line of the file
        itemReader.setLinesToSkip(1);
        //Setting the LineMapper for mapping the data from csv to Customer object
        itemReader.setLineMapper(lineMapper());
        return itemReader;
    }


    //Defining LineMapper for mapping the csv data to Customer object
    private LineMapper<Customer> lineMapper() {
        DefaultLineMapper<Customer> lineMapper = new DefaultLineMapper<>();

        //DelimitedLineTokenizer for tokenizing the data in csv file
        //The delimiter is set to a comma, strict mode is set to false,
        // and the names of the fields in the CSV file are set in the specified order.!!!
        DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
        lineTokenizer.setDelimiter(",");
        lineTokenizer.setStrict(false);
        lineTokenizer.setNames("id", "firstName", "lastName", "email", "gender", "contactNo", "country", "dateOfBirth");


        //Created to map the tokenized data to a Customer object. The target type is set to Customer.class.
        BeanWrapperFieldSetMapper<Customer> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
        fieldSetMapper.setTargetType(Customer.class);

        //Setting the lineTokenizer and fieldSetMapper to the lineMapper
        //and returning the lineMapper to the reader
        lineMapper.setLineTokenizer(lineTokenizer);
        lineMapper.setFieldSetMapper(fieldSetMapper);
        return lineMapper;

    }

    //Defining bean for CustomerProcessor to process the data read from csv file
    @Bean
    public CustomerProcessor processor() {
        return new CustomerProcessor();
    }


    //Defining bean for RepositoryItemWriter to write the data to database
    @Bean
    public RepositoryItemWriter<Customer> writer() {

        //Creating an instance of RepositoryItemWriter for the Customer object
        RepositoryItemWriter<Customer> writer = new RepositoryItemWriter<>();

        //Setting the repository for the writer to save the Customer objects
        writer.setRepository(customerRepository);

        // Setting the method name as "save" to save the Customer objects
        writer.setMethodName("save");
        return writer;
    }



    // Define step1 bean using StepBuilderFactory
    @Bean
    public Step step1() {
        return stepBuilderFactory.get("csv-step") // Step name: csv-step
                .<Customer, Customer>chunk(10) // Configure chunk size of 10
                .reader(reader()) // Set reader for reading csv data
                .processor(processor()) // Set processor for processing csv data
                .writer(writer()) // Set writer for writing processed data to the repository
                .taskExecutor(taskExecutor()) // Set task executor for executing the step asynchronously
                .build();
    }



    // Define runJob bean using JobBuilderFactory
    @Bean
    public Job runJob() {
        return jobBuilderFactory.get("importCustomers") // Job name: importCustomers
                .flow(step1()).end().build(); // Add step1 to the job flow
    }



    // Define taskExecutor bean for executing the step asynchronously
    @Bean
    public TaskExecutor taskExecutor() {
        SimpleAsyncTaskExecutor asyncTaskExecutor = new SimpleAsyncTaskExecutor();
        asyncTaskExecutor.setConcurrencyLimit(10); // Set the concurrency limit to 10
        return asyncTaskExecutor;
    }

}
