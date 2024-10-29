package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
public static Connection connection = null;
	
	public static Connection openConnection() {
		try {
				 String dbURL = "jdbc:mysql://localhost:3306/Users_DB";
				 String UserName = "root";
				 String password = "admin";

			Class.forName("com.mysql.jdbc.Driver");
                        connection = DriverManager.getConnection(dbURL,UserName,password);
            	
            return connection ;
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		
	}
	
		
		
	}
	
	public static void closeConnection(){
        
		if(connection!=null) {
		
		try {
			
            connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	
		}

}

}
