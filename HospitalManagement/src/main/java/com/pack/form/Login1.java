package com.pack.form;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="Physician")
	public class Login1 {
		@Id
	  private Integer PhyNo;
	  private String password;
	public Integer getPhyNo() {
		return PhyNo;
	}
	public void setPhyNo(Integer PhyNo) {
		this.PhyNo = PhyNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Login1(Integer PhyNo, String password) {
		super();
		this.PhyNo = PhyNo;
		this.password = password;
	}
	public Login1() {
		super();
		// TODO Auto-generated constructor stub
	}


		  
	}
