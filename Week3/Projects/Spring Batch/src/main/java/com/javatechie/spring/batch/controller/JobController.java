package com.javatechie.spring.batch.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobLauncher jobLauncher;
    @Autowired
    private Job job;

    @PostMapping("/importCustomers")
    public void importCsvToDBJob() {

        //Start time for tracking the process duration
        //This is not necessary, but it is a good practice to track the process duration
        //for performance analysis and debugging purposes
        long startTime = System.currentTimeMillis();

        //Setting JobParameters, including the start time
        //for tracking the process duration and the job name for logging purposes
        JobParameters jobParameters = new JobParametersBuilder()
                .addLong("startAt", startTime).toJobParameters();

        try {
            //launching the job with the specified job parameters
            // and waiting for the job to complete before continuing the execution
            //
            jobLauncher.run(job, jobParameters);
        } catch (JobExecutionAlreadyRunningException |
                 JobRestartException |
                 JobInstanceAlreadyCompleteException |
                 JobParametersInvalidException e) {
            //printing the exception stack trace if any exception occurs
            e.printStackTrace();
        }
    }
}
