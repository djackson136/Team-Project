package ProjectCode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	public static Connection connect() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://35.202.73.103:3306/Customer";
<<<<<<< HEAD
			String username = "root"; // "daiv"
			String password = "teamdatabase"; // "project"
			conn = DriverManager.getConnection(url, username, password);
=======
			String username = "daiv"; // "daiv"
			String password = "project"; // "project"
			Connection conn = DriverManager.getConnection(url, username, password);
>>>>>>> branch 'master' of https://github.com/djackson136/Team-Project.git
			return conn;
		} catch (Exception e) {
			System.out.println("Connection Failed");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
		
	}

}
