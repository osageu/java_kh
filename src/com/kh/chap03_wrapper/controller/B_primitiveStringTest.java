package com.kh.chap03_wrapper.controller;

public class B_primitiveStringTest {
	
	/*
	 *  기본자료형 <--> Wrapper class
	 *  int <--> Integer
	 *  
	 *  기본자료형 <--> String class
	 *  int <--> String
	 *  1 <--> "1"
	 *  
	 */
	
	public void method1() {
		
		String str1 = "10";
		String str2 = "15.3";
		System.out.println(str1);
		Integer i1 = new Integer(str1);
		int i2 = i1;
		Double d1 = new Double(str2);
		double d2 = d1;
		System.out.println(i2+d2);
		
		// 1. String --> 기본자료형 : Wrapper class.parseXXX(변환시키고자 하는 문자열)
		// "10" --> 10
		int i = Integer.parseInt(str1);
		// "15.3" --> 15
		double d = Double.parseDouble(str2);
		System.out.println(i+d);
		
		// 2. 기본자료형 --> String : String.valueOf(변환시키고자 하는 문자열)
		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
		System.out.println(strI+strD);
		
	}
	
}
