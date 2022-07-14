package com.cts.caseStudy3.airlines.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "adminId", nullable = false)
	private int adminId;
	
	@Column(name = "a_fname", nullable = false)
	private String a_fname;
	
	@Column(name = "a_lname", nullable = false)
	private String a_lname;
	
	@Column(name = "a_phoneno", nullable = false)
	private String a_phoneno;
	
	@Column(name = "a_password", nullable = false)
	private String a_password;
	
	@Column(name = "a_email", nullable = false)
	private String a_email;

	
	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getA_fname() {
		return a_fname;
	}

	public void setA_fname(String a_fname) {
		this.a_fname = a_fname;
	}

	public String getA_lname() {
		return a_lname;
	}

	public void setA_lname(String a_lname) {
		this.a_lname = a_lname;
	}

	public String getA_phoneno() {
		return a_phoneno;
	}

	public void setA_phoneno(String a_phoneno) {
		this.a_phoneno = a_phoneno;
	}

	public String getA_password() {
		return a_password;
	}

	public void setA_password(String a_password) {
		this.a_password = a_password;
	}

	public String getA_email() {
		return a_email;
	}

	public void setA_email(String a_email) {
		this.a_email = a_email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
