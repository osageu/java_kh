package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	Scanner osageu = new Scanner(System.in);

	/*
	 * 프로그램 진행은 기본적으로 순차적으로 진행됨 단, 이 순차적인 흐름을 바꾸고자 한다면 "제어문"이라는 걸 통해서 직접 제어가능
	 * 
	 * 선택적으로 실행 ==> 조건문 반복적으로 실행 ==> 반복문 그 외의 흐름 제어 ==> 분기문
	 * 
	 * <조건문> 조건식을 통해 참이냐 거짓이냐를 판단해서 해당조건이 참일 경우 그에 해당하는 실행문을 실행 조건식의 결과 true / false
	 * 여야됨 조건식에서는 비교연산자(대소, 동등), 논리연산자(&&, ||), 논리부정연산자(!)
	 * 
	 * 조건문은 if문과 switch문으로 나뉨
	 * 
	 * 그 중 if문은 크게 3가지로 나뉨 1. 단독 if문 2. if-else문 3. if-else if문
	 * 
	 * 1. 단독 if문 [표현법] if(조건식) { 실행할 코드...; } --> 조건식이 true일 경우, 중괄호 안의 코드 실행 -->
	 * 조건식이 false일 경우, 중괄호 안의 코드 무시하고 건너뜀
	 * 
	 */
	public void method1() {
		// 실습문제 1번
		System.out.print("정수 : ");
		int num = osageu.nextInt();

//		if (num > 0) {
//			System.out.println("양수다");
//		}
//
//		if(num<=0) { System.out.println("양수가 아니다"); }
//		 
//		if (num == 0) {
//			System.out.println("0이다.");
//		}
//
//		if (num < 0) {
//			System.out.println("음수다");
//		}
		if(num>0) {
			System.out.println("양수다");
		}else if(num==0) {
			System.out.println("0이다");
		} else if(num<0){
			System.out.println("음수다");
		}
	}
	
	public void method2() {
		System.out.println("정수 : ");
		int num = osageu.nextInt();
		
		if(num % 2 ==0) {
			System.out.println("짝수다");
		}
		
		if(num % 2 !=0) {
			System.out.println("홀수다");
		}
	}
	
	public void method3() {
		System.out.print("이름 : ");
		String name = osageu.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = osageu.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classNum = osageu.nextInt();
		
		System.out.print("번호 (숫자만) : ");
		int number = osageu.nextInt();
		osageu.nextLine();
		
		System.out.print("성별 (M/F) : ");
		char gender = osageu.nextLine().charAt(0);
		
		System.out.print("성적 (소수점 아래 둘째 자리까지) : ");
		double point = osageu.nextDouble();
		
		String student = ""; // if와 else if가 false일 경우 empty box가 출력되기 때문에 [초기화; null("")]를 넣어줘야함.
//		String student = null; // if else문은 null이 필요없음.
									
//		if(gender == 'M' || gender =='m') {
//			student = "남학생";
//		} else if(gender == 'F' || gender =='f') {
//			student = "여학생";
//		} else {
//			student = "error";
//		}
		
		if(gender == 'M' || gender =='m') {
			student = "남학생";
		}
		if(gender == 'F' || gender =='f') {
			student = "여학생";
		}
		if(gender != 'M' && gender !='m' && gender != 'F' && gender != 'f') {
			System.out.println("error");
			return; // 아래의 method내용은 실행하지 않고 method를 빠져나감(즉, this method를 호출했던 곳으로 돌아감; Run class)
		}
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, classNum, number, student, name, point);

//		if문 { } 밖을 나오면 변수가 소멸되버림.
	}
	
	public void method4() {
		System.out.println("나이 : ");
		int age = osageu.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이");
		}

		if(age > 13 && age <= 19) {
			System.out.println("청소년");
		}
		
		if(age >19) {
			System.out.println("성인");
		}
		
	}
	
	public void method5() {
		// 새로운 예시
		// 이름 입력 받은 후 본인이 맞는지 확인하는 method
		System.out.print("이름 : ");
		String name = osageu.nextLine();
		
		// name에 담긴 값이 "오장석"과 일치할 경우 ==> "본인입니다."
		// name에 담긴 값이 "오장석"과 불일치할 경우 ==> "본인이 아닙니다"
		/*
		 * if(name == "오장석") { System.out.println("본인입니다"); }
		 * 
		 * if(name != "오장석") { System.out.println("본인이 아닙니다"); }
		 */
		
		/*
		 * 기본 자료형들끼리 비교시에 ==, != 과 같은 동등비교 사용 가능
		 * 단, String은 참조자료형
		 * 그래서 String 문자열간에 비교에 있어서는 .equals(비교할 값) method 활용
		 */
		
		// name == "오장석"
		if(name.equals("오장석")) {
			System.out.println("본인입니다");
		}
		// name != "오장석"
		if(!name.equals("오장석")) {
			System.out.println("본인이 아닙니다");
		}
		
	}
}









