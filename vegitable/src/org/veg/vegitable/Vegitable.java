package org.veg.vegitable;


import java.util.Scanner;
public class Vegitable

{
	public static double  sum;
	
    public  static void onion()
    {
     int stock=150;
     System.out.println("enter how much quantity you want");
     Scanner scan =new Scanner(System.in);
        int kg=scan.nextInt();
        System.out.println("you have choosen onion: "  +kg+ " kgs");
        int amt=kg*100;
        System.out.println("price is :" +amt);
        int aval=stock-kg;
        System.out.println("avaliable stock is:" +aval);
        sum=sum+amt;
        //System.out.println(am);
    }
    public  static void tamato()
    {
     int stock=100;
     System.out.println("enter how much quantity you want ");
     Scanner scan =new Scanner(System.in);
        int kg=scan.nextInt();
        System.out.println("you have choosen tamato"+kg);
        int amt=kg*50;
        System.out.println("price is:"+amt);
        int aval=stock-kg;
        sum=sum+amt;
        //System.out.println(am);
    }
    public  static void carrot()
    {
     int stock=200;
     System.out.println("enter how much quantity you want ");
     Scanner scan =new Scanner(System.in);
        int kg=scan.nextInt();
        System.out.println("you have choosen carrot" + kg +"kgs");
        int amt=kg*30;
        int aval=stock-kg;
        sum=sum+amt;
        //System.out.println(am);
    }
    public static void potato()
    {
    	int stock=50;
        System.out.println("enter how much quantity you want ");
        Scanner scan =new Scanner(System.in);
           int kg=scan.nextInt();
           System.out.println("you have choosen potato"+kg);
           int amt=kg*20;
           
           int aval=stock-kg;
           sum=sum+amt;
           //System.out.println(am);
    }

   public static void main(String[] args) {
	   Vegitable veg=new Vegitable();
	 
	   System.out.println("select your vegitables what do you want ");
	   System.out.println("1.Onion kg 100 rupees");
	   System.out.println("2.Tamato kg 50 rupees");
	   System.out.println("3.Carrot kg 30 rupees");
	   System.out.println("4.Potato kg 20 rupees");
	   while(true)
	   {
	   Scanner scan=new Scanner(System.in);
	   int choice=scan.nextInt();
	   switch(choice)
	   {
	   case 1:
		   if(choice==1)
		   {
			   onion();
			   
		   }
		   break;
	   case 2:
		   if(choice==2)
		   {
			   tamato();
		   }
		   break;
	   case 3:
		   if(choice==3)
		   {
			   carrot();
		   }
		   break;
	   case 4:
		   if(choice==4)
		   {
			   potato();
		   }
		   break;
		   default:
			   System.out.println("inavalid value you entered please check");
			   break;
			      
	   }
	   
			   
	   System.out.println("if you want continue press 1");
	   System.out.println("do you want exit press 2");
       
       int want=scan.nextInt();
       if (want==1)
       {
    	   continue;
       }
       else {
    	   System.out.println(" thank you.............");
    	   System.out.println("total bill is:"+sum);
    	   break;
       }
    	   
       }
          
       
           
            
    }



}