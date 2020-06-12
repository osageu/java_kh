package com.kh.chap06_method.part1_methodTest.controller;

import com.kh.chap05_constructor.model.vo.User;

public class MethodTest1 {
	
	// field
	// constructor
	// method
	/* 
	 *  [표현법]
	 *  [access modifier] [reserved word] [data type] [method name] (parameter, parameter, ....){   
	 *  	실행시키고자 하는 코드....;
	 *  	[return 반환하고자하는 값;]
	 *  }
	 *  
	 */
	
	// 1. No parameter, No return method
	public void method1 () {
		
		System.out.println("No parameter, No return");
		
		// return; --> 빠져날 때 출력할 값이 있으면 기술! 따로 적어주지 않으면 JVM이 자동 생성
		
	}
	
	// 2. No parameter, Yes return method
	public String method2 () {
		
		System.out.println("No parameter, Yes return");
		
		return "This is the return value : " + "'cyper'";
		
	}
	
	// 3. Yes parameter, No return method
	public void method3 (int num1, int num2, String str1) {
		
		System.out.println("Yes parameter, No return");
		// 10 + 3 = 13
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2) + str1);
		
	}
	
	// Yes parameter, Yes return method
	public String method4 (int num1, int num2, String str1) {
		
		System.out.println("Yes parameter, Yes return");
		// 10 * 3 = 30
		return "This is the return value : " + num1 + " * " + num2 + " = " + (num1 * num2) + str1;
	}
	
	
	public void test(User user) { //User는 자료형, user는 변수명 --> 합해서 parameter
		
		// User user는 User u와 같은 주소값을 참조함.
		user.setUserGender('M');
		
	}
	
	public void test2(int[] a) {
		a[1] = 10;
	}
	
}
