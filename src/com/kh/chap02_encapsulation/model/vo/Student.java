package com.kh.chap02_encapsulation.model.vo;

/**
 * @author user1
 *
 */
public class Student {
	
	private String name;
	private int age;
	private double height;
	
	// setter method : 호출시 전달값을 각 필드에 대입시켜주는 method
	public void setName(String name) { // 매개변수 : method 호출시 전달값을 받아주기 위한 변수
		// name = name; // 매개변수 name = 매개변수 name;
							// { } 영역에서는 해당 영역에 만들어진 variable이 우선권을 가짐
		this.name = name; // this. : 위 쪽 필드 name을 가져옴
	}
	
	public void setAge(int age) { // 나이 변경 method
		this.age = age;
	}
	
	public void setHeight(double height) { // 키 변경 method
		this.height = height;
	}
	
	// getter method : 각 필드에 담겨있는 값을 반환시켜주는 method
	public String getName() {
		return this.name; // name 필드에 담긴 값을 반환시켜주는 method
	}
	
	public int getAge() {
		return this.age;
	}
	
	public double getHeight() {
		return this.height;
	}
	
}
