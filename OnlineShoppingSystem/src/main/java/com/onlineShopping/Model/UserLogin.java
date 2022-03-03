package com.onlineShopping.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="login")
public class UserLogin 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	
	
    @Column(name = "password")
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="email")
	@JsonBackReference
	private UserRegistration user_profile;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserLogin [password=" + password + "]";
	}
	
}
