package com.kh.chap01_poly.par01_basic.model.vo;

public class Child2 extends Parent{
	
	// field
	private int n;
	
	// constructor
	public Child2() {
		
	}
	public Child2(int x, int y, int n) {
		super(x,y);
		this.n = n;
	}
	
	// method
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public void printChild2() {
		System.out.println("난 Child2야~~♤");
	}
	
	
}
