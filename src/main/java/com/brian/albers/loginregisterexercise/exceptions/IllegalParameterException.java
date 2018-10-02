package com.brian.albers.loginregisterexercise.exceptions;

/**
 * Customer exception that is called when a client passes a parameter that is
 * not allowed in the application.
 * 
 * @author Brian.Albers
 * @version 1.0
 *
 */
public class IllegalParameterException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * No argument constructor that uses the RuntimeException Constructor
	 */
	public IllegalParameterException() {
		super();
	}

	/**
	 * Constructor takes a String and passes it to the RuntimeException Class constructor
	 * 
	 * @param message
	 *            String parameter passed from throwing Class.
	 */
	public IllegalParameterException(String message) {
		super(message);
	}
}
