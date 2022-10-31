package org.java.programs;

import java.util.Scanner;

public class Shimla {
	public static void main(String args[])
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("select the hotel for given below");
		System.out.println(" enter 1 shimala hotel:");
		System.out.println("enter 2 for mumbai hotel:");
		
		int num=sc.nextInt();
		switch(num)
		{
		
		case 1: 
			System.out.println(" you have selected shimala ");
			Scanner scan= new Scanner(System.in);
			System.out.println("enter the number of children:");
			int child=scan.nextInt();
			System.out.println("enter the  child age:");
			int childAge=scan.nextInt();
			System.out.println("enter the number of adult:");
			int adult=scan.nextInt();
			System.out.println("enter the  adult age:");
			int adultAge=scan.nextInt();
			if(adultAge>10)
			{
				System.out.println("no.of adults: "+adult);
				
				if(childAge<10)
				{
					System.out.println("no.of childs: "+child);
				}
			}
		
			Scanner scan1= new Scanner(System.in);
			System.out.println("choose your room if Ac enter 1  :");
			System.out.println("choose your room if non-Ac enter 2   :");
			int n,price;
			int num1=scan1.nextInt();
			switch(num1)
			{
			case 1:
				System.out.println(" you have choosen AC room  for :3000");
				if(child>2)
				{
				 if(child%2==0)
				 {
					 n=child/2;
					 System.out.println("Number of rooms ="+n);
					 System.out.println("cost of  rooms = "+(price=n*3000));
				 }
				}
				if(adult>2)
				{
				 if(adult%2==0)
				 {
					 n=adult/2;
					 System.out.println("Number of rooms ="+n);
					 System.out.println("cost of  rooms = "+(price=n*3000));
				 }
				}
				break;
				
			case 2:
				System.out.println(" you have choosen nonAC room for:2500" );
				if(child>2)
				{
				 if(child%2==0)
				 {
					 n=child/2;
					 System.out.println("Number of rooms ="+n);
					 System.out.println("cost of  rooms = "+(price=n*2500));
				 }
				}
				if(adult>2)
				{
				 if(adult%2==0)
				 {
					 n=adult/2;
					 System.out.println("Number of rooms ="+n);
					 System.out.println("cost of  rooms = "+(price=n*2500));
				 }
				}

				break;
				default:
					System.out.println("no room are choosen");
					
		}
		break;
		
		
		case 2:
			System.out.println("you have selected mumbai hotel:");
			Scanner scan2= new Scanner(System.in);
			System.out.println("enter the number of children:");
			int child1=scan2.nextInt();
			System.out.println("enter the  child age:");
			int childAge1=scan2.nextInt();
			System.out.println("enter the number of adult:");
			int adult1=scan2.nextInt();
			System.out.println("enter the  adult age:");
			int adultAge1=scan2.nextInt();
			if(adultAge1>10)
			{
				System.out.println("no.of adults: "+adult1);
				
				if(childAge1<10)
				{
					System.out.println("no.of childs: "+child1);
				}
			}
		
			Scanner scanner= new Scanner(System.in);
			System.out.println("choose your room if Ac enter 1  :");
			System.out.println("choose your room if non-Ac enter 2   :");
			int n1,price1;
			int num2=scanner.nextInt();
			switch(num2)
			{
			case 1:
				System.out.println(" you have choosen AC room  for :2000");
				if(child1>2)
				{
				 if(child1%2==0)
				 {
					 n=child1/2;
					 System.out.println("Number of rooms ="+n);
					 System.out.println("cost of  rooms = "+(price=n*2000));
				 }
				}
				if(adult1>2)
				{
				 if(adult1%2==0)
				 {
					 n=adult1/2;
					 System.out.println("Number of rooms ="+n);
					 System.out.println("cost of  rooms = "+(price=n*2000));
				 }
				}
				break;
				
			case 2:
				System.out.println(" you have choosen nonAC room for:1800" );
				if(child1>2)
				{
				 if(child1%2==0)
				 {
					 n1=child1/2;
					 System.out.println("Number of rooms ="+n1);
					 System.out.println("cost of  rooms = "+(price=n1*1800));
				 }
				}
				if(adult1>2)
				{
				 if(adult1%2==0)
				 {
					 n1=adult1/2;
					 System.out.println("Number of rooms ="+n1);
					 System.out.println("cost of  rooms = "+(price1=n1*1800));
				 }
				}

				break;
				default:
					System.out.println("you not choosen any room");
			}		
		}
	}
}