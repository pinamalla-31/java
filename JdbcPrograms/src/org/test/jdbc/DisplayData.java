package org.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayData {
public static void  studentData()
{
	
		int total[]= new int[10];
		String name[]= new String[10];
		int i=0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		//System.out.println("connection sucess:"+connection);
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from student_details");
		while(rs.next())
		{
			name[i]=rs.getString(2);
			total[i]=rs.getInt(3)+rs.getInt(4);
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
			i++;
		}
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
