package com.brian.albers.loginregisterexercise.exceptions;

/**
 * Custom exception that is called when it has been detected that the user
 * supplied a username/password combo that doesn't have a mtch in the database
 * 
 * @author Brian.Albers
 * @version 1.0
 */
public class UsernamePasswordDoesNotMatch extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * No argument constructor that uses the RuntimeException Constructor
	 */
	public UsernamePasswordDoesNotMatch() {
		super();
	}

	/**
	 * Constructor takes a String and passes it to the RuntimeException Class
	 * constructor
	 * 
	 * @param message
	 *            String parameter passed from throwing Class.
	 */
	public UsernamePasswordDoesNotMatch(String message) {
		super(message);
	}

}
