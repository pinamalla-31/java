package com.java.arrays;

import java.util.Scanner;

public class TwoDArrays {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter rows and columns:");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		System.out.println("enter the values of rows and cols:");
		int[][] numbers=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				numbers[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("enter the value to find out index");
		int x=sc.nextInt();
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(numbers[i][j]==x)
				{
					System.out.println("x found at locations("+i+","+j+")");
				}
			}
		
		}
	}

}
