package com.pack.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.dao.HospitalDao;
import com.pack.form.Login;
import com.pack.form.Login1;
import com.pack.form.Patient;
import com.pack.form.Physician;

@Service
public class HospitalServiceImpl implements HospitalService {
	private static Logger log=Logger.getLogger(HospitalServiceImpl.class);
	private HospitalDao hospitalDao;

	public void setHospitalDao(HospitalDao hospitalDao) {
		this.hospitalDao = hospitalDao;
	}
	
	@Override
	@Transactional
	public boolean checkLogin(Login l) {
		boolean b=hospitalDao.checkLogin(l);
		return b;
	}


	@Override
	@Transactional
	public Integer enrollpatient(Patient p) {
		log.info("Inside service's enrollpatient");
		Integer Id=hospitalDao.enrollpatient(p);
		return Id;
	}

	@Override
	@Transactional
	public boolean checkLogin1(Login1 l1) {
		boolean b1=hospitalDao.checkLogin1(l1);
		return b1 ;
	}

	@Override
	@Transactional
	public Integer enrollphysician(Physician p1) {
		log.info("Inside service's enrollphysician");
		Integer Id=hospitalDao.enrollphysician(p1);
		return Id;
	}

	@Override
	@Transactional
	public Physician showphysician(Physician p2) {
		Physician b2=hospitalDao.showphysician(p2);
		return b2 ;
	}
}