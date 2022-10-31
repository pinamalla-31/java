package org.java.inheritance;
class Bike{
	public void start()
	{
		System.out.println("start with kick");
	}
}
class RoyalEnfield extends Bike{
	public void kick ()
	{
		System.out.println("royalenfeild start with self start and ");
	}
}
public class Inheritance {
	
public static void main(String[] args) {
	
	RoyalEnfield  royal= new RoyalEnfield();
	royal.kick();
}
}