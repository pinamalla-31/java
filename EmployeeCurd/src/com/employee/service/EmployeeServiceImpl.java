package com.employee.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import com.employee.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public void addEmployee(Employee employee) {
		
		ArrayList<Employee> arrayList= new ArrayList();
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1", "root", "root");
			Statement statement = connection.createStatement();
			ResultSet set=statement.executeQuery("select * from employee2");
			while(set.next())
			{
				Employee employee1=new Employee();
				employee.setId(set.getInt(1));
				employee.setName(set.getString(2));
				employee.setAddress(set.getString(4));
				employee.setLname(set.getString(3));
				arrayList.add(employee);
			}
			for(Employee e:arrayList)
			{
				System.out.println(e.getId()+" "+e.getName()+" "+e.getAddress()+" "+e.getLname()+" "+e.getAddress());
			}
		 
		 } catch ( Exception e)
		 {
         System.out.println(e);
			
		}
	}
	@Override
	public void deleteEmployee(Employee emp) {
		
		try {
			Employee employee = new Employee();
				 Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1", "root", "root");
	
		
			Statement statement = connection.createStatement();
			//Employee employee = null;
			statement.executeUpdate("delete from `employee1`.`employee2` where id='"+employee.getId()+"'");
		
	       }
		catch(Exception e)
		{
			System.out.println(e);
			}
	
	
	}

	@Override
	public void updateEmployee(Employee employee) {
		
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1", "root", "root");
			Statement statement = connection.createStatement();
			Employee employee1= new Employee();
			statement.executeUpdate("update `employee1`.`employee2` set name='"+employee1.lname+"','"+employee1.name+"' where id='"+employee1.getId()+"'");
		
			System.out.println("data updated...");
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	@Override
	public void displayEmployee() {
	
			try {
				Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1", "root", "root");
				
				Statement statement = connection.createStatement();
				ResultSet rs= statement.executeQuery("select * from `employee1`.employee2");
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
			
	}
	
		
	}
	
		

