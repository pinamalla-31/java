import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Tester
{
	public static void options()
	{
		
		System.out.println("1.Insert"+"\n"+"2.Update"+"\n"+"3.Delete"+"\n"+"4.Display");
		System.out.println("choose your choice:");
		Scanner sc = new Scanner(System.in);
		int choose= sc.nextInt();
		if(choose==1)
		{
			insertData();
		}
		else if(choose==2)
		{
			updateData();
		}
		else if(choose==3)
		{
			deleteData();
		}
		else if(choose==4)
		{
			displayData();
		}
		else {
			System.out.println("you entered invalid option select again");
			options();
		}
	}
	public static void insertData()
	{
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Students.class);
		   System.out.println("works");
		   SessionFactory factory = configuration.buildSessionFactory();
	       Session session = factory.openSession();
	  
	       Transaction tx;
	      String choice="no";
	       Scanner sc= new Scanner(System.in);
		
		do {
			tx=session.beginTransaction();
			Students student = new Students();
			System.out.println("enter new student id to insert:");
			student.setId(sc.nextInt());
			System.out.println("enter the student name");
			student.setName(sc.next());
			session.save(student);
			tx.commit();
			System.out.println("one record is inserted..");
			System.out.println("do you want insert morerecords(y/n) ");
		    choice=sc.next();
		}while(choice.equalsIgnoreCase("y") | choice.equals("yes"));
		session.close();
		choice();
	  // factory.close();
	}
	
	public static void updateData()
	{
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Students.class);
		   System.out.println("works");
		   SessionFactory factory = configuration.buildSessionFactory();
	       Session session = factory.openSession();
	  
	       Transaction tx = session.beginTransaction();
	       Scanner scan= new Scanner(System.in);
	       System.out.println("enter studet id to update:");
	       Students student=(Students) session.get(Students.class,scan.nextInt());
	      if(student != null)
	      {
	    	  System.out.println("Enter new name to update:");
	    	  student.setName(scan.next());
	    	  session.update(student);
		       tx.commit();
		       session.close();
		       System.out.println("one record is updated..");
	      }
	      else {
	    	  System.out.println("no records are found enter correct student id: ");
	      }
	      choice();
	       
	}
	public static void deleteData()
	{
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Students.class);
		   System.out.println("works");
		   SessionFactory factory = configuration.buildSessionFactory();
	       Session session = factory.openSession();
	  
	       Transaction tx = session.beginTransaction();
	       Scanner scan= new Scanner(System.in);
	       System.out.println("enter studet id to delete:");
	       Students student=(Students) session.get(Students.class,scan.nextInt());
	      if(student != null)
	      {
	    	 
	    	  session.delete(student);
		       tx.commit();
		       session.close();
		       System.out.println("one record is deleted..");
	      }
	      else {
	    	  System.out.println("no records are found enter correct student id: ");
	      }
	      choice();
	}
	public static void displayData()
	{
		Students student = new Students();
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Students.class);
		   System.out.println("works");
		   SessionFactory factory = configuration.buildSessionFactory();
	       Session session = factory.openSession();
	       Transaction tx = session.beginTransaction();
	       
	       //session.save(student);
	       List<Students> std= session.createQuery("from Students", Students.class).list();
	       System.out.println("student id"+"\t" +"student Name");
	       System.out.println("-------"+"\t"+"-------------");
	       std.forEach(s->
	          
	    	   System.out.println(s.getId()+"\t \t"+s.getName()));
	       tx.commit();
		
	       choice();
	}
	
	public static void choice()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("do you want continue press 1 exit for 2");
		int chance=sc.nextInt();
		if(chance==1)
		{
			options();
		}
		else {
			System.out.println("exit.....");
		}
		
	}
  public static void main(String[] args) 
  {
	  options();
  }
}
