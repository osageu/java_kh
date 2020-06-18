package com.inherit.hw1.model.vo;

public class Employee extends Person{
	
	// field
	private int salary;
	private String dept;
	
	// constructor
	public Employee() {
		
	}
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		super.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	// method
	// setter, getter
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	// information
	public String info() {
		return "이름 : " + name + super.info() + "	급여 : " + salary + "	부서 : " + dept;
	}
	
	
}
