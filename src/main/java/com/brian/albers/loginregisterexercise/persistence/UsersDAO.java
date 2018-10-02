package com.brian.albers.loginregisterexercise.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.jboss.logging.Logger;

import com.brian.albers.loginregisterexercise.model.User;

/**
 * Class that interacts with user object via three different methods. The first
 * method persists an User object unto a database. The other method is overloaded. Both version
 * are for finding a user object that has been stored in a database but one
 * method checks only usernames and the other check for username/password combo.
 * 
 * @author Brian.Albers
 * @version 1.0
 *
 */
public class UsersDAO implements Users<User> {

	static private EntityManagerFactory emf;

	private Logger myLogger = Logger.getLogger(UsersDAO.class);

	/**
	 * No argument constructor that sets the EntitManagerFactory to Persistence
	 */
	public UsersDAO() {
		emf = Persistence.createEntityManagerFactory("usersDAO");
	}

	public static EntityManagerFactory getEmf() {
		return emf;
	}

	/**
	 * This method writes a User object as a String into a file.
	 * 
	 * @param user
	 *            A User object containing a username, password, first name, last
	 *            name, and an email. Used to create a user for a web application.
	 * @see User
	 */
	@Override
	public void addUser(User user) {
		myLogger.info("INFO:addUser method is adding user to database");
		myLogger.info("INFO:EntityManager has been created");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(user);

		em.getTransaction().commit();

		myLogger.info("INFO:EntityManager has been closed");
		em.close();
	}

	/**
	 * This method uses a list to gather all users in a database and then checks if
	 * any of the user's username field patches the supplied username string.
	 * 
	 * @param username
	 *            A username supplied by the client
	 * @return A boolean showing whether the username was found or not
	 */
	@Override
	public Boolean findUser(String username, String password) {
		myLogger.info("INFO:findUser method is looking for username/password combo in the database");
		Boolean isFound = false;

		myLogger.info("INFO:List to hold all users in the database has been created");
		List<User> users = new ArrayList<User>();

		myLogger.info("INFO:EntityManager has been created");
		EntityManager em = emf.createEntityManager();

		myLogger.info("INFO:Query being sent to the database to SELECT all users");
		TypedQuery<User> query = em.createQuery("SELECT u FROM User u", User.class);

		myLogger.info("INFO:Storing query results in the List");
		users = query.getResultList();

		myLogger.info("INFO:EntityManager has been closed");
		em.close();

		for (User user : users) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				myLogger.info("INFO:Found username/password combo in the database");
				isFound = true;
			}

		}

		return isFound;
	}

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
	 */
	@Override
	public Boolean findUser(String username) {
		myLogger.info("INFO:findUser method is looking for username in the database");
		Boolean isFound = false;

		myLogger.info("INFO:List to hold all users in the database has been created");
		List<User> users = new ArrayList<User>();

		myLogger.info("INFO:EntityManager has been created");
		EntityManager em = emf.createEntityManager();

		myLogger.info("INFO:Query being sent to the database to SELECT all users");
		TypedQuery<User> query = em.createQuery("SELECT u FROM User u", User.class);

		myLogger.info("INFO:Storing query results in the List");
		users = query.getResultList();

		myLogger.info("INFO:EntityManager has been closed");
		em.close();

		for (User user : users) {
			if (user.getUsername().equals(username)) {
				myLogger.info("INFO:Found username in the database");
				isFound = true;
			}

		}

		return isFound;
	}
}