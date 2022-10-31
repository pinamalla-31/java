package org.java.programs;

import java.util.Scanner;

public class TestPrime {
	public static void main(String[] args) {
		 int num1,num2,flag,count=0;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter  the two numbers:");
	        num1=sc.nextInt();
	        num2=sc.nextInt();
	        int i=num1;
	        while(num2>num1)
	        {
	            flag=0;
	            for(int j=2;j<=num1/2;j++)
	            {
	                if(num1%j==0)
	                {
	                    flag=1;
	                    break;
	                }
	            }
	            if((flag==0))
	            {
	            count++;
	            System.out.println(num1);
	            }
	            num1++;
	            
	        }
	        System.out.println("total number of prime number are "+count);
	    
	
	}

}
