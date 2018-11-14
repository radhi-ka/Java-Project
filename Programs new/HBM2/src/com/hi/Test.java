package com.hi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration cfg=new Configuration().configure("com/hi/hibernate.cfg.xml");
SessionFactory sf=cfg.buildSessionFactory();
Session ses= sf.openSession();
Transaction tx=ses.beginTransaction();
Employee e=new Employee();
e.setEmpid(111);
e.setEmpName("keerthi");
e.setEmpPos("Developer");
e.setEmpsal(90000);

ses.save(e);
tx.commit();
System.out.println("Success");


	}

}
