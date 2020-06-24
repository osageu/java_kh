package com.kh.chap03_wrapper.controller;

public class A_WrapperTest {
	
	/* 
	 *  Wrapper class
	 *  : 기본자료형을 객체로써 포장해주는 class
	 *  
	 *  1. 	boolean <--> Boolean
	 *  2. 	char <--> Character
	 *  3. byte <--> Byte
	 *  4. short <--> Short
	 *  5. int <--> Integer
	 *  6. long <--> Long
	 *  7. float <--> Float
	 *  8. double <-->Double
	 *  
	 *  : 기본 타입을 객체로써 취급해야 되는 경우가 있음
	 *  ex1) method의 parameter가 object일 때..
	 *  ex2) 다형성을 적용하고 싶을 때..
	 *  ex3) class에서 제공하는 method를 사용하고 싶을 때..
	 *  
	 */
	
	// 기본자료형 --> wrapper class data type으로 바꿔보기!!
	public void method1() {
		
		// Boxing : 기본자료형 --> Wrapper class
		int num1 = 10;
		int num2 = 15;
		
		// 1. 객체 생성을 통해 하는 방법
		Integer i1 = new Integer(num1);
		Integer i2 = new Integer(num2);
		System.out.println(i1.toString()); // Integer 말고도 모든 Wrapper class에는 toString Overriding
		System.out.println(i2);
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2));
		
		// 객체화시킨 순간 다형성 적용 가능
		Object o = num1; // int -> Integer -> Object (UpCasting)
		Object o2 = i1;
		
		// 2. 객체 생성하지 않고 바로 대입 방법
		Integer i3 = num2;
		
		// 언제 객체생성을 해서 Boxing합니까?
		// 단, 객체생성을 통해 Boxing하게 되면 문자열을 숫자화 가능
		Integer i4 = new Integer("15");
//		Integer i5 = "123";
		System.out.println(i4);
		System.out.println(i3.equals(i4));
		
		// UnBoxing : Wrapper class --> 기본자료형
		// 1. Wrapper class에서 제공하는 xxxValue() method
		// i1 --> num3;
		int num3 = i1.intValue();
		int num4 = i2.intValue();
		
		System.out.println(num3 + ", " + num4);
		
		// 2. 바로 대입 (AutoUnBoxing)
		int num5 = i3;
		
		// Auto로 해주는 기능들이 많은데 굳이 객체생성을 통해 Boxing을 한다거나 xxxValue method?
		// 그래서 9버전 이후부터는 Deprecated..
		
		
	}
	
}





