package com.kh.exception;

import java.util.Scanner;

public class A_UncheckedException {
	Scanner sc = new Scanner(System.in);
	/*
	 *  RuntimeException
	 *  : 프로그램 실행 시 발생되는 exception --> 예외처리 필수 X
	 *  : user mistake or developer mistake
	 *  
	 *  RuntimeException subclass
	 *  1. ArrayIndexOutOfBoundsException : 배열에 잘못된 인덱스 값을 제시했을 경우!
	 *  2. ClassCastException : 허용할 수 없는 형변환이 진행되는 경우!
	 *  3. NegativeArraySizeException : 배열의 크기를 음수로 지정하는 경우!
	 *  4. NullPointerException : 참조변수가 null 초기화된 상황에서 method를 호출하는 경우!
	 *  5. ArithmeticException : 나누기 연산에서 0으로 나웠을 경우!
	 *  
	 *  --> 위의 내용들은 예측 가능한 상황들이 대부분..
	 *  --> 즉, 충분히 예측 가능한 상황에 있어서 애초에 예외가 발생안되게 끔 if문 조건으로 충분히 처리 가능!!
	 *  
	 */
	
	public void method1() {
		
		// ArithmeticException
//		System.out.print("첫 번째 정수 : ");
//		int num1 = sc.nextInt();
//		System.out.print("두 번째 정수 : ");
//		int num2 = sc.nextInt();
//		int result = 0;
//		if (num2 != 0) { // 예외처리가 아님 
//			result = num1/num2;
//		} 
//		System.out.println("result : " + result);
		// 예외처리 : 예외가 발생했을 때 처리하는 구문을 작성해놓는 것!
		/*
		 *  try{ } catch{ }
		 *  
		 *  try {
		 *  	예외가 발생될 수 있는 구문;
		 *  } catch(ExceptionClass Variable) {
		 *  	해당 예외가 발생되는 경우 처리할 구문;
		 *  }	
		 */
		
//		System.out.print("첫 번째 정수 : ");
//		int num1 = sc.nextInt();
//		System.out.print("두 번째 정수 : ");
//		int num2 = sc.nextInt();
//		try {
//			int result = num1 / num2;
//			System.out.println("result : " + result);
//		} catch(ArithmeticException e) {
//			System.out.println("0으로는 나눌 수 없습니다.");
//		}
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		int result = 0;
		try {
			System.out.println("안녕하세요");
			result = num1 / num2;
		} catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		System.out.println("result : " + result);
		
	}
	
	public void method2() {
		
		// NegativeArraySizeException & ArrayIndexOutOfBoundsException
		System.out.print("배열의 길이 : ");
		int size = sc.nextInt();
		
//		try {
//			int[] arr = new int[size];
//			System.out.println(arr[0]);
//		} catch (NegativeArraySizeException e) {
//			System.out.println("프로그램을 종료합니다");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("프로그램을 종료합니다2");
//		}
		
		try {
			int[] arr = new int[size];
			System.out.println(arr[0]);
		} catch (Exception e) {
			System.out.println("Exception");
		} 
		
	}
	
	
}
