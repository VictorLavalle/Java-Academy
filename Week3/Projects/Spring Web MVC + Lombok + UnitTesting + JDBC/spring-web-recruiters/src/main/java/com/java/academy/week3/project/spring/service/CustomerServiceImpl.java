package com.java.academy.week3.project.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.academy.week3.project.spring.dao.CustomerDAO;
import com.java.academy.week3.project.spring.entity.Recruiter;

@Service
public class CustomerServiceImpl implements CustomerService {

	// need to inject customer dao
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Recruiter> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Recruiter theCustomer) {

		customerDAO.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	public Recruiter getCustomer(int theId) {
		
		return customerDAO.getCustomer(theId);
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		
		customerDAO.deleteCustomer(theId);
	}
}





