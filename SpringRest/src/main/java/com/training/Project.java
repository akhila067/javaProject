package com.training;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Project {
	
	@Id
	@GeneratedValue
	Long id;
	String username;
	String password;
	String confirm_password;
	Date dob;
	public Project(String username, String password, String confirm_password, Date dob) {
		super();
		this.username = username;
		this.password = password;
		this.confirm_password = confirm_password;
		this.dob = dob;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
		
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", username=" + username + ", password=" + password + ", confirm_password="
				+ confirm_password + ", dob=" + dob + "]";
	}
	
}
	
		