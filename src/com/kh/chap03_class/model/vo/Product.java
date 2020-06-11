package com.kh.chap03_class.model.vo;

// 접근 제한자 : public > protected > default > private

// 클래스 앞에 기술할 수 있는 접근제한자 : public, default
public class Product { // default : 다른 package에서 절대 접근 불가
	
	// Field
	private String pName;
	private int price;
	private String brand;
	
	// Constructor
	public Product() { // 기본 생성자
		// 출력문이 있으면 출력문도 같이 출력해줌.
	}
	
	// Method
	// setter
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// getter
	public String getpName() {
		return this.pName;
	}
	public int getPrice() {
		return this.price;
	}
	public String getBrand() {
		return this.brand;
	}
	
	// info
	public String info() {
		return pName + "\n" + price + "\n" + brand;
	}
}
