package com.test.java;

import java.util.Scanner;

public class Anagram_Program {
	public static void main(String[] args) {
		//user input
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the  first String value:");
	String str1 =sc.next();
	System.out.println("Enter the second String value:");
	String str2=sc.next();
	str1.compareTo(str2); //comparing to two strings 
	if(str1==str2)
	{
		System.out.println("str1 and str2 are anagrams");
	}
	else
	{
		System.out.println("str1 and str2 are not anagram");
	}
	}

}
