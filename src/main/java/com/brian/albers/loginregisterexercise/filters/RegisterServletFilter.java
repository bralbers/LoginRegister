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
import com.brian.albers.loginregisterexercise.servlets.SetUserServlet;

/**
 * This Filter is used to verify the parameters given by the client to register
 * as a user. Verification is correct length of parameters and parameters not
 * set to null.
 */
public class RegisterServletFilter implements Filter {
	private Logger myLogger = Logger.getLogger(SetUserServlet.class);

	/**
	 * Default constructor takes no arguments and sets nothing to nothing.
	 */
	public RegisterServletFilter() {
	}

	/**
	 * Not implemented
	 * 
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * This method check that the parameters supplied by a client for registering as
	 * a user are valid. Leading and following whitespaces for the username and
	 * password are eliminated and the length is check. Usernames must be at least 5
	 * characters while Passwords must be at least 7. The confirm password must
	 * match the supplied password and the first name, last name, and email fields
	 * must not be null. If any of the requirements are not met then an exception is
	 * thrown. Otherwise the filter calls the next component in the chain.
	 * 
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		myLogger.info("INFO:Filter for adding user is checking validation of parameters");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");

		if (username.trim().length() < 5 || username.isEmpty()) {
			request.setAttribute("IncorrectUsername", true);
			myLogger.warn("WARN:Username was invalid");
			throw new IllegalParameterException();
		} else if (password.trim().length() < 7 || password.isEmpty()) {
			request.setAttribute("IncorrectPassword", true);
			myLogger.warn("WARN:Password was invalid");
			throw new IllegalParameterException();
		} else if (confirmPassword.isEmpty() || !password.equals(confirmPassword)) {
			request.setAttribute("IncorrectConfirmPassword", true);
			myLogger.warn("WARN:Confirmation Password was not the same as Password");
			throw new IllegalParameterException();
		} else if (firstName.isEmpty()) {
			request.setAttribute("NullFirstName", true);
			myLogger.warn("WARN:First name was null");
			throw new IllegalParameterException();
		} else if (lastName.isEmpty()) {
			request.setAttribute("NullLastName", true);
			myLogger.warn("WARN:Last name was null");
			throw new IllegalParameterException();
		} else if (email.isEmpty()) {
			request.setAttribute("NullEmail", true);
			myLogger.warn("WARN:Email was null");
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
	}
}