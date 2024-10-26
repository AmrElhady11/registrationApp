package dao;
import java.sql.SQLException;
import beans.User;

public interface UserDAO {
	public boolean addUser(User user) throws SQLException; 
	public boolean findByEmail(String email) throws SQLException; 
	

}
