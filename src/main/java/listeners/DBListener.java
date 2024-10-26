package listeners;

import java.sql.Connection;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import db.DBConnection;

/**
 * Application Lifecycle Listener implementation class DBListener
 *
 */
@WebListener
public class DBListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
	 public DBListener() {
	        // TODO Auto-generated constructor stub
	    }

		/**
	     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	     */
	    public void contextDestroyed(ServletContextEvent sce)  { 
	    	
	    	DBConnection.closeConnection();
	         // TODO Auto-generated method stub
	    }

		/**
	     * @see ServletContextListener#contextInitialized(ServletContextEvent)
	     */
	    public void contextInitialized(ServletContextEvent sce)  { 
	    	ServletContext servletContext = sce.getServletContext();
	    	Connection connection = DBConnection.openConnection();
	    	servletContext.setAttribute("db-connection", connection);

			
			

	    	
	    }
		
	}
