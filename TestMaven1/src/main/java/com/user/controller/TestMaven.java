package com.user.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.user.maven.MavenProgram;



public class TestMaven {
	public static void main(String[] args) {
		ArrayList<MavenProgram> arrayList= new ArrayList();
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		Statement statement = connection.createStatement();
		ResultSet set=statement.executeQuery("select * from employee");
		while(set.next())
		{
			MavenProgram MavenProgram=new MavenProgram(set.getInt(1), set.getString(2), set.getString(3), set.getInt(4));
			
			arrayList.add(MavenProgram);
		}
		for(MavenProgram e:arrayList)
		{
			System.out.println(e.getId()+" "+e.getName()+" "+e.getAddress()+" "+e.getZip());
		}
	} catch ( Exception e) {
	System.out.println(e);
		//e.printStackTrace();
	}
	}
}
