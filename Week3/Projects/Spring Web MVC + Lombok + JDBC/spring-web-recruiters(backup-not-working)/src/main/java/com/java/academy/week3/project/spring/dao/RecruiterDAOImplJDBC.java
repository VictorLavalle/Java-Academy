package com.java.academy.week3.project.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.academy.week3.project.spring.entity.Recruiter;

import javax.sql.DataSource;
import static org.hibernate.Hibernate.close;

@Repository
public class RecruiterDAOImplJDBC implements RecruiterDAO {

	@Autowired
	private DataSource dataSource;

	public RecruiterDAOImplJDBC(DataSource theDataSource) {
		dataSource = theDataSource;
	}

	@Override
	public List<Recruiter> getAllRecruiters() {
		// Initialize an empty list to store the recruiters
		List<Recruiter> recruiters = new ArrayList<>();

		// SQL query to select all recruiters ordered by name
		String sql = "select * from recruiter order by name";

		//
		// Use try-with-resources statement to automatically close resources
		// All these resources implement the AutoCloseable.
		// This means that once the try block is finished executing, will be closed
		// automatically
		//
		try (
				// create a connection to the database using the dataSource object
				Connection myConn = dataSource.getConnection();
				// create a statement object to execute the query
				Statement myStmt = myConn.createStatement();
				// execute the query and get the result set
				ResultSet myRs = myStmt.executeQuery(sql)) {

			// Iterate through the result set and add each recruiter to the list
			while (myRs.next()) {
				// Retrieve data from result set row
				int id = myRs.getInt("id");
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String company = myRs.getString("company");
				String email = myRs.getString("email");

				// Create new recruiter object
				Recruiter tempRecruiter = new Recruiter(id, firstName, lastName, company, email);

				// Add it to the list of recruiters
				recruiters.add(tempRecruiter);
			}

			// Return the list of recruiters
			return recruiters;
		} catch (Exception e) {
			e.printStackTrace();
			return recruiters;
		}
	}

	@Override
	public void saveRecruiter(Recruiter theRecruiter) {

		// create the sql query for insert
		String sql = theRecruiter.getId() == 0
				? "insert into recruiters " + "(first_name, last_name, company, email) " + "values (?, ?, ?, ?)"
				: "update recruiter" + "set first_name=?, last_name=?, company=?, email=?" + "where id=?";

		try (
				//
				// Also Applied try-with-resources in this method.
				// create a connection to the database and a prepared statement for the query
				//
				Connection myConn = dataSource.getConnection();
				PreparedStatement myStmt = myConn.prepareStatement(sql)) {

			if (theRecruiter.getId() == 0) {
				// set the param values for the recruiter
				myStmt.setString(1, theRecruiter.getFirstName());
				myStmt.setString(2, theRecruiter.getLastName());
				myStmt.setString(3, theRecruiter.getCompany());
				myStmt.setString(4, theRecruiter.getEmail());
			} else {
				myStmt.setString(1, theRecruiter.getFirstName());
				myStmt.setString(2, theRecruiter.getLastName());
				myStmt.setString(3, theRecruiter.getCompany());
				myStmt.setString(4, theRecruiter.getEmail());
				myStmt.setInt(3, theRecruiter.getId());
			}
			// execute sql insert
			myStmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public Recruiter getRecruiter(int theId) {

		Recruiter theRecruiter = null;

		String sql = "select * from recruiter where id=?";

		int recruiterId;

		try (Connection myConn = dataSource.getConnection(); PreparedStatement myStmt = myConn.prepareStatement(sql);) {

			recruiterId = theId;

			myStmt.setInt(1, recruiterId);
			try (ResultSet myRs = myStmt.executeQuery();) {
				if (myRs.next()) {
					String firstName = myRs.getString("first_name");
					String lastName = myRs.getString("last_name");
					String company = myRs.getString("company");
					String email = myRs.getString("email");

					theRecruiter = new Recruiter(recruiterId, firstName, lastName, company, email);
				} else {
					System.out.println("Couldn't found the recruiter with the id: " + recruiterId);
					return theRecruiter;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			// retrieve data from result set row

			return theRecruiter;
		} catch (Exception e) {
			e.printStackTrace();
			return theRecruiter;
		}
	}

	@Override
	public void deleteRecruiter(int theId) {
		String sql = "delete from recruiter where id=?";
		try (Connection myConn = dataSource.getConnection(); PreparedStatement myStmt = myConn.prepareStatement(sql);) {

			int recruiterId = theId;

			myStmt.setInt(1, recruiterId);

			myStmt.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
