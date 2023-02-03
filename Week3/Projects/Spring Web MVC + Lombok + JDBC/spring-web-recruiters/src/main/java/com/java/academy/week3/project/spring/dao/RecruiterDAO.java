package com.java.academy.week3.project.spring.dao;

import java.util.List;

import com.java.academy.week3.project.spring.entity.Recruiter;

public interface RecruiterDAO {

	public List<Recruiter> getAllRecruiters();

	public void saveRecruiter(Recruiter theRecruiter);

	public Recruiter getRecruiter(int theId);

	public void deleteRecruiter(int theId);
	
}
