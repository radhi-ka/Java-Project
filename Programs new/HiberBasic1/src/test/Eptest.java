package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Emp1;

public class Eptest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
				cfg.configure("resources/emp1.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		

		Emp1 emp=new Emp1();
		emp.setEmp1id(1);
		emp.setEmp1name("keer");
		emp.setEmp1sal(5000);
		
		s.save(emp);
		tx.commit();
		System.out.println("Success");
		
	}
}
