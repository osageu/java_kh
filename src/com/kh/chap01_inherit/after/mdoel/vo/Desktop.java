package com.kh.chap01_inherit.after.mdoel.vo;

// superclass : Product
// subclass : Desktop
public class Desktop extends Product {
	
	// field
	private boolean allInOne;
	
	// constructor
	public Desktop() {
		// super(); --> 항상 superclass를 먼저 호출
	}
//	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
//		
//		this.allInOne = allInOne;
//		
//		// superclass에 접근하고자 할 때는 super.
//		// 단, 접근하고자 하는 field가 private일 경우는 직접 접근 불가
//		// super.brand = brand; --> brand가 private이라 직접 접근 X
//		
//		
//		// 1) superclass field access modifier를 protected로 변경 --> superclass에 직접 접근 가능
//		/*
//		super.brand = brand;
//		super.pCode = pCode;
//		super.pName = pName;
//		super.price = price;
//		*/
//		
//		// 2) private일 경우 --> 간접적으로나마 접근할 수 있는 setter method를 호출
//		/*
//		 * super.setBrand(brand); 
//		 * super.setpCode(pCode);
//		 * super.setpName(pName);
//		 * super.setPrice(price);
//		 */
//		// 3) superclass parameterized constructor를 호출하는 법
//		super(brand, pCode, pName, price);
//		
//	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
	}
	
	
	// method
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}
	
	// overriding
	public String info() {
		return super.info() + ", 일체 여부 : " + allInOne;
	}
	
}
