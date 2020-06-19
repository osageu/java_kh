package com.kh.chap01_inherit.model.vo;

public class Vehicle {
	
	// field
	private String name;
	private double mileage;
	private String kind;
	
	// constructor
	public Vehicle() {
		
	}
	
	public Vehicle(String name, double mileage, String kind) {
		this.name = name;
		this.mileage = mileage;
		this.kind = kind;
	}

	// method
	// setter, getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	// information
	public String info() {
		return "이름 : " + name + ", 연비 : " + mileage + ", 종류 : " + kind;
	}
	
	// new method
	public void howToMove() {
		System.out.println("움직인다.");
	}
	
}
