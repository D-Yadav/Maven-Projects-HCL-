package com.pack.form;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="Patient")
	public class Login {
		@Id
	  private Integer pno;
	  private String password;
	public Integer getPno() {
		return pno;
	}
	public void setPno(Integer pno) {
		this.pno = pno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Login(Integer pno, String password) {
		super();
		this.pno = pno;
		this.password = password;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}


		  
	}
