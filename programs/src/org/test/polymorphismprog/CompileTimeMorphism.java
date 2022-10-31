package org.test.polymorphismprog;

public class CompileTimeMorphism {
	public static void  show(int a, char ch)
	{
		System.out.println("integer :"+ a +" character:"+ch);
	}  
   public static void show(int a,int b)
   {
	   System.out.println("interger:"+ a + " interger:"+b  );
   }
   public static void show(double i, String s)
   {
	   System.out.println("double value:"+ i + " string value:"+s);
	   
   }
   public static void main(String[] args) {
	   CompileTimeMorphism  co = new CompileTimeMorphism ();
	   co.show(10, 'a');
	   co.show(100, 50);
	   co.show(35.99, "apple");
}
}
