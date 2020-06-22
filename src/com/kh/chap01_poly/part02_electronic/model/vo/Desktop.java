package com.kh.chap01_poly.part02_electronic.model.vo;

public class Desktop extends Electronic{
	
	// field
	public static final String CPU = "intel";
	private String graphic;
	
	// constructor
	public Desktop() { 
		
	}
	public Desktop(String brand, String name, int price, String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}
	
	// method
	public String getGraphic() {
		return graphic;
	}
	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}
	@Override
	public String toString() {
		return super.toString() + ", CPU : " + CPU + ", Graphic : " + graphic;
	}
	@Override
	public String print() {
		return graphic;
	}
	
}
