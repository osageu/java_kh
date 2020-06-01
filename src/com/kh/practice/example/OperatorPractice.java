package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	Scanner osageu = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("정수 : ");
		int input = osageu.nextInt();
		System.out.println();
		System.out.println((input > 0 ? "양수다" : "양수가 아니다"));
	}
	
	public void practice2() {
		 
		System.out.print("정수 : ");
		int input = osageu.nextInt();
		System.out.println();
		System.out.println((input > 0 ? "양수다" : (input < 0 ? "음수다" : "0이다")));
	}
	
	public void practice3() {
		 
		System.out.print("정수 : ");
		int input = osageu.nextInt();
		System.out.println();
		System.out.println(input % 2 == 0 ? "짝수다" : "홀수다");
	}
	
	public void practice4() {
		 
		System.out.print("인원 수 : ");
		int input1 = osageu.nextInt();
		
		System.out.print("사탕 개수 : ");
		int input2 = osageu.nextInt();
		
		System.out.println();
		System.out.println("1인당 사탕 개수 : " + (input2 / input1) + "\n" + 
		"남는 사탕 개수 : " + (input2 % input1));
	}
	
	public void practice5() {
		 
		System.out.print("이름 : ");
		String name = osageu.nextLine();
		
		System.out.print("학년 (숫자만) : ");
		int grade = osageu.nextInt();

		System.out.print("반 (숫자만) : ");
		int Class = osageu.nextInt();
		osageu.nextLine();
		
		System.out.print("번호 (숫자만) : ");
		int number = osageu.nextInt();
		osageu.nextLine();
		
		System.out.print("성별 (M/F) : ");
		char gender = osageu.nextLine().charAt(0);
		
		System.out.print("성적 (소수점 아래 둘째 자리까지) : ");
		double point = osageu.nextDouble();
		
		String result = (gender == 'M' ? "남학생" : "여학생");
		System.out.println();
		System.out.printf(grade + "학년 " + Class + "반 " + number + "번 "
									+ name + " " + result + "의 성적은 " + String.format("%,.2f",point) + "이다.");
		
	}
	
	public void practice6() {
		 
		System.out.print("나이 : ");
		int input = osageu.nextInt();
		
		System.out.println();
		System.out.println(input > 19 ? "성인" : (input <= 13 ? "어린이" : "청소년"));
	}
	
	public void practice7() {
		 
		System.out.print("국어 : ");
		int korean = osageu.nextInt();
		
		System.out.print("영어 : ");
		int english = osageu.nextInt();
		osageu.nextLine();
		
		System.out.print("수학 : ");
		int math = osageu.nextInt();
		
		int sum = korean + english + math;
		double average = (korean + english + math)/3;
		
		System.out.println();
		System.out.println("합계 : " + sum + "\n" + "평균 : " + sum/3.0);
		if (korean >= 40 && english >= 40 && math >= 40 && average > 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
//		(korean >=40 && english >= 40 && math >=40 && sum >= 60) !=  ? "합격" : "불합격");
				
		
	}
	
	public void practice8() {
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char input = osageu.nextLine().charAt(7);
		
		System.out.println();
		System.out.println(input == '1' || input == '3' ? "남자" : "여자");
	}
	
	public void practice9() {
		 
		System.out.print("정수1 : ");
		int num1 = osageu.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = osageu.nextInt();
		osageu.nextLine();
		
		System.out.print("입력 : ");
		int input = osageu.nextInt();
		
		System.out.println();
		System.out.println(num1 >= input || num2 < input ? "true" : "false" );
	}
	
	public void practice10() {
		 
		System.out.print("입력1 : ");
		int input1 = osageu.nextInt();
		
		System.out.print("입력2 : ");
		int input2 = osageu.nextInt();
		osageu.nextLine();

		System.out.print("입력3 : ");
		int input3 = osageu.nextInt();
		
		System.out.println();
		System.out.println(input1 == input2 && input2 == input3 ? "true" : "false");

	}
	
	public void practice11() {
		 
		System.out.print("A 사원의 연봉 : ");
		double inputA = osageu.nextDouble();
		
		System.out.print("B 사원의 연봉 : ");
		double inputB = osageu.nextDouble();
		osageu.nextLine();

		System.out.print("C 사원의 연봉 : ");
//		double inputC = osageu.nextDouble();
		int inputC = osageu.nextInt();

		double A[ ] = {1.4*inputA, 1*inputB, 1.15*inputC};
		char B[ ] = {'A', 'B', 'C'};
		
		System.out.println();
		System.out.println(B[0] + "사원의 인센티브포함 연봉 : " + A[0] + "\n" + (A[0] >= 3000 ? "3000이상" : "3000미만"));
		System.out.println(B[1] + "사원의 인센티브포함 연봉 : " + A[1] + "\n" + (A[1] >= 3000 ? "3000이상" : "3000미만"));
		System.out.println(B[2] + "사원의 인센티브포함 연봉 : " + A[2] + "\n" + (A[2] >= 3000 ? "3000이상" : "3000미만"));
		
	}

}
