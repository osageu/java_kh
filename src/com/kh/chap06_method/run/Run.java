package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.part1_methodTest.controller.MethodTest2;

public class Run {

	public static void main(String[] args) {
		
//		System.out.println("-------------  method1  ---------------");
//		
//		// method1 open
//		osageu.method1();
//		// method1 close
//		
//		System.out.println();
//		System.out.println("-------------  method2  ---------------");
//		
//		// method2 open
//		System.out.println(osageu.method2());
//		String test1 = osageu.method2();
//		System.out.println(test1);
//		// method2 close
//		
//		System.out.println();
//		System.out.println("-------------  method3  ---------------");
//		
//		// method3 open
//		osageu.method3(10, 3, "!!!");
//		// method3 close
//		
//		System.out.println();
//		System.out.println("-------------  method4  ---------------");
//		
//		// method4 open
//		System.out.println(osageu.method4(10, 3, "!!!"));
//		String test2 = osageu.method4(10, 3, "!!!");
//		System.out.println(test2);
//		// method4 close
		
//		User u = new User("user01", "pass01", "오장석", 26, 'P');
//		
//		System.out.println("현재의 u : " + u.info());
//		
//		osageu.test(u);
//		
//		System.out.println("미래의 u : " + u.info());
//		
//		int[] arr = new int[4];
//		osageu.test2(arr);
//		System.out.println(Arrays.toString(arr));
		
		System.out.print("method1 : "); MethodTest2.method1();
		System.out.print("method2 : "); System.out.println(MethodTest2.method2());
		System.out.print("method3 : "); MethodTest2.method3("오사긔");
		System.out.print("method4 : "); System.out.println(MethodTest2.method4("오사긔"));
		System.out.println(Math.PI);
		// Math m = new Math(); --> 객체생성할 필요가 없어서 access modifier가 private임.
		Scanner sc = new Scanner(System.in);
	}
	
}
