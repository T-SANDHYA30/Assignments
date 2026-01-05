package com.project.UserApplication.Entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="user_application")

public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	@Size(message="size must be more than 3 chars")
	@NotBlank(message= "name should not be null")
	@Schema
	private String userName;
	@NotBlank
	//@Pattern(regexp="^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[#$!%*?&])[A-Za-z\d#$!%*?&]{8,}$", message="follow rules")
	private String password;
	@Pattern(regexp ="^(.+)@(\\S+)$", message ="follow rules")
	private String email;
	private String mobile;
	public Long getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public User(Long userId, String userName, String password, String email, String mobile) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", mobile=" + mobile + "]";
	}
	
	

}
