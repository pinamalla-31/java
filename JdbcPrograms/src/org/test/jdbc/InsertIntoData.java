package org.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertIntoData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			Statement statement = connection.createStatement();
			String query="insert into student_details values(3,'test',87,98)";
			statement.executeUpdate(query);
			System.out.println("data inserted");
		} catch (Exception e) {
		System.out.println(e);
		}
		
	}

}
