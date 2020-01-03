package com.pack.service;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.pack.dao.HospitalDao;
import com.pack.form.Login;
import com.pack.form.Patient;

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
	public void enrollpatient(Patient p) {
		log.info("Inside service's enrollpatient");
		hospitalDao.enrollpatient(p);
		
	}
}