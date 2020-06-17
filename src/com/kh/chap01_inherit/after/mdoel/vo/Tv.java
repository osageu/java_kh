package com.kh.chap01_inherit.after.mdoel.vo;

//superclass : Product
//subclass : Tv
public class Tv extends Product {
	
	// field
	private int inch;
	
	// constructor
	public Tv() {
		
	}
	
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		super(brand, pCode, pName, price);
		this.inch = inch;
	}

	// method
	public void setInch(int inch) {
		this.inch = inch;
	}
	public int getInch() {
		return inch;
	}
	
	// information
	public String info() {
		return super.info() + ", 화면 크기 : " + inch;
	}
}
