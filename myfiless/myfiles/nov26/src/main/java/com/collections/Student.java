package com.collections;

import java.util.ArrayList;

public class Student implements Comparable<Student>{
	
	private int studentId;
	private String studentname;
	private int age;
	private String city;
	private double marks;

	public Student(int studentId, String studentname, int age, String city, double marks) {
		super();
		this.studentId = studentId;
		this.studentname = studentname;
		this.age = age;
		this.city = city;
		this.marks = marks;
	}
	public int getStudentId() {
		return studentId;
	}
	public String getStudentname() {
		return studentname;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
	public double getMarks() {
		return marks;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentname=" + studentname + ", age=" + age + ", city=" + city
				+ ", marks=" + marks + "]";
		
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.getStudentId()-this.studentId;
	}
}

