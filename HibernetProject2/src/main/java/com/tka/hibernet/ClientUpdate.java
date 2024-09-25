package com.tka.hibernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientUpdate {
	
	
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		
		Student sobject = session.get(Student.class, 1);
		sobject.setMarks(80);
		sobject.setName("abhay");
		
		
		session.beginTransaction().commit();
		}
	
}
