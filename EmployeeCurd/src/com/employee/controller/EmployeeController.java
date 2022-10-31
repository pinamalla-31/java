package com.employee.controller;

import java.util.Scanner;

import com.employee.model.Employee;
import com.employee.service.EmployeeServiceImpl;



public class EmployeeController {
	
	
	public static void options()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your choice:");
		System.out.println("1.Insert"+"\n"+"2.Display"+"\n"+"3.Delete"+"\n"+"4.Update");
		int choice= sc.nextInt();
		EmployeeServiceImpl service= new EmployeeServiceImpl();
			switch(choice)
			{
			case 1:
				addData();
				System.out.println("====================");
				options();
			
				break;
			case 2:
				displayData();
				System.out.println("====================");
				options();
			
				break;
			case 3:
				deleteData();
				System.out.println("====================");
				options();
				
				break;
			case 4: 
				updateData();
				System.out.println("====================");
				options();
				
				break;
			 default:
				 System.out.println("you enterd invalid number please choose again");
				 options();
					
				 break;
			}
		}

		public static void addData()
		{
			Scanner scanner=new Scanner(System.in);
			Employee employee =new Employee();
			System.out.println("Enter your id");
			
			employee.setId(scanner.nextInt());
			System.out.println("Enter your name");
			employee.setName(scanner.next());
		
			System.out.println("Enter your lname");
			employee.setLname(scanner.next());
			System.out.println("Enter your address");
			
			employee.setAddress(scanner.next());
			
			
			EmployeeServiceImpl service=new EmployeeServiceImpl();
			service.addEmployee(employee);
			
		}
		public static void displayData()
		{
			EmployeeServiceImpl emp= new EmployeeServiceImpl();
			emp.displayEmployee();
			
		}
		
		public static void deleteData()
		{
			Scanner scan = new Scanner(System.in);
			Employee emp = new Employee(); 
			System.out.println("Enter the  employee ID to delete");
	        emp.setId(scan.nextInt());
	    	EmployeeServiceImpl empDel = new EmployeeServiceImpl();
			empDel.deleteEmployee(emp);
			
		}
		public static void updateData()
		{
			Scanner sc= new Scanner(System.in);
			Employee empUp = new Employee();
			System.out.println(" Enter the Employee Id to update the details ");
			empUp.setId(sc.nextInt());
			System.out.println("Enter new username to update");
			empUp.setName(sc.next());
			empUp.setAddress(sc.next());
			EmployeeServiceImpl empUpdate = new EmployeeServiceImpl();
			//empUpdate.displayEmployee();
			empUpdate.updateEmployee(empUp);
			}
		
	

	
	public static void main(String[] args) {
		
		options();
		
	}
	

}
