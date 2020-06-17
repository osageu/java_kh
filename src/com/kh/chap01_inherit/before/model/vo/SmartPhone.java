package com.kh.chap01_inherit.before.model.vo;

public class SmartPhone {

	// field
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private String mobileAgency;
	
	// constructor
	public SmartPhone() {
		
	}
	
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobileAgency = mobileAgency;
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

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	// information
	public String info() {
		return "브랜드 : " + brand + ", 제품코드 : " + pCode + ", 제품이름 : " + pName + ", 제품 가격 : " + price + ", 통신사 : " + mobileAgency;
	}
}
