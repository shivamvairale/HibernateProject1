package com.tka.hibernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientInsertotoMapping {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();

		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Address.class);
		SessionFactory Factory = cfg.buildSessionFactory();
		Session session = Factory.openSession();

		Address address = new Address(8, "pune", "mh", 12);

		Student sobject = new Student(12, "dhoni", 76);
		sobject.setAddress(address);

		
		session.save(sobject);
		session.save(address);

		session.beginTransaction().commit();
		System.out.println("thanku");
	}  
	 
}