package com.onlineShopping.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="user_profile")
public class UserRegistration 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String address;
	
	@Column(name="email", unique=true,columnDefinition = "VARCHAR(255)")
	private String email;
	private long phonenumber;
	private String password;
	private String confirmpassword;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "user_profile")
	@JsonManagedReference
	private UserLogin userlogin;
	
	
	public UserLogin getUserlogin() {
		return userlogin;
	}
	public void setUserlogin(UserLogin userlogin) {
		this.userlogin = userlogin;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "UserRegistration [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email
				+ ", phonenumber=" + phonenumber + ", password=" + password + ", confirmpassword=" + confirmpassword
				+ ", userlogin=" + userlogin + "]";
	}
	
	
	
}
