package com.java.academy.week3.project.spring.service;

import java.util.List;

import com.java.academy.week3.project.spring.entity.Recruiter;

public interface RecruiterService {

	public List<Recruiter> getAllRecruiters();

	public void saveRecruiter(Recruiter theRecruiter);

	public Recruiter getRecruiter(int theId);

	public void deleteRecruiter(int theId);
	
}
