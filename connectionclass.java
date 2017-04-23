package com.niit.database;

import java.sql.*;


public class connectionclass {
	
	public static void main(String []args) throws Exception {
		//1.load the database drivers
 
		Class.forName("org.h2.Driver");
				
		//2.establish the connection
			
		String url="jdbc:h2:tcp://localhost/~/test";
				Connection conn = DriverManager.getConnection(url, "sa", "");
				
		Statement st=conn.createStatement();
		String query="insert into employee values(101,'rahul','cse')";
		st.executeUpdate(query);

		conn.close();
				
				
	}
	

}
