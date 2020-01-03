package com.pack.dao;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import com.pack.form.Login;
import com.pack.form.Patient;

public class HospitalDaoImpl implements HospitalDao {
	private static Logger log=Logger.getLogger(HospitalDaoImpl.class);
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public boolean checkLogin(Login l) {
		boolean b=false;
		Query q=sessionFactory.getCurrentSession().createQuery("from Admin l where l.adminId=:id and l.password=:pwd");
		q.setParameter("id",l.getPno());
		q.setParameter("pwd",l.getPassword());
		Patient c=(Patient)q.uniqueResult();
		if(c!=null)
		b=true;
		return b;
	}

	@Override
	public void enrollpatient(Patient p) {
		// TODO Auto-generated method stub
		log.info("Inside dao's enroll patient");
		sessionFactory.getCurrentSession().save(p);
	}
	
	
}
