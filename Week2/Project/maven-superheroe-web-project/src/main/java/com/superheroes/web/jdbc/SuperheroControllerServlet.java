package com.superheroes.web.jdbc;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class SuperheroControllerServlet
 */
@WebServlet("/SuperheroControllerServlet")
public class SuperheroControllerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	private SuperheroDbUtil superheroDbUtil;
	
	@Resource(name="jdbc/web_superheroes_project")
	private DataSource dataSource;
	
	@Override
	public void init() throws ServletException {
		super.init();
		
		// create our superhero db util ... and pass in the conn pool / datasource
		try {
			superheroDbUtil = new SuperheroDbUtil(dataSource);
		}
		catch (Exception exc) {
			throw new ServletException(exc);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			// read the "command" parameter
			String theCommand = request.getParameter("command");
			
			// if the command is missing, then default to listing superheroes
			if (theCommand == null) {
				theCommand = "LIST";
			}
			
			// route to the appropriate method
			switch (theCommand) {
			
			case "LIST":
				listSuperheroes(request, response);
				break;
				
			case "ADD":
				addSuperhero(request, response);
				break;
				
			case "LOAD":
				loadSuperhero(request, response);
				break;
				
			case "UPDATE":
				updateSuperhero(request, response);
				break;
			
			case "DELETE":
				deleteSuperhero(request, response);
				break;
				
			default:
				listSuperheroes(request, response);
			}
				
		}
		catch (Exception exc) {
			throw new ServletException(exc);
		}
		
	}

	private void deleteSuperhero(HttpServletRequest request, HttpServletResponse response)
		throws Exception {

		// read superhero id from form data
		String theSuperheroId = request.getParameter("superheroId");
		
		// delete superhero from database
		superheroDbUtil.deleteSuperhero(theSuperheroId);
		
		// send them back to "list superheroes" page
		listSuperheroes(request, response);
	}

	private void updateSuperhero(HttpServletRequest request, HttpServletResponse response)
		throws Exception {

		// read superhero info from form data
		int id = Integer.parseInt(request.getParameter("superheroId"));
		String secretIdentity = request.getParameter("secretIdentity");
		String alterEgo = request.getParameter("alterEgo");
		String superpower = request.getParameter("superpower");
		
		// create a new superhero object
		Superhero theSuperhero = new Superhero(id, secretIdentity, alterEgo, superpower);
		
		// perform update on database
		superheroDbUtil.updateSuperhero(theSuperhero);
		
		// send them back to the "list superheroes" page
		listSuperheroes(request, response);
		
	}

	private void loadSuperhero(HttpServletRequest request, HttpServletResponse response) 
		throws Exception {

		// read superhero id from form data
		String theSuperheroId = request.getParameter("superheroId");
		
		// get superhero from database (db util)
		Superhero theSuperhero = superheroDbUtil.getSuperhero(theSuperheroId);
		
		// place superhero in the request attribute
		request.setAttribute("THE_SUPERHERO", theSuperhero);
		
		// send to jsp page: update-superhero-form.jsp
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/update-superhero-form.jsp");
		dispatcher.forward(request, response);		
	}

	private void addSuperhero(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// read superhero info from form data
		String secretIdentity = request.getParameter("secretIdentity");
		String alterEgo = request.getParameter("alterEgo");
		String superpower = request.getParameter("superpower");
		
		// create a new superhero object
		Superhero theSuperhero = new Superhero(secretIdentity, alterEgo, superpower);
		
		// add the superhero to the database
		superheroDbUtil.addSuperhero(theSuperhero);
				
		// send back to main page (the superhero list)
		listSuperheroes(request, response);
	}

	private void listSuperheroes(HttpServletRequest request, HttpServletResponse response) 
		throws Exception {

		// get superheroes from db util
		List<Superhero> superheroes = superheroDbUtil.getSuperheroes();
		
		// add superheroes to the request
		request.setAttribute("SUPERHEROES_LIST", superheroes);
				
		// send to JSP page (view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-superheroes.jsp");
		dispatcher.forward(request, response);
	}

}













