 package com.product.cumDao;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.connect.db.ConnectionFactory;
import com.test.Product.Electronics;
import com.test.Product.Product_Provider;
import com.test.Product.Product_info;

public class CustomerService implements CustomerDao{

	@Override
	public  double totalbilElectronics() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter username");
		String cuname=scanner.next();
		
		//Product_Provider.displayAllSecttion();
		Product_info product= new Product_info();
		ArrayList<Electronics> electronics= product.displayElectronics();
		System.out.println(electronics.size());
		double cost[]= new double[electronics.size()];
		String name[]= new String[electronics.size()];
		int pid[]=new int[electronics.size()];
		int i=0;
		double bill=0;
		for(Electronics e:electronics)	
		{
			cost[i]=e.getPrice();
			name[i]=e.getName();
			pid[i]=e.getId();
			//System.out.println(e.getId()+" \t \t "+e.getName()+" \t \t "+e.getQuantity()+" \t \t"+e.getPrice()+"\t \t  "+e.getCategory()+"\t \t "+e.getDesc());
			i++;
		}
		
		for(int j=0;j<electronics.size();j++)
		{
			System.out.println(pid[j]+" "+cost[j]+" "+name[j]);
		}
		int choice;
		int quantity = 0;
		for(int j=0;j<electronics.size();j++)
		{
			
			System.out.println("would you like to purchase "+ name[j] +" \n 1 for yes 2 for no");
			choice=scanner.nextInt();
			if(choice==1)
			{
				System.out.println("enter how much quantity you want");
				quantity=scanner.nextInt();
				bill=bill+cost[j]*quantity;
			
		}
		
	}
		try {
			Connection connection=ConnectionFactory.getConnection();
			Statement statement=connection.createStatement();
			statement.executeUpdate("insert into customer (`name`,`bille`) values('"+cuname+"','"+bill+"')");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return bill;
		
	}
}

