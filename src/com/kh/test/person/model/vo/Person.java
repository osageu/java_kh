package com.kh.test.person.model.vo;

public class Person {
	
	// field
	private String name;
	private char gender;
	
	// constructor
	public Person() {
		
	}
	public Person(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	
	// method
	// setter , getter
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	
	
}
