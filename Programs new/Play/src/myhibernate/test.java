package myhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 Configuration cfg=new Configuration().configure("myhibernate/Player.cfg.xml");
			 SessionFactory sf=cfg.buildSessionFactory();
		     Session ses=sf.openSession();
		     Transaction tx=ses.beginTransaction();
		     
		     Player pd=new Player();
		     pd.setPname("Keerthi");
		     pd.setPcountry("Spain");
		     pd.setPranking(1);
		     //Player pd1=(Player)ses.get(Player.class, 6);
		     /*System.out.println(pd1);
		     Playerdetails pd2=(Playerdetails)ses.load(Playerdetails.class, 2);
		     System.out.println(pd2);*/
		     //pd1.setPname("Maria Sharapova");
		     ses.save(pd);
		     tx.commit();
		     System.out.println("Done");

	}

}
