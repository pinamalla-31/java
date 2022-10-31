package com.test.concepts;

import java.util.*;

public class Provider 
{
	public static void options()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your choice:");
		System.out.println("1.Insert"+"\n"+"2.Display"+"\n"+"3.Delete"+"\n"+"4.Update");
		int choice= sc.nextInt();
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
		System.out.println("Enter your name password");
		employee.setUsername(scanner.next());
		employee.setPassword(scanner.next());
		EmployeeService service=new EmployeeService();
		service.addEmployee(employee);
		
	}
	public static void displayData()
	{
		EmployeeService emp= new EmployeeService();
		emp.displayEmployee();
		
	}
	
	public static void deleteData()
	{
		Scanner scan = new Scanner(System.in);
		Employee emp = new Employee(); 
		System.out.println("Enter the  employee ID to delete");
        emp.setId(scan.nextInt());
    	EmployeeService empDel = new EmployeeService();
		empDel.deleteEmployee(emp);
		
	}
	public static void updateData()
	{
		Scanner sc= new Scanner(System.in);
		Employee empUp = new Employee();
		System.out.println(" Enter the Employee Id to update the details ");
		empUp.setId(sc.nextInt());
		System.out.println("Enter new username to update");
		empUp.setUsername(sc.next());
		EmployeeService empUpdate = new EmployeeService();
		//empUpdate.displayEmployee();
		empUpdate.updateEmployee(empUp);
		}
	
	public static void main(String[] args) {
		
		//Provider.addData();
		//Provider.displayData();
		//Provider.deleteData();
		Provider.options();
		
		
		
		
		
		
	}

}
