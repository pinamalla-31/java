package com.dbs.connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static  Connection connection = null;

	public static Connection  getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			return connection;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return connection;
	}

}
