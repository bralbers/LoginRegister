package com.brian.albers.loginregisterexercise.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.logging.Logger;

import com.brian.albers.loginregisterexercise.model.User;
import com.brian.albers.loginregisterexercise.persistence.UsersDAO;

/**
 * This servlet is used to add a client as a user to a web app.
 */
public class SetUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Logger myLogger = Logger.getLogger(SetUserServlet.class);

	/**
	 * No argument Constructor that uses HttpServlet constructor
	 * 
	 * @see HttpServlet#HttpServlet()
	 */
	public SetUserServlet() {
		super();
	}

	/**
	 * This method takes the parameters supplied by the client to make a user object
	 * and then stores it into a database.
	 * 
	 * @see User
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");

		User user = new User(username, password, firstName, lastName, email);
		myLogger.info("INFO:User object has been created");

		UsersDAO userDAO = (UsersDAO) this.getServletContext().getAttribute("dao");
		if (userDAO == null) {
			userDAO = new UsersDAO();
		}

		userDAO.addUser(user);
		myLogger.info("INFO:UserDAO added a new user to the USER table");

		request.setAttribute("userStore", true);

		myLogger.info("INFO:Servlet is forwarding to the redirect page");
		RequestDispatcher rd = request.getRequestDispatcher("redirect");
		rd.forward(request, response);
	}

	/**
	 * This method makes it so that supplied sensitive information doesn't show in
	 * the url bar and also calls the doGet() method it log-in the user.
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}