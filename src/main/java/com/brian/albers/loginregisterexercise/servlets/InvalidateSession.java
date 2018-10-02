package com.brian.albers.loginregisterexercise.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.logging.Logger;

/**
 * Servlet implementation class InvalidateSession
 */
public class InvalidateSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Logger myLogger = Logger.getLogger(InvalidateSession.class);

	/**
	 * No argument Constructor that uses HttpServlet constructor
	 * 
	 * @see HttpServlet#HttpServlet()
	 */
	public InvalidateSession() {
		super();
	}

	/**
	 * This method will make the current session invalid. This will effectively
	 * logout the client. After the logout has happened then the client will be
	 * forward to a redirect page which will inform the user that they are logged
	 * out. The redirect page then will send the client back to the home page.
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getSession().invalidate();
		myLogger.info("INFO:Session has been invalidated");

		request.setAttribute("invalidateSession", true);

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
