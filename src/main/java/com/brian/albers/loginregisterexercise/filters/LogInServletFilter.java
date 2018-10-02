package com.brian.albers.loginregisterexercise.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.jboss.logging.Logger;

import com.brian.albers.loginregisterexercise.exceptions.UsernamePasswordDoesNotMatch;
import com.brian.albers.loginregisterexercise.persistence.UsersDAO;
import com.brian.albers.loginregisterexercise.servlets.GetUserServlet;

/**
 * This filter checks to make sure a username.password combo provided by a
 * client matches information stored in the database.
 */
public class LogInServletFilter implements Filter {

	private FilterConfig fConfig;
	private Logger myLogger = Logger.getLogger(GetUserServlet.class);

	/**
	 * Default constructor takes no arguments and sets nothing to nothing.
	 */
	public LogInServletFilter() {
	}

	/**
	 * Not implemented
	 * 
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * This method checks to see if a username/password combination supplied by the
	 * client matches a username/password combo in the database. If a match is not
	 * found then an exception is thrown. Otherwise the filter calls the next
	 * component in the chain.
	 * 
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		myLogger.info("INFO:Filter is checking if username/password combo exists");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		UsersDAO userDAO = (UsersDAO) fConfig.getServletContext().getAttribute("dao");
		if (userDAO == null) {
			userDAO = new UsersDAO();
		}

		myLogger.info("INFO:Calling method to find a user");
		Boolean isFound = userDAO.findUser(username, password);

		if (isFound == false) {
			request.setAttribute("allowLogIn", false);
			myLogger.warn("WARN:Username/password combo does not exist");
			throw new UsernamePasswordDoesNotMatch();
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