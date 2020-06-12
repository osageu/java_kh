package com.kh.chap06_method.part1_methodTest.controller;

public class MethodTest2 {
	
	// static method
	public static int num1 = 1000;
	public static int num2 = 500;
	
	// 1. No parameter, No return method
	public static void method1() {
		System.out.println(num1 + num2);
		num2++;
	}
	
	// 2. No parameter, Yes return method
	public static int method2() {
		return num1 + num2;
	}
	
	// 3. Yes parameter, No return method
	public static void method3 (String name) {
		System.out.println(name + "님의 방문을 환영합니다 ^^;;");
		num2++;
	}
	
	// 4. Yes parameter, Yest return method
	public static int method4 (String name) {
		System.out.print(name + "님의 방문은 형편없습니다!! + ");
		return num1 + num2;
	}
	
}
