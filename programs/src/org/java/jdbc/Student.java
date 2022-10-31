package org.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class Student {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver found");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			System.out.println("connection sucess"+connection);
			
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
