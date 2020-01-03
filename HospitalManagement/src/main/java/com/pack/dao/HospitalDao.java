package com.pack.dao;

import com.pack.form.Login;
import com.pack.form.Patient;

public interface HospitalDao {
	public boolean checkLogin(Login l);
	public void enrollpatient(Patient p);
}
