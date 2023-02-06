package com.java.academy.week3.project.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.academy.week3.project.spring.entity.Recruiter;

@Repository
public class RecruiterDAOImpl implements RecruiterDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<Recruiter> getAllRecruiters() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query  ... sort by last name
		Query<Recruiter> theQuery = 
				currentSession.createQuery("from Recruiter order by lastName",
											Recruiter.class);
		
		// execute query and get result list
		List<Recruiter> recruiters = theQuery.getResultList();
				
		// return the results		
		return recruiters;
	}

	@Override
	public void saveRecruiter(Recruiter theRecruiter) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/update the recruiter 
		currentSession.saveOrUpdate(theRecruiter);
		
	}

	@Override
	public Recruiter getRecruiter(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		Recruiter theRecruiter = currentSession.get(Recruiter.class, theId);
		
		return theRecruiter;
	}

	@Override
	public void deleteRecruiter(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Recruiter where id=:recruiterId");
		theQuery.setParameter("recruiterId", theId);
		
		theQuery.executeUpdate();		
	}


}











