package com.superheroes.web.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

/**
 * This code is a Java class called SuperheroDbUtil that connects to a database 
 * using a DataSource and performs CRUD operations on a "superheroes" table
 */

public class SuperheroDbUtil {

	private DataSource dataSource;

	public SuperheroDbUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}
	
	public List<Superhero> getSuperheroes() throws Exception {
		
		List<Superhero> superheroes = new ArrayList<>();
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			// get a connection
			myConn = dataSource.getConnection();
			
			// create sql statement
			String sql = "select * from superheroes order by secret_identity";
			
			myStmt = myConn.createStatement();
			
			// execute query
			myRs = myStmt.executeQuery(sql);
			
			// process result set
			while (myRs.next()) {
				
				// retrieve data from result set row
				int id = myRs.getInt("id");
				String secretIdentity = myRs.getString("secret_identity");
				String alterEgo= myRs.getString("alter_ego");
				String superpower = myRs.getString("superpower");
				
				// create new superhero object
				Superhero tempSuperhero = new Superhero(id, secretIdentity, alterEgo, superpower);
				
				// add it to the list of superheroes
				superheroes.add(tempSuperhero);				
			}
			
			// return the list of superheroes
			return superheroes;		
		}
		finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}		
	}

	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {

		try {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();   // doesn't really close it ... just puts back in connection pool
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}

	public void addSuperhero(Superhero theSuperhero) throws Exception {

		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			// get db connection
			myConn = dataSource.getConnection();
			
			// create sql for insert
			String sql = "insert into superheroes "
					   + "(secret_identity, alter_ego, superpower) "
					   + "values (?, ?, ?)";
			
			myStmt = myConn.prepareStatement(sql);
			
			// set the param values for the superhero
			myStmt.setString(1, theSuperhero.getSecretIdentity());
			myStmt.setString(2, theSuperhero.getAlterEgo());
			myStmt.setString(3, theSuperhero.getSuperpower());
			
			// execute sql insert
			myStmt.execute();
		}
		finally {
			// clean up JDBC objects
			close(myConn, myStmt, null);
		}
	}

	public Superhero getSuperhero(String theSuperheroId) throws Exception {

		Superhero theSuperhero = null;
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		int superheroId;
		
		try {
			// convert superhero  id to int
			superheroId = Integer.parseInt(theSuperheroId);
			
			// get connection to database
			myConn = dataSource.getConnection();
			
			// create sql to get selected superhero
			String sql = "select * from superheroes where id=?";
			
			// create prepared statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			myStmt.setInt(1, superheroId);
			
			// execute statement
			myRs = myStmt.executeQuery();
			
			// retrieve data from result set row
			if (myRs.next()) {
				String secretIdentity = myRs.getString("secret_identity");
				String alterEgo = myRs.getString("alter_ego");
				String superpower = myRs.getString("superpower");
				
				// use the superheroId during construction
				theSuperhero = new Superhero(superheroId, secretIdentity, alterEgo, superpower);
			}
			else {
				throw new Exception("Could not find superhero id: " + superheroId);
			}				
			
			return theSuperhero;
		}
		finally {
			// clean up JDBC objects
			close(myConn, myStmt, myRs);
		}
	}

	public void updateSuperhero(Superhero theSuperhero) throws Exception {
		
		Connection myConn = null;
		PreparedStatement myStmt = null;

		try {
			// get db connection
			myConn = dataSource.getConnection();
			
			// create SQL update statement
			String sql = "update superheroes "
						+ "set secret_identity=?, alter_ego=?, superpower=? "
						+ "where id=?";
			
			// prepare statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			myStmt.setString(1, theSuperhero.getSecretIdentity());
			myStmt.setString(2, theSuperhero.getAlterEgo());
			myStmt.setString(3, theSuperhero.getSuperpower());
			myStmt.setInt(4, theSuperhero.getId());

			
			
			// execute SQL statement
			myStmt.execute();
		}
		finally {
			// clean up JDBC objects
			close(myConn, myStmt, null);
		}
	}

	public void deleteSuperhero(String theSuperheroId) throws Exception {

		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			// convert superhero id to int
			int superheroId = Integer.parseInt(theSuperheroId);
			
			// get connection to database
			myConn = dataSource.getConnection();
			
			// create sql to delete superhero
			String sql = "delete from superheroes where id=?";
			
			// prepare statement
			myStmt = myConn.prepareStatement(sql);
			
			// set params
			myStmt.setInt(1, superheroId);
			
			// execute sql statement
			myStmt.execute();
		}
		finally {
			// clean up JDBC code
			close(myConn, myStmt, null);
		}	
	}
}















