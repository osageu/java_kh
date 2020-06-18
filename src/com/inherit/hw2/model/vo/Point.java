package com.inherit.hw2.model.vo;

public class Point {
	
	// field
	private int x;
	private int y;
	
	// constructor
	public Point() {
		
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// method
	// setter, getter
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
	public void draw() {
		System.out.println("(x, y) : (" + x + ", " + y + ")");
	}
}
