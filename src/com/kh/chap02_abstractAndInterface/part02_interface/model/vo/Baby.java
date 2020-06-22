package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public class Baby extends Person implements Basic{
	
	// field
	
	// constructor
	public Baby() {
		
	}
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}
	
	// method
	@Override
	public void eat() { // 아기 : 몸무게 3 증가 , 건강도 1 증가
		super.setWeight(getWeight()+3);
		super.setHealth(getHealth()+1);
	}
	@Override
	public void sleep() { // 아기 : 건강도 3 증가
		super.setHealth(getHealth()+3);
	}
}
