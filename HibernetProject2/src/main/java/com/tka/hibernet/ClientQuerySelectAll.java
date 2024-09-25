package com.tka.hibernet;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class ClientQuerySelectAll {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();

		cfg.addAnnotatedClass(Student.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		NativeQuery q=session.createSQLQuery("select * from student where marks >80");
		
		Query query=session.createQuery("from Student where marks >80");
		List<Student> allstudentlist=query.list();
		
	
		for (Student student : allstudentlist) {
			System.out.println(student);
		}
	}       
	
}