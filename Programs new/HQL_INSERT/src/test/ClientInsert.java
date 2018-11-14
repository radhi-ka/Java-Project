package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.OldStudent;

public class ClientInsert {

	public static void main(String[] args) {
		
	Configuration cfg= new Configuration();
	cfg.configure("resources/Hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s= sf.openSession();
	Transaction tx=s.beginTransaction();
	
	OldStudent OS1= new OldStudent(1, "sai", "sai@gmail.com");
	OldStudent OS2= new OldStudent(2, "sail", "sail@gmail.com");
	OldStudent OS3= new OldStudent(3, "sailu", "sailu@gmail.com");
	
	s.save(OS1);
s.save(OS2);
s.save(OS3);

tx.commit();
sf.close();
	
	
		
		
	}
}
