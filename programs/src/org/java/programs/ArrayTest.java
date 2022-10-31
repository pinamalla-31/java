package org.java.programs;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		int a[] = new int [5];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the values");
		for(int i=1;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("output:");
		for(int i=0;i<6;i++)
		{
			System.out.println(a[i]);
		}
	}

}
