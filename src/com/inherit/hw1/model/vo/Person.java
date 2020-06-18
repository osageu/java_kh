package com.inherit.hw1.model.vo;

public class Person {
	
	// field
	protected String name;
	private int age;
	private double height;
	private double weight;
	
	// constructor
	public Person() {
		
	}
	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// method
	// setter, getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	// information
	public String info() {
		return "	나이 : " + age + "	키 : " + height + "	몸무게" + weight;
	}
	
}
