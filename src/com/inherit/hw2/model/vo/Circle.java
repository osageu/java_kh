package com.inherit.hw2.model.vo;

public class Circle extends Point{
	
	// field
	private int radius;
	
	// constructor
	public Circle() {
		
	}
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}
	
	// method
	// setter, getter
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void draw() {
		super.draw();
		System.out.printf("면적 : %.1f\n",Math.PI * radius * radius);
		System.out.printf("둘레 : %.1f\n",Math.PI * radius * 2);
	}
	
}
