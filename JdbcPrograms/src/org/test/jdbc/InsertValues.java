package org.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertValues {
	public static void insertData() {
		System.out.println("enter values:");
		String name;
		int marks,java;
		Scanner sc= new Scanner(System.in);
		//id=sc.nextInt();
		name=sc.next();
		marks=sc.nextInt();
		java =sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			Statement statement = connection.createStatement();
			
			String query="INSERT INTO `student`.`student_details` (`name`, `marks`, `java`) VALUES ('"+name+"', '"+ marks+"', '"+java+"')";
			statement.executeUpdate(query);
			System.out.println("data inserted successfully");
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
	}

}
