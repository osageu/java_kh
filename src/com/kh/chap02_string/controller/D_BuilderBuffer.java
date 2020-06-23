package com.kh.chap02_string.controller;

public class D_BuilderBuffer {
	
	/* 
	 *  StringBuilder, StringBuffer
	 *  : 가변 클래스 --> 그 자리에서 값이 변경
	 *  : 두 개 모두 constructor & method는 동일!
	 *  : 차이점 -> 동기화의 유무 (속도 차이)
	 *  : 처음에 16개의 문자를 저장할 수 있는 buffer가 생성됨
	 *  
	 *  StringBuilder : 동기화 제공 X
	 *  StringBuffer : 동기화 제공 O
	 *  
	 *  thread : 일의 단위
	 *   
	 *  multi-thread : 여러 개의 일처리를 동시 다발적으로 병행해서 수행 
	 *  --> 동기화 처리가 된 걸로 실행해야 안전함 
	 *  --> StringBuffer
	 *  
	 *  single-thread : 동기화 처리가 필요없음! 동기화 작업을 하게 되면 속도 저하되는 문제 발생..
	 *  --> StringBuilder 사용 권장
	 *  
	 */
	
	public void method1() {
		
		// 1. default constructor --> 수용량 : 16 (기본값)
		StringBuilder sb1 = new StringBuilder();
		System.out.println("sb1 수용량 : " + sb1.capacity());
		System.out.println("sb1 문자열 길이 : " + sb1.length());
		System.out.println("======================");
		
		// 2. parameterized constructor --> 수용량 : 지정한 만큼
		StringBuilder sb2 = new StringBuilder(30);
		System.out.println("sb2 수용량 : " + sb2.capacity());
		System.out.println("sb2 문자열 길이 : " + sb2.length());
		System.out.println("======================");
		
		// 3. parameterized constructor
		StringBuilder sb3 = new StringBuilder("반가워!!");
		System.out.println("sb3 수용량 : " + sb3.capacity()); // 16+5;
		System.out.println("sb3 문자열 길이 : " + sb3.length()); // 반 가 워 ! ! = 5
		System.out.println(sb3);
		
	}
	
	public void method2() {
		
		// Immutable class
		String str = "반가워!";
		System.out.println(System.identityHashCode(str));
		str += " 난 String이얌!!";
		System.out.println(System.identityHashCode(str)); // 값 변경 후 주소값 변경됨
		System.out.println(str);
		System.out.println("===========================");
		
		
		// mutable class
		StringBuilder sb = new StringBuilder("반가워!"); // capacity : 20, length : 4
		System.out.println("sb : " + sb);
		System.out.println("sb 수용량 : " + sb.capacity()); 
		System.out.println("sb 문자열 길이 : " + sb.length()); 
		System.out.println("sb 주소값 : " + System.identityHashCode(sb));
		System.out.println("===========================");
		
		// 1. append(String str) : StringBuilder
		// --> 기존의 문자열에 내가 전달한 문자열 추가
		sb.append(" 안녕!");
		System.out.println("sb : " + sb);
		System.out.println("sb 수용량 : " + sb.capacity()); 
		System.out.println("sb 문자열 길이 : " + sb.length()); 
		System.out.println("sb 주소값 : " + System.identityHashCode(sb));
		System.out.println("===========================");
		sb.append("aaaaaaaaaaaa");
		System.out.println("sb : " + sb);
		System.out.println("sb 수용량 : " + sb.capacity()); 
		System.out.println("sb 문자열 길이 : " + sb.length()); 
		System.out.println("sb 주소값 : " + System.identityHashCode(sb));
		System.out.println("===========================");
		sb.append("e");
		System.out.println("sb : " + sb);
		System.out.println("sb 수용량 : " + sb.capacity()); 
		System.out.println("sb 문자열 길이 : " + sb.length()); 
		System.out.println("sb 주소값 : " + System.identityHashCode(sb));
		System.out.println("===========================");
		
		// 2. delete(int open, int close) : StringBuilder
		sb.delete(9, 20);
		System.out.println("sb : " + sb);
		System.out.println("sb 수용량 : " + sb.capacity()); 
		System.out.println("sb 문자열 길이 : " + sb.length()); 
		System.out.println("sb 주소값 : " + System.identityHashCode(sb));
		System.out.println("===========================");
		
		// 3. insert(int offset, String str) : StringBuilder
		sb.insert(1, "ㅎㅎㅎ");
		System.out.println("sb : " + sb);
		System.out.println("sb 수용량 : " + sb.capacity()); 
		System.out.println("sb 문자열 길이 : " + sb.length()); 
		System.out.println("sb 주소값 : " + System.identityHashCode(sb));
		System.out.println("===========================");
		
		// 4. reverse() : StringBuilder
		sb.reverse();
		System.out.println("sb : " + sb);
		System.out.println("sb 수용량 : " + sb.capacity()); 
		System.out.println("sb 문자열 길이 : " + sb.length()); 
		System.out.println("sb 주소값 : " + System.identityHashCode(sb));
		System.out.println("===========================");
		
		
		StringBuilder sb2 = new StringBuilder("javaProgram");
		sb2.append(" API").delete(4, 11).reverse(); // --> method chaining
		System.out.println(sb2);
		
	}
	
}
