package com.kh.chap01_inherit.before.model.vo;

public class Desktop {
	
	// field
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private boolean allInOne;
	
	// constructor
	public Desktop() {
		
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
	}
	
	// method 
	// setter, getter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	// information
	public String info() {
		return "브랜드 : " + brand + ", 제품코드 : " + pCode + ", 제품이름 : " + pName + ", 제품 가격 : " + price + ", 일체 여부 : " + allInOne;
	}
	
}
