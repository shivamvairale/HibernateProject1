package com.tka.hibernet;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class ClientProjectonEx {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();

		cfg.addAnnotatedClass(Student.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(Student.class);
		
		Projection projection1 = Projections.property("name");
		Projection projection2=Projections.property("marks");
		
		ProjectionList plist=Projections.projectionList();
		plist.add(projection1);
		plist.add(projection2);
		criteria.setProjection(plist);
		
		List<Object[][]> result=criteria.list();
		
		
		
		for (Object s[] : result) {
			for (Object s1 : s) {
				System.out.print(s1+" ");
			}
			System.out.println();
			
		}
	    
	
}
}