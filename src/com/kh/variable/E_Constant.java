package com.kh.variable;

public class E_Constant {
	
	public void constant()	{
		
		// variable
		int age = 10;
		System.out.println("age : " + age);
		
		age = 11;
		System.out.println("변경 후 age : " + age);
		
		// constant : 모두 대문자로 명명하는 것이 권장사항.
		final int AGE = 100;
		System.out.println("AGE : " + AGE);
		
		// AGE = 200; --> 상수는 변경 불가.
		
	}
	
}
