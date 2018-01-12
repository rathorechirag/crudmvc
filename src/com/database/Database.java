package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Database {
	Connection con=null;
	
	
	
	
	
	
	
	public Connection gconnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		return con;
		
	}
}

