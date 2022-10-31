package com.test.concepts;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.db.connect.ConnectionFactory;

public class EmployeeService implements EmployeeDao{

	@Override
	public void displayEmployee() {
		
		try {
			Connection con= ConnectionFactory.getConnection();
			Statement statement = con.createStatement();
			ResultSet rs= statement.executeQuery("select * from `student`.employee");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

	@Override
	public void addEmployee(Employee employee) {
		try {
			Connection con = ConnectionFactory.getConnection();
			Statement statement = con.createStatement();
			statement.executeUpdate("insert into employee(`id`,`name`,`lname`,`addre`) values('"+employee.getUsername()+"','"+employee.getPassword()+"')");
			System.out.println("data inserted");
		}
		catch(Exception e)
		{
		System.out.println(e);
		
	}
	}

	

	@Override
	public void deleteEmployee(Employee employee) {
		try {
			Connection con = ConnectionFactory.getConnection();
			Statement statement = con.createStatement();
			//Employee employee = null;
			statement.executeUpdate("delete from `student`.`employee` where id='"+employee.getId()+"'");
			System.out.println(" deleted sucessfully..");
	       }
		catch(Exception e)
		{
			System.out.println(e);
			}
	
	
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		try {
			Connection con = ConnectionFactory.getConnection();
			Statement statement = con.createStatement();
			statement.executeUpdate("update `student`.`employee` set name='"+emp.username+"' where id='"+emp.getId()+"'");
			System.out.println("data updated...");
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	
}


