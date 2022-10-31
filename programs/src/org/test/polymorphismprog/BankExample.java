package org.test.polymorphismprog;

class Bank
{
	double getRateOfInterest()
	{
		return 0;
	}
}
class HDFC extends Bank
{
	double getRateOfInterest()
	{
		return 2.2;
	}
}
class SBI extends Bank
{
	double getRateOfInterest()
	{
		return 3.9;
	}
}


public class BankExample {
	public static void main(String[] args) {
		Bank b;
		b= new HDFC();
		System.out.println("HDFC Rate Of Interest:"+b.getRateOfInterest());
		b=new SBI();
		System.out.println("SBI Rate Of Interest:"+b.getRateOfInterest());
		
	}

}
