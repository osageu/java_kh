package com.polymorphism.practice2.model.vo;

public class Cat extends Animal{
	
	// field
	private String location;
	private String color;
	
	// constructor
	public Cat() {
		
	}
	public Cat(String name, String kind, String location, String color) {
		super(name, kind);
		this.location = location;
		this.color = color;
	}
	
	// method
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public void speak() {
		System.out.println(super.toString() + location + "에 서식하며, 색상은 " + color + "입니다.");
	}
	@Override
	public void configure() {
		System.out.println("고양이");
	}
	
}
