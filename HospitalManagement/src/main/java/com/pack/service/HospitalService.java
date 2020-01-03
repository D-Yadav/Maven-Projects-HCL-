package com.pack.service;

import com.pack.form.Login;
import com.pack.form.Patient;

public interface HospitalService {
	
	public boolean checkLogin(Login l);
	public void enrollpatient(Patient p);
	

}
