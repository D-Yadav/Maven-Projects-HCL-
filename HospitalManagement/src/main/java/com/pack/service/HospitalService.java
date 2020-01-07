package com.pack.service;

import com.pack.form.Login;
import com.pack.form.Login1;
import com.pack.form.Patient;
import com.pack.form.Physician;

public interface HospitalService {
	
	public boolean checkLogin(Login l);
	public Integer enrollpatient(Patient p);
	public boolean checkLogin1(Login1 l1);
	public Integer enrollphysician(Physician p1);
	public Physician showphysician(Physician p2);

}
