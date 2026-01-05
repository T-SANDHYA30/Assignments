package com.project.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_tab")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long uid;
	private String uname;
	private String pwd;
	private String role;
	private String email;
	private String mobnum;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String uname, String pwd, String role, String email, String string) {
		super();
		this.uname = uname;
		this.pwd = pwd;
		this.role = role;
		this.email = email;
		this.mobnum = string;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobnum() {
		return mobnum;
	}
	public void setMobnum(String mobnum) {
		this.mobnum = mobnum;
	}
	public Long getUid() {
		// TODO Auto-generated method stub
		return null;
	}
	
	


}
