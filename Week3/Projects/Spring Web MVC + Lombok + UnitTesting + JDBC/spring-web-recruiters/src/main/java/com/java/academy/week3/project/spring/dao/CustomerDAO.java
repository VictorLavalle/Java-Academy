package com.java.academy.week3.project.spring.dao;

import java.util.List;

import com.java.academy.week3.project.spring.entity.Recruiter;

public interface CustomerDAO {

	public List<Recruiter> getCustomers();

	public void saveCustomer(Recruiter theCustomer);

	public Recruiter getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}
