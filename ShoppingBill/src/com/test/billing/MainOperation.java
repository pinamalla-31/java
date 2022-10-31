package com.test.billing;

import java.util.Scanner;

public class MainOperation {
	
	public static void shopping()
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Select to your choice:");
		System.out.println("1.AddToCart"+"\n"+"2.Display"+"\n"+"3.deleteItem"+"\n"+"4.updateItem");
		int option = scan.nextInt();
		if(option==1)
		{
			options();
		} 
		if(option==2)
		{
			
		}
	}
	public static void options()
	{
		Scanner scan= new Scanner(System.in);
		 System.out.println("Enter your choice");
		 System.out.println("1.Electronics"+"\n"+"2.Bath"+"\n"+"3.Kitchen"+"\n"+"4.Cloths"+"\n"+"5.Others");
		 int choice=scan.nextInt();
		 System.out.println("Enter your Budget:");
		 double Budget=scan.nextDouble();
		 if(choice==1)
		 {
			 
			 
			 
			 
			 //addItems();
			
		 }
		 else if(choice==2)
		 {
			 
		 }
		 else if(choice==3)
		 {
			 
		 }
		 else if(choice==4)
		 {
			 
		 }
		 else if(choice==5)
		 {
			 
		 }
		 else
		 {
			 
		 }
	}
	public static void addItems()
	{
		
		
		
	}
	
	
	public static void main(String[] args) {
		options();
		
	}

}
