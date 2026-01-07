package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="student_table")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studId;
	private String stdName;
	@OneToOne
	@JoinColumn(name="cid",referencedColumnName="courseId",unique=true)
	private String course;
	private String mobNum;
	private String email;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studId, String stdName, String course, String mobNum, String email) {
		super();
		this.studId = studId;
		this.stdName = stdName;
		this.course = course;
		this.mobNum = mobNum;
		this.email = email;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getMobNum() {
		return mobNum;
	}
	public void setMobNum(String mobNum) {
		mobNum = mobNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
