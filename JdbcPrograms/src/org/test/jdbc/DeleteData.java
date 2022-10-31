package org.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteData {
 public static void deleteItem()
 {
	 System.out.println("enter id  value to delete:");
		int id;
		Scanner sc= new Scanner(System.in);
		id=sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			Statement statement = connection.createStatement();
			
			String query="delete from `student`.`student_details` where (id='"+id+"')";
			statement.executeUpdate(query);
			System.out.println("data deleted successfully");
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	 
 }
}
