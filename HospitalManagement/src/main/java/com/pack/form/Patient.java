package com.pack.form;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Patient",schema="test")
public class Patient {
	@Id
	@Column(name="pno")
	private Integer pno;
	@NotEmpty
	@Column(name="firstName")
	@Size(min=2,max=30)
	private String firstName;
	@NotEmpty
	@Column(name="lastName")
	@Size(min=2,max=30)
	private String lastName;
	@Email
	@Column(name="Mail")
	@Size(min=2,max=30)
	private String email;
	@NotEmpty
	@Column(name="ContactNo")
	@Size(min=5,max=10)
	private Integer contactNo;
	@NotEmpty
	@Column(name="DOB")
	@DateTimeFormat(pattern="yyyyMMdd")
	private Date dob;
	@NotEmpty
	@Column(name="pw")
	@Size(min=8,max=30)
	private String password;
	public Patient(Integer pno, String firstName, String lastName, String email, Integer contactNo, Date dob,
			String password) {
		super();
		this.pno = pno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNo = contactNo;
		this.dob = dob;
		this.password = password;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getPno() {
		return pno;
	}
	public void setPno(Integer pno) {
		this.pno = pno;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getContactNo() {
		return contactNo;
	}
	public void setContactNo(Integer contactNo) {
		this.contactNo = contactNo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
