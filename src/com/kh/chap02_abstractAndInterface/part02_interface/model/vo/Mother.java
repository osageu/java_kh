package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public class Mother extends Person implements Basic{
	
	// field
	private String babyBirth; // 출산, 입양, 없음
	
	// constructor
	public Mother() {
		
	}
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	// method
	public String getBabyBirth() {
		return babyBirth;
	}
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	@Override
	public String toString() {
		return super.toString() + ", 출생정보 : " + babyBirth;
	}
	@Override
	public void eat() { // 성인 : 몸무게 10 증가, 건강도 10 감소
		super.setWeight(super.getWeight()+10);
		super.setHealth(super.getHealth()-10);
	}
	@Override
	public void sleep() { // 성인 : 건강도 10 증가
		super.setHealth(getHealth()+10);
	}
}
