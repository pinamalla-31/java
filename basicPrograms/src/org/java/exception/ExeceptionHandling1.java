package org.java.exception;

import java.util.Scanner;

public class ExeceptionHandling1 {
	public static void main(String[] args) {
		Scanner scan= new  Scanner(System.in);
		System.out.println("enter the values:");
		int a,b,c;
		try {
			a=scan.nextInt();
			b=scan.nextInt();
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("please do proper input"+e);
			 ExeceptionHandling1.main(args);
		}
		
	}

}
