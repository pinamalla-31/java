package com.test.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.connect.db.ConnectionFactory;
import com.product.cumDao.CustomerDao;


public class Product_info implements ProductDao{

	@Override
	public void buyElectronics(Electronics electronincs) {
		try {
			
			Connection connection =ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs= statement.executeQuery("select * from `Product_info`.electronics");
			System.out.println("product id"+"\t"+"product_name:"+"\t"+"Product_price"+"\t"+"Product_qnty"+"\t"+"product_category"+"\t"+"product_description");
			System.out.println("========================================================================================================================");
			while(rs.next())
			{
			
				System.out.println(rs.getInt(1)+"\t"+"\t"+rs.getString(2)+"\t"+"\t"+rs.getDouble(3)+"\t"+"\t"+rs.getInt(4)+"\t"+"\t"+rs.getString(5)+"\t \t"+"\t \t"+rs.getString(6));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
		
	}

	@Override
	public void diplayKitchen() {
		
try {
			
			Connection connection =ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs= statement.executeQuery("select * from `Product_info`.kitchen");
			System.out.println("product id "+"\t"+"product_name:"+"\t"+"Product_qnty"+"\t"+"Product_price"+"\t"+"product_category"+"\t"+"product_description");
			System.out.println("=============================================================================================================================");
			while(rs.next())
			{
			
				System.out.println(rs.getInt(1)+" \t"+"\t"+rs.getString(2)+" \t "+"\t"+rs.getInt(3)+" \t"+"\t"+rs.getDouble(4)+" \t "+"\t"+"\t"+rs.getString(5)+"\t "+"\t"+rs.getString(6));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void buyCloths(Cloths cloth) {
		
try {
			
			Connection connection =ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs= statement.executeQuery("select * from `Product_info`.cloth_store");
			System.out.println("product id"+"\t"+"product_qnty"+"\t"+"product_category"+"\t"+"Product_name"+"\t"+"Product_price"+"\t"+"product_description");
			System.out.println("=========================================================================================================");
			while(rs.next())
			{
				
				System.out.println(rs.getInt(1)+" \t "+"\t"+rs.getInt(2)+" \t "+"\t"+"\t"+rs.getString(3)+" \t "+"\t"+rs.getString(4)+" \t "+"\t"+"\t"+rs.getDouble(5)+" \t "+"\t"+rs.getString(6));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	

	@Override
	public void displayBath() {
		// TODO Auto-generated method stub
try {
			
			Connection connection =ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs= statement.executeQuery("select * from `Product_info`.bath");
			System.out.println("product id is"+" \t "+"Product_quanty"+" \t "+"Product_category"+" \t"+"Product_name"+" \t "+"product_price"+"\t"+"product_description");
			System.out.println("================================================================================================================================");
			while(rs.next())
			{
				
				System.out.println(rs.getInt(1)+"\t "+"\t"+"\t"+rs.getInt(2)+"\t "+"\t"+"\t"+rs.getString(3)+"\t "+"\t"+rs.getString(4)+"\t "+"\t"+rs.getDouble(5)+" \t "+"\t"+rs.getString(6));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public ArrayList<Electronics> displayElectronics() {
		

		Connection connection =ConnectionFactory.getConnection();
		ArrayList<Electronics> list = new ArrayList<Electronics>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs= statement.executeQuery("select * from  electronics");
			
			while(rs.next())
			{
				Electronics electronics = new Electronics();
				electronics.setId(rs.getInt(1));
				electronics.setName(rs.getString(2));
				electronics.setQuantity(rs.getInt(3));
				electronics.setPrice(rs.getDouble(4));
				electronics.setCategory(rs.getString(5));
				electronics.setDesc(rs.getString(6));
				list.add(electronics);
				
			}
			return list;
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
			
		}
		return list;
		
	}

	@Override
	public void displayCloths(Cloths cloth) {
		// TODO Auto-generated method stub
		
	}

	
	}

	
	

	

