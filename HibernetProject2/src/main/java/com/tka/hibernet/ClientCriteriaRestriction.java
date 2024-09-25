package com.tka.hibernet;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class ClientCriteriaRestriction {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();

		cfg.addAnnotatedClass(Student.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(Student.class);
		
		criteria.add(Restrictions.gt("marks",80));
// 		criteria.add(Restrictions.like("name","virat"));
		
		List<Student> allstudentlist = criteria.list();
		
		for (Student student : allstudentlist) {
			System.out.println(student);
		}
	}

}
     