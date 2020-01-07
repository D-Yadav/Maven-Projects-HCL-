package com.pack.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Physician",schema="test")
public class Physician {

	@Id
	@Column(name="phyNo")
	private Integer phyNo;	
	
	@NotEmpty
	@Column(name="firstName")
	@Size(min=2,max=30)	
private String firstName;
	
	@NotEmpty
	@Column(name="lastName")
	@Size(min=2,max=30)
private String lastName;
	
	@NotEmpty
	@Column(name="dept")
	@Size(min=2,max=30)
private String dept;
	
	@NotEmpty
	@Column(name="educationalQualification")
	@Size(min=2,max=30)
	private String educationalQualification;
	
	

	@NotEmpty
	@Column(name="state")
	@Size(min=2,max=30)
	private String state;


	@NotEmpty
	@Column(name="InsurancePlan")
	@Size(min=2,max=30)
private String insurancePlan;

	@NotEmpty
	@Column(name="pw")
	@Size(min=4,max=8)
	private String password;
	
	public Integer getphyNo() {
		return phyNo;
	}
	public void setphyNo(Integer phyNo) {
		this.phyNo = phyNo;
	}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getEducationalQualification() {
	return educationalQualification;
}
public void setEducationalQualification(String educationalQualification) {
	this.educationalQualification = educationalQualification;
}

public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getInsurancePlan() {
	return insurancePlan;
}
public void setInsurancePlan(String insurancePlan) {
	this.insurancePlan = insurancePlan;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


public Physician() {
	super();
	// TODO Auto-generated constructor stub
}
public Physician(Integer phyNo, String firstName, String lastName, String dept, String educationalQualification,
		String state, String insurancePlan, String password) {
	super();
	this.phyNo = phyNo;
	this.firstName = firstName;
	this.lastName = lastName;
	this.dept = dept;
	this.educationalQualification = educationalQualification;

	this.state = state;
	this.insurancePlan = insurancePlan;
	this.password = password;
}



}
