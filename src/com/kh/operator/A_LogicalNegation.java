package com.kh.operator;

public class A_LogicalNegation {
	
	public void method1() {
		// 논리 부정 연산자 (!) == 논리 값 (true/false)을 반대로 바꾸는 연산자
		// 논리는 논리로 나옴
		System.out.println("true의 반대 : " + !true);
		System.out.println("false의 반대 : " + !false);
		
		boolean aa = true == false;
		boolean bb = false == false;
		System.out.println(aa);
		System.out.println(bb);
		// 논리 부정 연산자를 가지고 연산한 결과값 : 논리값(boolean)
		
	}
	
}
