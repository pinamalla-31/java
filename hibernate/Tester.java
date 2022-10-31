package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Tester {
	public static void main(String[] args) {
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml");
		System.out.println("works");
		SessionFactory factory = configuration.buildSessionFactory();
		org.hibernate.Session session= factory.openSession();
		session.beginTransaction();
		Student student= new Student();
		student.setId(11);
		student.setName("srinivas");
		session.save(student);
		session.beginTransaction().commit();
	      
	      
	}

}
