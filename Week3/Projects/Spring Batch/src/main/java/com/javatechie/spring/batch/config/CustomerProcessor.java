package com.javatechie.spring.batch.config;

import com.javatechie.spring.batch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;


//Implements the ItemProcessor interface provided by Spring Batch.
public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    /*
    * Overrides the process method of the ItemProcessor interface,
    * which takes an input item (of type Customer) and returns an output
    * item (of type Customer).
    * The purpose of this method is to perform any desired
    * transformation on the input item before it is written to the output.
     */
    @Override
    public Customer process(Customer customer) throws Exception {
/*        if(customer.getCountry().equals("China")) {
            return customer;
        }
        return null;
*/
        return customer;
    }

    //The method above checks if the customer's country is "China",
    // and if so, returns the customer object.
    // If not, returns null. However, since the return statement is commented,
    // the method always returns the customer object without any conditional check.

}
