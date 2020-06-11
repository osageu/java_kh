package com.kh.chap03_class.model.vo;

/**
 * @author user1
 *
 */
public class Person {
	
	// 필드부
	// [접근제한자] [자료형] [변수명];
	private String id;
	private String pw;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	
	// 생성자부 : 생략시 JVM이 기본적인 것을 만들어 줌.
	// [접근제한자] [클래스명( )] {   } ==> 반환형의 개념이 없음.
	public Person() { // 기본 생성자 ==> 작성을 안 하면 JVM이 만들어 줌.
		
	}
	
	
	
	// 메소드부
	// [접근제한자] [반환형] [메소드명(매개변수, 매개변수, 매개변수, .... ; 생략가능)] {   }
	
	// 1) setter method : 호출시 전달되는 값 받아서 해당 필드에 대입(초기화) 시켜주는 역할 (값 변경)
	public void setAll (String id, String pw, String name, int age, char gender, String phone, String email) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}
//	public void setPw (String pw) {
//		this.pw = pw;
//	}
//	public void setName (String name) {
//		this.name = name;
//	}
//	public void setAge (int age) {
//		this.age = age;
//	}
//	public void setGender (char gender) {
//		this.gender = gender;
//	}
//	public void setPhone (String phone) {
//		this.phone = phone;
//	}
//	public void setEmail (String email) {
//		this.email = email;
//	}
	
	// 2) getter method : 호출시 해당 필드에 담긴 값을 반환시켜주는 역할 (값 조회)
	public String getAll() {
		return this.id + "\n" + this.pw+ "\n" + this.name+ "\n" + this.age+ "\n" + this.gender+ "\n" + this.phone+ "\n" + this.email;
	}
//	public String getPw () {
//		return this.pw;
//	}
//	public String getName () {
//		return this.name;
//	}
//	public int getAge () {
//		return this.age;
//	}
//	public char getGender () {
//		return this.gender;
//	}
//	public String getPhone () {
//		return this.phone;
//	}
//	public String getEmail () {
//		return this.email;
//	}
	
	// 3) information method : 호출시 모든 필드 값들을 하나의 문자열로 합쳐서 반환시켜줌
	public String information() {
		return getAll(); 
	}
	
	
}
