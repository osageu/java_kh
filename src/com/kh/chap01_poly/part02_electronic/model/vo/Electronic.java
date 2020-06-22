package com.kh.chap01_poly.part02_electronic.model.vo;

public class Electronic {
	
	// field
	private String brand;
	private String name;
	private int price;
	
	// constructor
	public Electronic() {
		
	}
	public Electronic(String brand, String name, int price) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	// method
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Brand : " + brand + ", Name : " + name + ", Price : " + price; 
	}
	public String print() {
		return "";
	}
}
