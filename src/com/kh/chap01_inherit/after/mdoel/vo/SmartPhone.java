package com.kh.chap01_inherit.after.mdoel.vo;

//superclass : Product
//subclass : SmartPhone
public class SmartPhone extends Product{
	
	// field
	private String mobileAgency;
	
	// constructor
	public SmartPhone() {
		
	}
	
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super(brand, pCode, pName, price);
		this.mobileAgency = mobileAgency;
	}

	// method
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	public String getMobileAgency() {
		return mobileAgency;
	}
	public String info() {
		return super.info() + ", 통신사 : " + mobileAgency;
	}
}
