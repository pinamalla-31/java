package org.prog.insurance;

import java.util.Scanner;

public  class Insurance implements InsurancePolicy   //  here InsurancePolicy interface implemented  in Insurance class 
{  

	// override
	public void vehicle()    // here we overriding  a vehicle method which is declared in the  InsurancePolicy Interface
	{

		double monthlyPremium = 2000;                            //  vehicle attribute 
		Scanner sc= new Scanner(System.in);                         // user choice for tenure period
		System.out.println("Enter your  Tenure period");
		int tenure=sc.nextInt();
		double estimateCost = monthlyPremium * tenure;
		System.out.println("Enter the present year only(e.g:1999):");
		int date=sc.nextInt();
		
		int maturitydate =date+tenure;
		
		//display the values of vehicle insurance (yearPremium,tenure, estimationcost and maturitydate)
		
		System.out.println("Monthly Premium:" + monthlyPremium + "\n" + " Tenure period:" + tenure + " years " + "\n"       
				+ "Estimation Cost is:" + estimateCost + "\n" + "Maturity Date is:" + maturitydate);
		System.out.println(" ");
	}
@Override
	public void life() {                   //here we overriding a life method which is declared in the InsurancePolicy interface
	
		double yearPremium = 4000;            //life attribute
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Tenure period");
		int tenure=sc.nextInt();
		double estimateCost = yearPremium * tenure;
		System.out.println("Enter the present year only(e.g:1999):");
		int date=sc.nextInt();
		
		int maturitydate =date+tenure;
		
	// display the values of life insurance (yearPremium,tenure, estimationcost and maturitydate)
		
		System.out.println("year Premium:" + yearPremium + "\n" + "Tenure period:" + tenure + "years" + "\n"
				+ "Estimation Cost is:" + estimateCost + "\n" + "Maturity Date is:" + maturitydate);
		System.out.println(" ");

	}

//	@Override
	public void health() {                                 // here we overriding a health method which is declared in InsurancePolicy interface
		double yearPremium = 3000;
		Scanner sc= new Scanner(System.in);                  //health attribute
		System.out.println("Enter your Tenure period");
		int tenure=sc.nextInt();
		double estimateCost = yearPremium * tenure;
		System.out.println("Enter the present year only(e.g:1999):");
		int date=sc.nextInt();
		int maturitydate =date+tenure;
		//display the values of health insurance (yearPremium,tenure, estimationcost and maturitydate)
		
		System.out.println("year Premium:" + yearPremium + "\n" + " Tenure period:" + tenure + "years" + "\n"
				+ "Estimation Cost is:" + estimateCost + "\n" + "Maturity Date is:" + maturitydate);
		System.out.println(" ");

	}
	
	

}
