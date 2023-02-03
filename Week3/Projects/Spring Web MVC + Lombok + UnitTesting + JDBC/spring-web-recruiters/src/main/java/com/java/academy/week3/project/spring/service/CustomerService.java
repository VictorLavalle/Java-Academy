package com.java.academy.week3.project.spring.service;

import java.util.List;

import com.java.academy.week3.project.spring.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}
