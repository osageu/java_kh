package com.kh.chap02_personMVC.model.vo;

/**
 * @author user1
 *
 */

// Model : 데이터 관련 부분을 처리하는 역할
// VO(Value Object) : 데이터를 담아둘 수 있는 용도의 Class
public class Person {
	
	// field
	private String name;		// 이름
	private int age;				// 나이
	private int wealth;			// 재산
	
	// constructor
	public Person() {
		
	}
	
	public Person(String name, int age, int wealth) {
		this.name = name;
		this.age = age;
		this.wealth = wealth;
	}

	// method
	// setter
	public void setName(String name) {		// 이름 설정
		this.name = name;
	}
	public void setAge(int age) {					// 나이 설정
		this.age = age;
	}
	public void setWealth(int wealth) {			// 재산 설정
		this.wealth = wealth;
	}
	
	// getter
	public String getName() {						// 이름 반환
		return name;
	}
	public int getAge() {							// 나이 반환
		return age;
	}
	public int getWealth() {						// 재산 반환
		return wealth;
	}

	// information
	public String info() {
		return "이름 : " + name + ", 나이 : " + age + ", 재산 : " + wealth;
	}
	
}
