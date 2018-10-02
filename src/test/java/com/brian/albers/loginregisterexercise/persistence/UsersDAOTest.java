package com.brian.albers.loginregisterexercise.persistence;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.brian.albers.loginregisterexercise.model.User;
import com.brian.albers.loginregisterexercise.persistence.UsersDAO;

public class UsersDAOTest {
	private UsersDAO usersDAO;
	private User user;
	
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	
	private String incorrectUsername;
	private String incorrectPassword;
	
	@Before
	public void setUp() throws Exception {
		usersDAO = new UsersDAO();
		user = new User();
		
		username = "jdoe";
		password = "dragonborn";
		firstName = "John";
		lastName = "Doe";
		email = "example@domain.com";
		
		user.setUsername(username);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		
		usersDAO.addUser(user);
	}

	@Test
	public void testIfUsernameExists() {
		Boolean isFound = usersDAO.findUser(username);
		assertTrue(isFound);
	}
	
	@Test
	public void testIfUsernamePasswordComboExists() {
		Boolean isFound = usersDAO.findUser(username, password);
		assertTrue(isFound);
	}
	
	@Test
	public void testIfUsernameDoesNotExist() {
		Boolean isFound = usersDAO.findUser(incorrectUsername);
		assertFalse(isFound);	
	}
	
	@Test
	public void testIfUsernamePasswordDoesNotExist_WithIncorrectUsername() {
		Boolean isFound = usersDAO.findUser(incorrectUsername,password);
		assertFalse(isFound);
	}
	
	@Test
	public void testIfUsernamePasswordDoesNotExist_WithIncorrectPassword() {
		Boolean isFound = usersDAO.findUser(username,incorrectPassword);
		assertFalse(isFound);
	}
}