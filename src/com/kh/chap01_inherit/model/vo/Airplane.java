package com.kh.chap01_inherit.model.vo;

public class Airplane extends Vehicle{
	
	// field
	private int tire;
	private int wing;
	
	// constructor
	public Airplane() {
		
	}

	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}
	
	// method
	// setter, getter
	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}
	
	// information
	public String info() {
		return super.info() + ", 바퀴수 : " + tire + ", 날개수" + wing;
	}
	
	// new method
	@Override
	public void howToMove() {
		System.out.println("바람을 가르며 날아간다.");
	}
	
}
