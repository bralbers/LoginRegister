package com.brian.albers.loginregisterexercise.persistence;

/**
 * This is the interface for UsersDAO. This interface contains three methods.
 * One method for adding a user. The other method is overloaded. Both version
 * are for finding a user object that has been stored in a database but one
 * method checks only usernames and the other check for username/password combo.
 * 
 * @author Brian.Albers
 * @version 1.0
 * @param <T>
 *            Generic placeholder so that the interface may be used with any
 *            object
 */
public interface Users<T> {

	/**
	 * This method writes a User object as a String into a file.
	 * 
	 * @param t
	 *            Generic placeholder so that addUser may be use with any object
	 * @see UsersDAO
	 */
	public abstract void addUser(T t);

	/**
	 * This method uses a list to gather all users in a database and then checks if
	 * any of the user's username field patches the supplied username string.
	 * 
	 * @param username
	 *            A username supplied by the client
	 * @return A boolean showing whether the username was found or not
	 * @UsersDAO
	 */
	public abstract Boolean findUser(String username);

	/**
	 * This method uses a list to gather all users in a database and then checks if
	 * a user's username/password combonation matches a supplied username/password
	 * combo.
	 * 
	 * @param username
	 *            A username supplied by the client
	 * @param password
	 *            A password supplied by the client
	 * @return A boolean showing whether the username/password combo was found or
	 *         not
	 * @see UsersDAO
	 */
	public abstract Boolean findUser(String username, String password);
}