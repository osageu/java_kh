package com.kh.chap03_map.part01_hashMap.mode.vo;

/**
 * @author user1
 *
 */
public class Snack {
	
	// field
	private String flavor;
	private int calory;
	
	// constructor
	public Snack() {
		
	}
	public Snack(String flavor, int calory) {
		super();
		this.flavor = flavor;
		this.calory = calory;
	}
	
	// method
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getCalory() {
		return calory;
	}
	public void setCalory(int calory) {
		this.calory = calory;
	}
	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calory=" + calory + "]";
	}
	
}
