package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Workers;



public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		Workers w=new Workers(123, "abc", "abc@gmail.com", 5000);
		Workers w1=new Workers(234, "bcd", "bcd@gmail.com", 8000);
		Workers w2=new Workers(345, "cde", "cde@gmail.com", 3000);
		Workers w3=new Workers(456, "efg", "efg@gmail.com", 15000);
		
		s.save(w);
		s.save(w1);
		s.save(w2);
		s.save(w3);
		 
		tx.commit();
		s.close();
		sf.close();
		System.out.println("insertion completed successfully");

	}

}
