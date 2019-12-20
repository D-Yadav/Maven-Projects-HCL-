package com.hcl.hib;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DepartmentSearch {
	public static void main(String[] args) {
		
		
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		int Deptno=1;
		Query q=s.createQuery("from Department Where Deptno="+Deptno);
		List<Department>lstDepartment=q.list();
		Department e=lstDepartment.get(0);
		System.out.println("Deptno "+e.getDeptno());
		System.out.println("DName "+e.getDname());
		System.out.println("Loc "+e.getLoc());
		System.out.println("city "+e.getCity());
		System.out.println("head "+e.getHead());
		
	}

}
