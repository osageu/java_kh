package com.polymorphism.practice2.model.vo;

public abstract class Animal {
	
	// field
	private String name;
	private String kinds;
	
	// constructor
	protected Animal() {
		
	}
	protected Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	
	// method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKinds() {
		return kinds;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	@Override
	public String toString() {
		return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다.";
	}
	public abstract void speak();
	public void configure() {
		
	}
	
}
