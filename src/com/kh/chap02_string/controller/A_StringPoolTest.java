package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	/*
	 *  String class
	 *  : 불변 클래스 --> 변하지 않는 클래스
	 *  : 한 번 값을 저장하고 수정하게 되면 그 자리에서 수정되는 개념X
	 *  : 변경이 적고 한 번 저장한 후 읽기만 많은 경우 유용하게 사용됨
	 *  
	 */
	
	// 1. constructor를 통한 String 생성
	public void method1() {
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(str1 == str2);
		System.out.println(str1.toString()); // toString() --> String class에 이미 overriding되어있음
		System.out.println(str2.toString());
		System.out.println(str1.equals(str2)); // equals() --> String class에 이미 overriding되어있음
		System.out.println(str1.hashCode()); // 주소값이 아닌 문자열로 재정의되어서
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1)); // 진짜 주소값
		System.out.println(System.identityHashCode(str2));
		
	}
	
	// 2. Literal을 통한 String 생성
	public void method2() {
		
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		str2 = "abcd";
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str2));
		str2 = "Hello";
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str2));
		str2 = new String("강보람");
		
	}
	
	
	
}
