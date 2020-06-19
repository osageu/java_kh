package com.kh.chap01_inherit.model.vo;

public class Car extends Vehicle{
	
	// field
	private int tire;
	
	// constructor
	public Car() {
		
	}

	public Car(String name, double mileage, String kind, int tire) {
		super(name, mileage, kind);
		this.tire = tire;
	}
	
	// method
	// setter, getter
	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}
	
	// information (overriding)
	public String info() {
		return super.info() + ", 바퀴수 : " + tire;
	}
	
	@Override
	public void howToMove() {
		System.out.println("바퀴를 구동하며 움직인다.");
	}
}
