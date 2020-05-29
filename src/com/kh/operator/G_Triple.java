package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	public void method1() {
		// 삼항 연산자 : 3개의 항목을 통해 연산하는 연산자
		// [표현법] [조건식] ? [조건식이 true일 경우 들어갈 값] : [조건식이 false일 경우 들어갈 값]
		// 조건식에는 반드시 true or false가 나오게끔 작성해야됨 -> 비교 or 논리 연산;
		
		// 입력받은 정수값이 양수인지 아닌지 판별 후 출력거북선 첫 등장
		Scanner osageu = new Scanner(System.in);
		System.out.print("정수값 입력 : ");
		int num = osageu.nextInt();
		
		// 조건식 ? true값 : false값
		System.out.println(num >0 ? "양수이다" : "양수가 아니다");
		System.out.println(num<=0 ? "양수가 아니다" : "양수이다");
		
		String result = num > 0 ? "양수이다" : "양수가 아니다";
		System.out.println(result);
		System.out.println(num + "은 " + result);
	}
	
	public void method2() {
		Scanner osageu = new Scanner(System.in);
		System.out.print("정수값 입력 : ");
		int num = osageu.nextInt();
		
		System.out.println(num%2 == 1? "홀수이다" : "짝수이다");
		System.out.println(num%2 != 1 ? "짝수이다" : "홀수이다");
		
		String result = num%2 == 1? "홀수이다" : "짝수이다";
		System.out.println(num + "은 " + result);
	}
	
	public void method3 () {
		Scanner osageu = new Scanner(System.in);

		System.out.print("첫 번째 정수 : ");
		int num1 = osageu.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = osageu.nextInt();
		
		// 1) "결과가 100이상입니다"
		// 2) "결과가 100보다 작습니다"
		String result = num1 * num2 >= 100 ? "결과가 100이상입니다" : "결과가 100보다 작습니다";
		System.out.println(num1 * num2 + "은(는) " + result);
	}
	
	public void method4() {
		Scanner osageu = new Scanner(System.in);
		
		System.out.print("영문자 입력 : ");
		char ch = osageu.nextLine().charAt(0);
		
		String result = (ch >= 'A' && ch <= 'Z' ) ? "대문자이다" : "대문자가 아니다.";
		System.out.println(ch + "은(는) " + result);
	}
	
	public void method5() {
		Scanner osageu = new Scanner(System.in);

		System.out.print("정수값 입력 : ");
		int num = osageu.nextInt();
		
		// 양수이다
		// 0이다
		// 음수이다
		String result = (num > 0 && num != 0) ? "양수이다" : ((num == 0) ? "0이다" : "음수이다");
		System.out.println(result);
	}
	
	public void method6() {
		// 두 개의 정수값을 입력받고, + 또는 -를 입력받고 알맞는 계산 결과 출력
		// 단 + 또는 - 외의 다른 문자를 입력하는 경우 "잘못 입력하였습니다." 출력
		Scanner osageu = new Scanner(System.in);
		
		// 1) +를 입력했을 경우 : 덧셈 연산 결과
		// 2) -를 입력했을 경우 : 뺄셈 연산 결과
		// 3) 그 외를 입력했을 경우 : "잘못 입력하였습니다"
		 System.out.print("첫 번째 수 : ");
		 int num1 = osageu.nextInt();
		 System.out.print("두 번째 수 : ");
		 int num2 = osageu.nextInt();
		 osageu.nextLine();
		 
		 System.out.print("연산자 입력(+ or -) : ");
		 char op = osageu.nextLine().charAt(0);
		 
		 System.out.println();
//		 System.out.println((op == '+') ? (num1 + num2)  : (op == '-' ? num1 - num2 : "잘못 입력하였습니다"));
		 
		 String result = (op == '+') ? (num1 + num2 + "")  : 
			                (op == '-' ? num1 - num2 + "": "잘못 입력하였습니다");
		 
		 System.out.println(result);
	}
	
}
















