package com.tka.hibernet;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientCriteriaExselectAll {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();

		cfg.addAnnotatedClass(Student.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(Student.class);
		
		List<Student> allstudentlist = criteria.list();
		
		for (Student student : allstudentlist) {
			System.out.println(student);
		}
	}
}               


