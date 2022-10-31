package org.test.jdbc;

import java.util.Scanner;

public class MenuBased {
	public static void main(String[] args) {
		System.out.println("what you want to perform!");
		System.out.println("1---> Display");
		System.out.println("2---> insert data");
		System.out.println("3---> Delete");
		System.out.println("4--->Update");
		int choice;
		Scanner scanner= new Scanner(System.in);
		choice=scanner.nextInt();
		if(choice==1)
		{
			DisplayData.studentData();
		}
		else if(choice==2)
		{
			InsertValues.insertData();
		}
		else if(choice==3)
		{
			DeleteData.deleteItem();
		}
	}

}
