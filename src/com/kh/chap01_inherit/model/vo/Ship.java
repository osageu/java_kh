package com.kh.chap01_inherit.model.vo;

public class Ship extends Vehicle{
	
	// field
	private int propeller;
	
	// constructor
	public Ship() {
		
	}

	public Ship(String name, double mileage, String kind, int propeller) {
		super(name, mileage, kind);
		this.propeller = propeller;
	}
	
	// method
	// setter, getter
	public int getPropeller() {
		return propeller;
	}

	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}
	
	// information
	public String info() {
		return super.info() + ", 프로펠러수 : " + propeller;
	}

}
