package com.kh.test.duck.model.vo;

public class Duck {
	
	// field
	private String name;
	private String kinds;
	
	// constructor
	public Duck() {
		
	}
	public Duck(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	
	// method
	// setter, getter
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	public String getKinds() {
		return kinds;
	}
	
	// information
	public String toString() {
		return "저는 " + kinds + "이고, 이름은 " + name + "입니다.";
	}
	
}
