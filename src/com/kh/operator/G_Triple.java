package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	public void method1() {
		// 삼항 연산자 : 3개의 항목을 통해 연산하는 연산자
		// [표현법] [조건식] ? [조건식이 true일 경우 들어갈 값] : [조건식이 false일 경우 들어갈 값]
		// 조건식에는 반드시 true or false가 나오게끔 작성해야됨 -> 비교 or 논리 연산;
		
		// 입력받은 정수값이 양수인지 아닌지 판별 후 출력
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
	
}
