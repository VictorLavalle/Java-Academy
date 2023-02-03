package com.java.academy.week3.project.spring.dao;

import java.util.List;

import com.java.academy.week3.project.spring.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}
