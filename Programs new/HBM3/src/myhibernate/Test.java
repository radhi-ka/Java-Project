package myhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) 
	{
	 Configuration cfg=new Configuration().configure("myhibernate/emp.cfg.xml");
	 SessionFactory sf=cfg.buildSessionFactory();
     Session ses=sf.openSession();
     Transaction tx=ses.beginTransaction();
     
     EmployeeP emp=new EmployeeP();
     emp.setId(111);
     emp.setName("Maria");
     emp.setGroup("Tennis");
     ses.save(emp);
     tx.commit();
     System.out.println("Done");
     
	}

}
