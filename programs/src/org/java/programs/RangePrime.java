package org.java.programs;

import java.util.Scanner;

public class RangePrime {
public static void main(String[] args) {
	int num1,num2;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the min range:");
	num1=sc.nextInt();
	System.out.println("enter the max range:");
	num2=sc.nextInt();
	for(int i=num1;i<=num2;i++)
	{
		int count=0;
		
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				count++;
				
			}
		}
	   if(count==2)
	   {
		   System.out.println("given number is  prime"+i);
	   }
	   else
	   {
		   System.out.println("given number is not a prime "+i);
	   }
	   System.out.println();
	   System.out.println("total number of prime numbers:"+count);
	}
	
}
}
