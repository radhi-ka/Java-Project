package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Workers;

public class SelectAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
Criteria c=s.createCriteria(Workers.class);
List<Workers> wlist=c.list();
for(Workers w:wlist) {
	System.out.println("Name: " + w.getWname());
}
	
	}

}
