package org.veg.vegitable;
import java.util.Scanner;
	public class Main
	{
	    double amt=0,b=0;
	    Scanner sc=new Scanner (System.in);
	     public void meth1(int a)  {
	         if(a==101) {
	             float slk = 100;
	             float clk = 0;
	             float avl;
	             System.out.println("Lady Fingers is a good choice...");
	            System.out.println("Enter  no of kg's: ");
	             int kg = sc.nextInt();
	             avl=slk-clk;
	             int m=kg*50;
	            
	             amt=amt+m;
	         }
	         if(a==201)
	         {
	             float sck=100;
	             float cck=0;
	             float avl;
	             System.out.println("Carrot is a good choice...");
	                System.out.println("Enter   no of kg's: ");
	                 int kg = sc.nextInt();
	                 System.out.println("-----------------------------");
	                 avl=sck-cck;
	                 int m=kg*41;
	                 
	                 amt=amt+m;
	         }
	         if(a==301)
	         {
	             float stk=100;
	             float ctk=0;
	             float avl;
	                 System.out.println("Tamato is a good choice...");
	                    System.out.println("Enter  no of kg's: ");
	                     int kg = sc.nextInt();
	                     System.out.println("-----------------------------");
	                     avl=stk-ctk;
	                     int m=kg*49;
	                     amt=amt+m;
	         }
	         if(a==401)
	         {
	             float spk=100;
	             float cpk=0;
	             float avl;
	             System.out.println("Potato is a good choice...");
	                System.out.println("Enter   no of kg's: ");
	                 int kg = sc.nextInt();
	                 System.out.println("-----------------------------");
	                 avl=spk-cpk;
	                 int m=kg*29;
	                 amt=amt+m;
	         }
	         
	     }
	     public void display() {
	         System.out.println("============ Welcome to Organic Stores =======");
	         System.out.println("------------------------------------------------------");
	         System.out.println("Avalible products in the store");
	         System.out.println(" 1 Lady Fingers \n 2 Carrot \n 3 Tomato \n 4 Potato");
	         System.out.println("Please enter the choice?");
	         System.out.println("---------------------------------------------------------");
	         int choice=sc.nextInt();
	         if (choice==1) {
	            System.out.println("101------Lady Fingers------1kg is 50");
	            
	            
	            int a = sc.nextInt();
	            meth1(a);
	        }
	         switch(choice) {
	         case 2:
	             System.out.println("201---------- Carrot----1kg is 41");
	             
	             int a = sc.nextInt();
	            
	             meth1(a);
	         }
	         switch(choice)
	         {
	         case 3:
	             System.out.println("301---------Tomato----1kgis 29");
	             
	             int a = sc.nextInt();
	            meth1(a);
	         }
	         switch(choice)
	         {
	         case 4:
	             System.out.println("401---------Potato----1kg is 49");
	             
	             int a = sc.nextInt();
	            meth1(a);
	         }
	         switch(choice)
	         {
	         case 5:
	             System.out.println("invalid");
	         }
	         System.out.println("if you want shopping press 1");
	        System.out.println("if you dont  want shopping press 2");
	        int b=sc.nextInt();
	        if (b==1)
	            display();
	        if (b==2)
	        {
	            System.out.println(" Before disscount total bill "+amt);
	            if (amt>=1000) {
	                double dis =(amt/100)*5;
	                amt=amt-dis;
	            System.out.println("After disscount final total bill "+amt);
	            }}
	     }
	    public static void main(String[] args) {
	        Scanner sc=new Scanner (System.in);
	        Main aobj =new Main();
	        aobj.display();
	        System.out.println("==================Thank you for shopping=========================");
	        System.out.println("===================JAVA IS AWESOME===============================");
	    }
	}


