package com.polymorphism.practice2.model.vo;

public class Dog extends Animal{
	
	// field
	public static final String PLACE = "애견카페";
	private int weight;
	
	// constructor
	public Dog() {
		
	}
	public Dog(String name, String kind, int weight) {
		super(name, kind);
		this.weight = weight;
	}
	
	// method
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public static String getPlace() {
		return PLACE;
	}
	@Override
	public void speak() {
		 System.out.println(super.toString() + " 몸무게는 " + weight + "kg 입니다.");
	}
	@Override
	public void configure() {
		System.out.println("개");
	}
}
