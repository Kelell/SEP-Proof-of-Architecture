package intermediary;

import java.sql.*;
import gui.LoginPage;


public class Main {

	public static void main(String[] args) {  
		
	   //connect to mySQL server
		String url = "Jdbc:mysql://localhost3306/arcproof";
		String user= "root";
		String password= "aircadets123";
		
		
		try {
			//connect to the database
			@SuppressWarnings("unused")
			Connection myConn = DriverManager.getConnection(url, user, password);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	    new LoginPage();
		//new HomePage(); //for testing
		//new TrackerPage();
	    //System.exit(0);
	}  
}
