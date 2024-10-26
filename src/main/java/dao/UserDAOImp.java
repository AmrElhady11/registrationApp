package dao;

import java.sql.*;
import javax.servlet.ServletContext;

import beans.User;

public class UserDAOImp implements UserDAO {
	ServletContext context = null;
	Connection conn = null;

	public UserDAOImp(ServletContext context) {
		this.context = context;
		conn = (Connection) context.getAttribute("db-connection");
		
	}
	
	
	@Override
	public boolean addUser(User user) throws SQLException {
		try {
			
			String statement = "insert into Users_DB.Users(name,email,password)Values(?,?,?)";
			PreparedStatement pst = conn.prepareStatement(statement);
			pst.setString(1, user.getName());
			pst.setString(2, user.getEmail());
			pst.setString(3, user.getPassword());
			int result = pst.executeUpdate();
			return result==1 ? true : false;
		}
		catch(Exception e){
			return false;

			
		}
	}


	@Override
	public boolean findByEmail(String email) throws SQLException {
		String statement = "select email from Users_DB.Users where email = ?";
		PreparedStatement pst = conn.prepareStatement(statement);
		pst.setString(1,email);
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
	        return true; 
	    }
		
		return false;
	}

}
