import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Tester {
public static void main(String[] args) {
	Configuration configuration= new Configuration();
	configuration.configure("employee.cfg.xml");
	System.out.println("works");
	 SessionFactory factory = configuration.buildSessionFactory();
     Session session = factory.openSession();
     Transaction tx=session.beginTransaction();
     Employee employee = new Employee();
     employee.setId(1);
     employee.setEname("deepika");
     session.save(employee);
     
     tx.commit();
     
	
      
}
}
