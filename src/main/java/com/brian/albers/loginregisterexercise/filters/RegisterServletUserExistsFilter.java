package com.brian.albers.loginregisterexercise.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.jboss.logging.Logger;

import com.brian.albers.loginregisterexercise.exceptions.IllegalParameterException;
import com.brian.albers.loginregisterexercise.persistence.UsersDAO;
import com.brian.albers.loginregisterexercise.servlets.SetUserServlet;

/**
 * This Filter is used to make sure that a username provided by the client to
 * register as a user does not already exist in the database.
 */
public class RegisterServletUserExistsFilter implements Filter {
	private Logger myLogger = Logger.getLogger(SetUserServlet.class);

	private FilterConfig fConfig;

	/**
	 * Default constructor takes no arguments and sets nothing to nothing.
	 */
	public RegisterServletUserExistsFilter() {
	}

	/**
	 * Not implemented
	 * 
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * This method checks that the username supplied by the client to register as a
	 * user does not already exist in the database,
	 * 
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		myLogger.info("INFO:Filter is checking if username already exist");
		String username = request.getParameter("username");

		UsersDAO userDAO = (UsersDAO) fConfig.getServletContext().getAttribute("dao");
		if (userDAO == null) {
			userDAO = new UsersDAO();
		}

		myLogger.info("INFO:Calling method to find user");
		Boolean isFound = userDAO.findUser(username);

		if (isFound == true) {
			request.setAttribute("disallowRegistration", true);
			myLogger.info("INFO:Username alreayd exists in the database");
			throw new IllegalParameterException();
		} else {
			chain.doFilter(request, response);
		}
	}

	/**
	 * Not implemented
	 * 
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		this.fConfig = fConfig;
	}

}
