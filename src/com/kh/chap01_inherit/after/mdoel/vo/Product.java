package com.kh.chap01_inherit.after.mdoel.vo;

public class Product extends Object {
	
	// three class가 공통적으로 가지고 있었던 field
	private String brand;				// 브랜드
	private String pCode;			// 상품코드
	private String pName;			// 상품명
	private int price;					// 가격
	
	// constructor
	public Product() {
		
	}
	
	public Product (String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	// method
	// setter, getter
	public void setBrand (String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setpCode (String pCode) {
		this.pCode = pCode;
	}
	
	public String getpCode() {
		return pCode;
	}
	
	public void setpName (String pName) {
		this.pName = pName;
	}
	
	public String getpName() {
		return pName;
	}
	
	public void setPrice (int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	// information
	public String info() {
		return "브랜드 : " + brand + ", 제품코드 : " + pCode + ", 제품이름 : " + pName + ", 제품 가격 : " + price;
	}
	
}
