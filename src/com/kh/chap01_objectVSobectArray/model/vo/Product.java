package com.kh.chap01_objectVSobectArray.model.vo;

public class Product {
	
		// Field
		private String name;
		private String brand;
		private int price;
		
		// Constructor
		public Product() {
			
		}
		public Product(String name, String brand, int price) {
			this.name = name;
			this.brand = brand;
			this.price = price;
		}
		
		// Method
		// setter
		public void setName(String name) {
			this.name = name;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		// getter
		public String getName() {
			return name;
		}
		public String getBrand() {
			return brand;
		}
		public int getPrice() {
			return price;
		}

		// information
		public String info() {
			return "이름 : " + name + ", " + "브랜드 : " + brand + ", " + "가격 : " + price;
		}
	
}
