package com.inherit.hw1.model.vo;

public class Student extends Person{
	
	// field
	private int grade;
	private String major;
	
	// constructor
	public Student() {
		
	}
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		super.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	// method
	// setter, getter
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	// information
	public String info() {
		return "이름 : " + name + super.info() + "		학년 : " + grade + "	전공 : " + major;
	}
	
	
}
