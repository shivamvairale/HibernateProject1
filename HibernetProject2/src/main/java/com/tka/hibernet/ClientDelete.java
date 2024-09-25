package com.tka.hibernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientDelete {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		Student sobject=new Student(4, "Virat", 90);
        session.delete(sobject);		
		session.beginTransaction().commit();
		}

}