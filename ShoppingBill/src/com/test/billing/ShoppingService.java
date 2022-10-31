package com.test.billing;

import java.sql.Connection;
import java.sql.Statement;

import com.dbs.connect.ConnectionFactory;



public class ShoppingService implements ShoppingDao {

	@Override
	public void displayProducts() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProducts(Shopping items) {
		try {
			Connection con = ConnectionFactory.getConnection();
			Statement statement = con.createStatement();
			statement.executeUpdate("insert into employee(`id`,`product_name`,`cost`,`qnty`,`totalPrice`) values('"+items.getId()+"','"+items.getProduct_name()+"','"+items.getCost()+"','"+items.getQnty()+"','"+items.getTotalPrice()+"')");
			
			//System.out.println("data inserted");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Override
	public void deleteProducts(Shopping items) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProducts(Shopping items) {
		// TODO Auto-generated method stub
		
	}

}
