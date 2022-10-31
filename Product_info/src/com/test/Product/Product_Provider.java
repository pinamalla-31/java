package com.test.Product;

import java.util.ArrayList;
import java.util.Scanner;

import com.product.cumDao.CustomerService;

public class Product_Provider {
	static Product_info info = new Product_info();
	public static double cost1;
	public double cost2;
	public double cost3;
	public double cost4;
	public double cost5;
	public double cost6;
	public static void options()
	{
		Scanner scan= new Scanner(System.in);
		
		 System.out.println("1.Electronics"+"\n"+"2.Bath"+"\n"+"3.Kitchen"+"\n"+"4.Cloths"+"\n");
		 System.out.println("Enter your choice");
		 int choice=scan.nextInt();
		
		 if(choice==1)
		 {
		
			 electronics();
		 }
		 else if(choice==2)
		 {
			 bath();
		 }
		 else if(choice==3)
		 {
			 kitchen();
		 }
		 else if(choice==4)
		 {
			//cloths();
		 }
		 
		 else
		 {
			 System.out.println("invalid section!!!! start again");
			 options();
		 }
	}
	
	public static void electronics()
	{
		info.displayElectronics();
		System.out.println("select what you want:");
		System.out.println();
		System.out.println("1:mobile"+"\n"+"2.ac");
		Scanner sc= new Scanner(System.in);
		int choose= sc.nextInt();
		if(choose==1)
		{
			System.out.println("enter the id to select:");
			int id= sc.nextInt();
			System.out.println("enter the how much quantity you want:");
			int qty=sc.nextInt();
			System.out.println();
			double price1=20000;
			cost1=qty*price1;
			
			System.out.println("bil is:"+cost1);
		}
		else if(choose==2)
		{
			System.out.println("enter the id to select:");
			int id= sc.nextInt();
			System.out.println("enter the how much quantity you want:");
			int qty=sc.nextInt();
		}
		else {
			
		}
	}
	
	public static void bath()
	{
		info.displayBath();
		System.out.println("select what you want:");
		
		System.out.println("1.soap"+"\n"+"2.shapoo");
		Scanner sc= new Scanner(System.in);
		int choose= sc.nextInt();
		if(choose==1)
		{

			System.out.println("enter the id to select:");
			int id= sc.nextInt();
			System.out.println("enter the how much quantity you want:");
			int qty1=sc.nextInt();
		}
		else if(choose==2)
		{
			System.out.println("enter the id to select:");
			int id= sc.nextInt();
			System.out.println("enter the how much quantity you want:");
			int qty1=sc.nextInt();
		}
		else {
			
		}
	}
		
	public static void kitchen()
	{
		info.diplayKitchen();
		System.out.println("select what you want:");
		System.out.println("1.salt"+"\n"+"2.sugar");
		Scanner sc= new Scanner(System.in);
		int choose= sc.nextInt();
		if(choose==1) {
			System.out.println("enter the id to select:");
			int id= sc.nextInt();
			System.out.println("enter the how much quantity you want:");
			int qty1=sc.nextInt();
		}
		  else	if(choose==2)
		{
			System.out.println("enter the id to select:");
			int id= sc.nextInt();
			System.out.println("enter the how much quantity you want:");
			int qty1=sc.nextInt();
		}
		  else {
			  
		  }
	}
//	public static void cloths()
//	{
//		info.displayCloths();
//		System.out.println("select what you want:");
//		System.out.println("1.T-shit"+"\n"+"2.saree");
//		Scanner sc= new Scanner(System.in);
//		int choose= sc.nextInt();
//		System.out.println("enter the how much quantity you want:");
//		int qty=sc.nextInt();
//		if(choose==1)
//		{
//			System.out.println("enter the id to select:");
//			int id= sc.nextInt();
//			System.out.println("enter the how much quantity you want:");
//			int qty1=sc.nextInt();
//		}
//		else if(choose==2)
//		{
//			System.out.println("enter the id to select:");
//			int id= sc.nextInt();
//			System.out.println("enter the how much quantity you want:");
//			int qty1=sc.nextInt();
//		}
//		else {
//			
//		}
//	}
		
		
	public static void displayAllSecttion()
	{
		Product_info product= new Product_info();
		ArrayList<Electronics> electronics= product.displayElectronics();
		//System.out.println("product id"+"\t "+"product_name"+" "+"Product_price"+"\t"+"Product_qnty"+"\t"+"product_category"+"\t"+"product_description");
		for(Electronics e:electronics)	
		{
			
			System.out.println(e.getId()+" \t \t "+e.getName()+" \t \t "+e.getQuantity()+" \t \t"+e.getPrice()+"\t \t  "+e.getCategory()+"\t \t "+e.getDesc());
			
		}
	}
	
	
	
	public static void main(String[] args)
	{

		CustomerService  customerservice= new CustomerService();
	double finalbill=customerservice.totalbilElectronics();
		System.out.println("final bill is:"+finalbill);
//		Product_info product= new Product_info();
//		ArrayList<Electronics> electronics= product.displayElectronics();
//		
		
		
	}

}
