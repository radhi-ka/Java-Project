package test;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import beans.Workers;

public class SelectWithConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Criteria c= s.createCriteria(Workers.class);
		Criterion cr=Restrictions.eq("wname", "abc");
		c.add(cr);
		Workers ws=(Workers)c.uniqueResult();
		System.out.println(ws.getWname());
		
	}

}
