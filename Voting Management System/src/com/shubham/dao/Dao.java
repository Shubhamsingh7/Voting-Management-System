package com.shubham.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {

	Connection con;
	private String Database="voting system";

	public Connection getConnection() throws Exception {
		
		 

		String url = "jdbc:mysql://localhost:3306/"+Database;
		String user = "root";
		String password = "";
		String driver = "com.mysql.jdbc.driver";

		Class.forName(driver);

		con = DriverManager.getConnection(url, user, password);

		return con;

	}

}
