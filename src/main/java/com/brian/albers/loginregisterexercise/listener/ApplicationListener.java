package com.brian.albers.loginregisterexercise.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.jboss.logging.Logger;

import com.brian.albers.loginregisterexercise.persistence.UsersDAO;

/**
 * Application Lifecycle Listener implementation class ApplicationListener
 *
 */
public class ApplicationListener implements ServletContextListener {

	private Logger myLogger = Logger.getLogger(ApplicationListener.class);
    /**
     * Default constructor. 
     */
    public ApplicationListener() {
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         UsersDAO.getEmf().close();
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	sce.getServletContext().setAttribute("dao", new UsersDAO());
    	myLogger.info("INFO:Application listener has created a UsersDAO object");
    }
	
}
