package org.java.programs;

import java.util.Scanner;

public class PrimeTest {
	public static void main(String[] args) {
		int num,i,usha=0,c=0;
		System.out.println("enter the value:");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		for(i=2;i<num-1;i++)
		{
		 if(num%i==0)	
		 {
			 c++;
			 usha=3;
			 
		 }
		}
		System.out.println(c);
		if(usha==3)
		{
			System.out.println("number is not a prime");
		}
		else {
			System.out.println("prime number");
		}
	}

}
