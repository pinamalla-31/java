package org.test.hotelbooking;

import java.util.Scanner;

public class HotelBooking {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of hotel:");
		int hotel=sc.nextInt();
		System.out.println("enter number of views:");
		int view =sc.nextInt();
		String [][] count= new String[hotel][view];
		for(int i=0;i<hotel;i++)
		{
			for(int j=0;j<view;j++)
			{
				count[i][j]=sc.next();
			}
		}
	}

}
