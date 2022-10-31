package com.java.shope;

import java.util.Scanner;

public class Grocery {
	static double totalPrice;
	static double totalCost1;
	static double totalCost2;
	static double totalCost3;
	static double totalCost4;
	static double totalCost5;
	static double totalCost6;
	static double totalCost7;
	static double totalCost8;
	static double totalCost9;
	static double Budget;
	
 public static void choice()
 {
	 Scanner scan= new Scanner(System.in);
	 System.out.println("enter your choice");
	 System.out.println("1.Electronics"+"\n"+"2.Bath"+"\n"+"3.Kitchen"+"\n"+"4.Cloths"+"\n"+"5.Others");
	 int choice=scan.nextInt();
	 System.out.println("Enter your Budget:");
	 double Budget=scan.nextDouble();
	 switch(choice)
	 {
	 case 1:
		 System.out.println("welcome to Electronics Store");
		 electronicItems();
		 break;
		 
	 case 2:
		 System.out.println("welcome to Bath Store");
		 bathStore();
		 break;
		 
	 case 3:
		 System.out.println("Welcome to Kitchen store " );
		 kitchenStore();
		 break;
	 case 4:
		 System.out.println("Welcome to Cloths store");
		 clothStore();
		 break;
	 case 5:
		 System.out.println("welcome to other store");
		 otherStore();
		 break;
		 default:
			 System.out.println("you entered invalid data please select again..");
			 break;
		 
	 }
	
 }
 public static void electronicItems()
 {
	 System.out.println("select what do you want:"+"\n"+"1.Mobiles"+"\n"+"2.AC's"+"\n"+"3.exit");
	 Scanner sc = new Scanner(System.in);
	 int select= sc.nextInt();
	 if(select==1)
	 { 
		 int itemId=121;
		 long itemCost=25000;
		 int totalStock= 10;
		 System.out.println("itemId is:"+itemId+"\n"+"itemCost is:"+itemCost+"\n"+"totalStock is:"+totalStock);
		 System.out.println("enter how many you want:");
		 Scanner scanner= new Scanner(System.in);
		 int want= sc.nextInt();
		 int avalQty=totalStock-want;
	       totalCost1=want*itemCost;
     	 System.out.println("itemId is:"+itemId+"\n"+"itemCost is:"+itemCost+"\n"+"you have selected:"+want+"piece"+"\n"+"totalcost is:"+totalCost1);
		 electronicItems();
		 choice();
		 
	 }
	 else if(select==2)
	 { 
		 int itemId=123;
		 long itemCost=85000;
		 int totalStock= 5;
		 System.out.println("itemId is:"+itemId+"\n"+"itemCost is:"+itemCost+"\n"+"totalStock is:"+totalStock);
		 System.out.println("enter how many you want:");
		 Scanner scanner= new Scanner(System.in);
		 int want= sc.nextInt();
		 int avalQty=totalStock-want;
		  totalCost2=want*itemCost;
		 System.out.println("itemId is:"+itemId+"\n"+"itemCost is:"+itemCost+"\n"+"you have selected:"+want+"piece"+"\n"+"totalcost is:"+totalCost2);
		 electronicItems();
		 choice();
	 }
	 else if(select==3)
	 {
			totalPrice=totalCost1+totalCost2+totalCost3+totalCost4+totalCost5+totalCost6+totalCost7+totalCost8+totalCost9;
			
			if(Budget>=totalPrice)
			{
				System.out.println("shopping bill is :"+totalPrice);
			}
			else {
				System.out.println(" sorry!!! your Budget is less than shopping Bill try again...");
			}
		 System.out.println("thank you..");
	 }
	 else
	 {
		System.out.println("ivalid input  select again........");
	 }
	
 }
 public static void bathStore()
 {
	 System.out.println("select what do you want:"+"\n"+"1.Soap's"+"\n"+"2.Shapoo's"+"\n"+"3.exit");
	 Scanner sc = new Scanner(System.in);
	 int select= sc.nextInt();
	 if(select==1)
	 { 
		 int itemId=112;
		 long itemCost=20;
		 int totalStock= 20;
		 System.out.println("itemId is:"+itemId+"\n"+"itemCost is:"+itemCost+"\n"+"totalStock is:"+totalStock);
		 System.out.println("enter how many you want:");
		 Scanner scanner= new Scanner(System.in);
		 int want= sc.nextInt();
		 int avalQty=totalStock-want;
		 totalCost3=want*itemCost;
		 System.out.println("itemId is:"+itemId+"\n"+"itemCost is:"+itemCost+"\n"+"you have selected:"+want+"piece"+"\n"+"totalcost is:"+totalCost3);
		 bathStore();
		 choice();
		 
	 }
	 else if(select==2)
	 { 
		 int itemId=158;
		 long itemCost=10;
		 int totalStock= 5;
		 System.out.println("itemId is:"+itemId+"\n"+"itemCost is:"+itemCost+"\n"+"totalStock is:"+totalStock);
		 System.out.println("enter how many you want:");
		 Scanner scanner= new Scanner(System.in);
		 int want= sc.nextInt();
		 int avalQty=totalStock-want;
		 totalCost4=want*itemCost;
		 System.out.println("itemId is:"+itemId+"\n"+"itemCost is:"+itemCost+"\n"+"you have selected:"+want+"piece"+"\n"+"totalcost is:"+totalCost4);
		 bathStore();
		 choice();
		 
	 }
	 else if(select==3)
	 {
		 totalPrice=totalCost1+totalCost2+totalCost3+totalCost4+totalCost5+totalCost6+totalCost7+totalCost8+totalCost9;
			
			if(Budget>=totalPrice)
			{
				System.out.println("shopping bill is :"+totalPrice);
			}
			else {
				System.out.println(" sorry!!! your Budget is less than shopping Bill try again...");
			}
		 System.out.println("thank you..");
	 }
	 else
	 {
		 System.out.println("ivalid input  select again........");
	 }
	 
 }
 public static void kitchenStore()
 {
	 System.out.println("select what do you want:"+"\n"+"1.salt"+"\n"+"2.sugar's"+"\n"+"3.exit");
	 Scanner sc = new Scanner(System.in);
	 int select= sc.nextInt();
	 if(select==1)
	 { 
		 int itemId=1;
		 long itemCost=20;
		 int totalStock= 20;
		System.out.println("itemId is:"+itemId+"\n"+"itemCost is:"+itemCost+"\n"+"totalStock is:"+totalStock);
		 System.out.println("enter how many you want:");
		 Scanner scanner= new Scanner(System.in);
		 int want= sc.nextInt();
		 int avalQty=totalStock-want;
		  totalCost4=want*itemCost;
		 System.out.println("itemId is:"+itemId+"\n"+"itemCost is:"+itemCost+"\n"+"you selected:"+want+"kgs"+"\n"+"totalcost is:"+totalCost4);
		 kitchenStore();
		 choice();
		 
	 }
	 else if(select==2)
	 { 
		 int itemId=158;
		 long itemCost=10;
		 int totalStock= 5;
		 System.out.println("itemId is:"+itemId+"\n"+"itemCost is:"+itemCost+"\n"+"totalStock is:"+totalStock);
		 System.out.println("enter how many you want:");
		 Scanner scanner= new Scanner(System.in);
		 int want= sc.nextInt();
		 int avalQty=totalStock-want;
		  totalCost5=want*itemCost;
		 System.out.println("itemId is:"+itemId+"\n"+"itemCost is:"+itemCost+"\n"+"you have selected:"+want+"kgs"+"\n"+"totalcost is:"+totalCost5);
		 kitchenStore();
		 choice();
		 
	 }
	 else if(select==3)
	 {totalPrice=totalCost1+totalCost2+totalCost3+totalCost4+totalCost5+totalCost6+totalCost7+totalCost8+totalCost9;
		
		if(Budget>=totalPrice)
		{
			System.out.println("shopping bill is :"+totalPrice);
		}
		else {
			System.out.println(" sorry!!! your Budget is less than shopping Bill try again...");
		}
	 System.out.println("thank you..");
	 }
	 else
	 {
		 System.out.println("ivalid input  select again........");
	 }
	 
 }
 public static void clothStore()
 {
	 System.out.println("select what do you want:"+"\n"+"1.T-shirt"+"\n"+"2.Lehanga"+"\n"+"3.exit");
	 Scanner sc = new Scanner(System.in);
	 int select= sc.nextInt();
	 if(select==1)
	 { 
		 int itemId=116;
		 long itemCost=150;
		 int totalStock= 20;
		System.out.println("itemId is:"+itemId+"\n"+"itemCost is:"+itemCost+"\n"+"totalStock is:"+totalStock);
		 System.out.println("enter how many you want:");
		 Scanner scanner= new Scanner(System.in);
		 int want= sc.nextInt();
		 int avalQty=totalStock-want;
		  totalCost6=want*itemCost;
		 System.out.println("itemId is:"+itemId+"\n"+"itemCost is:"+itemCost+"\n"+"you selected:"+want+"kgs"+"\n"+"totalcost is:"+totalCost6);
		 clothStore();
		 choice();
		 
	 }
	 else if(select==2)
	 { 
		 int itemId=117;
		 long itemCost=2000;
		 int totalStock= 15;
		 System.out.println("itemId is:"+itemId+"\n"+"itemCost is:"+itemCost+"\n"+"totalStock is:"+totalStock);
		 System.out.println("enter how many you want:");
		 Scanner scanner= new Scanner(System.in);
		 int want= sc.nextInt();
		 int avalQty=totalStock-want;
		 totalCost7=want*itemCost;
		 System.out.println("itemId is:"+itemId+"\n"+"itemCost is:"+itemCost+"\n"+"you have selected:"+want+"kgs"+"\n"+"totalcost is:"+totalCost7);
		 clothStore();
		 choice();
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 else if(select==3)
	 {
		 totalPrice=totalCost1+totalCost2+totalCost3+totalCost4+totalCost5+totalCost6+totalCost7+totalCost8+totalCost9;
			
			if(Budget>=totalPrice)
			{
				System.out.println("shopping bill is :"+totalPrice);
			}
			else {
				System.out.println(" sorry!!! your Budget is less than shopping Bill try again...");
			}
		 System.out.println("thank you..");
	 }
	 else
	 {
		 System.out.println("ivalid input  select again........");
	 }
 }
 
 public static void otherStore()
 {

	 System.out.println("select what do you want:"+"\n"+"1.Pen's"+"\n"+"2.Books"+"\n"+"3.exit");
	 Scanner sc = new Scanner(System.in);
	 int select= sc.nextInt();
	 if(select==1)
	 { 
		 int itemId=201;
		 long itemCost=3;
		 int totalStock= 20;
		System.out.println("itemId is:"+itemId+"\n"+"itemCost is:"+itemCost+"\n"+"totalStock is:"+totalStock);
		 System.out.println("enter how many you want:");
		 Scanner scanner= new Scanner(System.in);
		 int want= sc.nextInt();
		 int avalQty=totalStock-want;
		  totalCost8=want*itemCost;
		 System.out.println("itemId is:"+itemId+"\n"+"itemCost is:"+itemCost+"\n"+"you selected:"+want+"kgs"+"\n"+"totalcost is:"+totalCost8);
		 otherStore();
		 choice();
		 
	 }
	 else if(select==2)
	 { 
		 int itemId=202;
		 long itemCost=20;
		 int totalStock= 15;
		 System.out.println("itemId is:"+itemId+"\n"+"itemCost is:"+itemCost+"\n"+"totalStock is:"+totalStock);
		 System.out.println("enter how many you want:");
		 Scanner scanner= new Scanner(System.in);
		 int want= sc.nextInt();
		 int avalQty=totalStock-want;
		  totalCost9=want*itemCost;
		 System.out.println("itemId is:"+itemId+"\n"+"itemCost is:"+itemCost+"\n"+"you have selected:"+want+"kgs"+"\n"+"totalcost is:"+totalCost9);
		 otherStore();
		 choice();
		 
	 }
	 else if(select==3)
	 {
		 totalPrice=totalCost1+totalCost2+totalCost3+totalCost4+totalCost5+totalCost6+totalCost7+totalCost8+totalCost9;
			
			if(Budget>=totalPrice)
			{
				System.out.println("shopping bill is :"+totalPrice);
			}
			else {
				System.out.println(" sorry!!! your Budget is less than shopping Bill try again...");
			}
		 System.out.println("thank you..");	 
		 }
	 else
	 {
		 System.out.println("ivalid input  select again........");
	 }

 }
	
public static void main(String[] args) {
	Grocery grocery= new Grocery();
	choice();
	grocery.electronicItems();
	grocery.kitchenStore();
	grocery.bathStore();
	grocery.clothStore();
}
}
