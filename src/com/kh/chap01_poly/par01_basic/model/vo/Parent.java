package com.kh.chap01_poly.par01_basic.model.vo;

public class Parent {
	
	// field
	private int x;
	private int y;
	
	// constructor
	public Parent() {
		
	}
	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// method
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void printParent() {
		System.out.println("난 Parent야~~♡");
	}
	
	
}
