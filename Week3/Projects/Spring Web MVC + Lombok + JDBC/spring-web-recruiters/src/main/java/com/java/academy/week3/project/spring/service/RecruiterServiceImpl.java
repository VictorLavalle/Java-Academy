package com.java.academy.week3.project.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.academy.week3.project.spring.dao.RecruiterDAO;
import com.java.academy.week3.project.spring.entity.Recruiter;

@Service
public class RecruiterServiceImpl implements RecruiterService {

	// need to inject recruiter dao
	@Autowired
	private RecruiterDAO recruiterDAO;
	
	@Override
	@Transactional
	public List<Recruiter> getAllRecruiters() {
		return recruiterDAO.getAllRecruiters();
	}

	@Override
	@Transactional
	public void saveRecruiter(Recruiter theRecruiter) {
		recruiterDAO.saveRecruiter(theRecruiter);
	}

	@Override
	@Transactional
	public Recruiter getRecruiter(int theId) {
		return recruiterDAO.getRecruiter(theId);
	}

	@Override
	@Transactional
	public void deleteRecruiter(int theId) {
		recruiterDAO.deleteRecruiter(theId);
	}
	
}