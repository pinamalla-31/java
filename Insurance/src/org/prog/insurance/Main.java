package org.prog.insurance;
import java.util.Scanner;
public class Main {
	
	static Scanner scan=new Scanner(System.in);	
public static void main(String[] args) throws Exception
{
	
   System.out.println("what type of insurance do you want");
   System.out.println(" ");
   options();                           //call the method (it shows options to user)
   
	
}
public static void options()       // method for insurance options (user choice)
{
	System.out.println("enter 1 for vehicle insurance");
	System.out.println("enter 2 for life insurance");
	System.out.println("enter 3 for health insurance");
	
	int  choice =scan.nextInt();                  
	
	
	Insurance insurance=new Insurance();   //  created a Insurance class object 
	if(choice==1)
	{
		insurance.vehicle();              // Call the vehicle  method (from the Insurance class) by using insurance object
		repeat();                         
	}
	else if(choice==2)
	{
		insurance.life();                // Call the life  method (from the Insurance class) by using insurance object
		repeat();                        
	}
	else if(choice==3)
	{
		insurance.health();           // Call the health  method (from the Insurance class) by using insurance object
		repeat();
	}
	else
	{
		System.out.println("invalid option selected please select again");
		options();
	}
	 
}
public static void repeat()                                //created method for repeat and exit from the process(user choice)
{
 System.out.println("do un want to continue press 1 ");
 System.out.println("Do you want exit press any key except 1");
 int want=scan.nextInt();
 if(want==1) 
	   {
	 options();                                          //call the method for repeat the process
	   }
  
	   
 
 else {
	 System.out.println("Thank you......");
 }
}
}
