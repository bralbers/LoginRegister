package com.brian.albers.loginregisterexercise.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.logging.Logger;

/**
 * This servlets purpose is to log-in a client and start a session so that the
 * client may stay logged in.
 * 
 * @author Brian Albers
 * @version 1.0
 */
public class GetUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Logger myLogger = Logger.getLogger(GetUserServlet.class);

	/**
	 * No argument Constructor that uses HttpServlet constructor
	 * 
	 * @see HttpServlet#HttpServlet()
	 */
	public GetUserServlet() {
		super();
	}

	/**
	 * This method activates a session flag to allow a user to stay logged in. It
	 * then sets a logIn flag and forwards the request to a redirect page. The
	 * redirect page will then let the client know that they are logged in before
	 * sending the client back to the homepage.
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getSession().setAttribute("status", "live");
		myLogger.info("INFO:User Session has started");

		request.setAttribute("logIn", true);

		myLogger.info("INFO:Servlet forwarding to the redirect page");
		RequestDispatcher rd = request.getRequestDispatcher("redirect");
		rd.forward(request, response);

	}

	/**
	 * This method makes it so that supplied sensitive information doesn't show in
	 * the url bar and also calls the doGet() method it log-in the user.
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}