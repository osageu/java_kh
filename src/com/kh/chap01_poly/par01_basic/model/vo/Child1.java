package com.kh.chap01_poly.par01_basic.model.vo;

public class Child1 extends Parent{
	
	// field
	private int z;
	
	// constructor
	public Child1() {
		
	}
	public Child1(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	
	// method
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public void printChild1() {
		System.out.println("난 Child1이야~~♧");
	}
	
	
	
}
