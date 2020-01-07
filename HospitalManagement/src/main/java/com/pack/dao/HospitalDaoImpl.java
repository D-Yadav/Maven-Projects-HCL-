package com.pack.dao;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.pack.form.Login;
import com.pack.form.Login1;
import com.pack.form.Patient;
import com.pack.form.Physician;

@Repository
public class HospitalDaoImpl implements HospitalDao {
	private static Logger log=Logger.getLogger(HospitalDaoImpl.class);
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public boolean checkLogin(Login l) {
		boolean b=false;
		Query q=sessionFactory.getCurrentSession().createQuery("from Patient p where p.pno=:id and p.password=:pwd");
		q.setParameter("id",l.getPno());
		q.setParameter("pwd",l.getPassword());
		Patient c=(Patient)q.uniqueResult();
		if(c!=null)
		b=true;
		return b;
	}

	@Override
	public Integer enrollpatient(Patient p) {
		// TODO Auto-generated method stub
		log.info("Inside dao's enroll patient");
		Integer Id=(Integer)sessionFactory.getCurrentSession().save(p);
		return Id;
	}
	

		@Override
		public boolean checkLogin1(Login1 l1) {
			// TODO Auto-generated method stub
			boolean b1=false;
			Query q1=sessionFactory.getCurrentSession().createQuery("from Physician p1 where p1.phyNo=:id and p1.password=:pwd");
			q1.setParameter("id",l1.getPhyNo());
			q1.setParameter("pwd",l1.getPassword());
			Physician c1=(Physician)q1.uniqueResult();
			if(c1!=null)
			b1=true;
			return b1;
		}

		@Override
		public Integer enrollphysician(Physician p1) {
			// TODO Auto-generated method stub
			log.info("Inside dao's enroll Physician");
			Integer Id1=(Integer)sessionFactory.getCurrentSession().save(p1);
			return Id1;
		}

		@Override
		public Physician showphysician(Physician p2) {
			// TODO Auto-generated method stub
			
			Query q2=sessionFactory.getCurrentSession().createQuery("from Physician p2 where p2.State=:state and p2.dept=:dept and p2.InsurancePlan=:insurancePlan");
			q2.setParameter("state",p2.getState());
			q2.setParameter("dept",p2.getDept());
			q2.setParameter("insurancePlan",p2.getInsurancePlan());
			Physician c1=(Physician)q2;
			
			return c1;
		}
		
}
