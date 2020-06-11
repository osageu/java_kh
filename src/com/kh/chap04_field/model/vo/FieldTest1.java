package com.kh.chap04_field.model.vo;

/**
 * @author user1
 *
 */

/*
 *  class structure [ field + constructor + method ]
 *  - 전역변수 (global variable) : class 영역에서 선언하는 변수 --> class 내 어디서든 사용 가능
 *  - 지역변수 (local variable) : class 영역을 제외한 특정 구역 {  } 에서 선언하는 변수 --> 그 지역에서만 사용 가능
 *                                     method, control (if, for)
 *  
 *  1. 전역변수
 *  	- 멤버변수(member variable; instance variable; field)
 *  		생성시점 : new 연산자를 통해 객체 생성 시 메모리 영역에 할당
 *  		소멸시점 : 객체 소멸 시 같이 소멸
 *  	- 클래스변수(static variable) : static keyword를 붙인 변수
 *  		생성시점 : 프로그램 실행(객체생성을 안 해도)과 동시에무조건 메모리 영역(static)에 할당
 *  		소멸시점 : 프로그램 종료될 때 소멸
 *  
 *  2. 지역변수
 *  	생성시점 : 특정한 구역 {  } 실행 시 메모리 영역에 할당 (ex. method 실행 시)
 *  	소멸시점 : 특정한 구역 {  } 종료 시 소멸 (ex. method 종료 시)
 */

// 변수 선언 위치에 따른 구분(전역, 지역(매개변수))
public class FieldTest1 { // FieldTest1 class open
	
	// member variable (instance variable) == field
	private int global = 99; // global variable
	
	public void test(int num) { // test method open, int num은 test method 안에서만 사용 (parameter)
		// 위 num (parameter) 또한 local variable임. (num 또한 이 영역에서만 사용가능)
		
		// local variable (특정 구역에서 선언한 변수)
		int local = 10;
		
		
		// global variable print --> 객체생성 시 JVM이 기본값을 초기화 진행함.
		System.out.println(global);
		
		// local variable print --> JVM이 기본값 설정해주지 않음(따로 초기화 해줘야 함).
		System.out.println(local);
		
		// parameter print --> test method 호출 시 무조건 정수값이 넘어오기 때문에 그 값으로 초기화됨.
		System.out.println(num);
		
	} // test method close
	
} // FieldTest1 class close
