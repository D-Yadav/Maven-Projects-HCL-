package com.pack.form;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

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
	
	@Email(message="Enter valid email")
	@Column(name="Mail")
	private String email;
	

    
	@Column(name="ContactNo")
	private Long contactNo;
	
	@NotEmpty
	@Column(name="pw")
	@Size(min=4,max=8)
	private String password;
	
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
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Patient(Integer pno, String firstName, String lastName, String email, Long contactNo, String password) {
		super();
		this.pno = pno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNo = contactNo;
		this.password = password;
	}
	
}
