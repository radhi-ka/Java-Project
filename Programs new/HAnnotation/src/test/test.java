package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			

			Configuration cfg =new Configuration().configure("resources/Student.cfg.xml");
			
			SessionFactory sf=cfg.buildSessionFactory();
			
			Session ses=sf.openSession();
			
			Transaction ts=ses.beginTransaction();
			Student std=new Student();
			
			Student std1=(Student)ses.get(Student.class,8);
			
			
			/*Student std=new Student(8,"keethu","kapoor");*/
			
			/*std.setId(5);
			std.setFname("pallavi");
			std.setLname("k");*/
			/*ses.save(std);*/
			
			//System.out.println(std1);*/
			
			std1.setFname("ritesh");
			std1.setLname("kour");
			ses.update(std1);
			
			
			/*ses.delete(std1);*/
			ts.commit();
			System.out.println("success");
			ses.close();
		}
			
		
	}

