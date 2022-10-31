package org.user.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.user.model.Employee;

public class Tester {
	public static void main(String[] args) {
		ArrayList<Employee> arrayList= new ArrayList();
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet set=statement.executeQuery("select * from employee");
		while(set.next())
		{
			Employee employee=new Employee();
			employee.setId(set.getInt(1));
			employee.setName(set.getString(2));
			employee.setAddress(set.getString(3));
			employee.setZip(set.getInt(4));
			arrayList.add(employee);
		}
		
		for(Employee e:arrayList)
		{
			System.out.println(e.getId()+" "+e.getName()+" "+e.getAddress()+" "+e.getZip());
		}
	} catch ( Exception e) {
	System.out.println(e);
		//e.printStackTrace();
	}
	}

}
