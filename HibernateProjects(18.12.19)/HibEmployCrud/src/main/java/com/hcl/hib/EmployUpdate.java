package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmployUpdate {

	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		int empno=1;
		Query q=s.createQuery("from Employ WHERE Empno=" + empno);
		List<Employ>lstEmploy=q.list();
		Employ res=lstEmploy.get(0);
		
		Transaction t=s.beginTransaction();
		res.setName("Linky Tinky");
		res.setDept("Music");
		res.setDesig("Trainer");
		res.setBasic(9999);
		s.update(res);
		t.commit();
		System.out.println("*** Employ Updated...");

	}

}
