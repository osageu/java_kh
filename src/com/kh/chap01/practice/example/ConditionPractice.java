package com.kh.chap01.practice.example;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author osageu
 *
 */
public class ConditionPractice {
	Scanner osageu = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n9. 종료\n메뉴 번호를 입력하세요 : ");
		int input = osageu.nextInt();
		
		if (input == 1) {
			System.out.println("입력 메뉴입니다.");
		} else if (input == 2) {
			System.out.println("수정 메뉴입니다.");
		} else if (input == 3) {
			System.out.println("조회 메뉴입니다.");
		} else if (input == 4) {
			System.out.println("삭제 메뉴입니다.");
		} else if (input == 9) {
			System.out.println("프로그램이 종료됩니다.");
		}
	}
	
	public void practice2() {
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = osageu.nextInt();
		
		if (input > 0) {
			if (input % 2 == 0) {
				System.out.println("짝수다");
			}
			if (input % 2 ==1) {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요");
		}
	}
	
	public void practice3() {
		System.out.print("국어점수 : ");
		int korean = osageu.nextInt();
		System.out.print("수학점수 : ");
		int math = osageu.nextInt();
		System.out.print("영어점수 : ");
		int english = osageu.nextInt();
		
		int sum = korean + math + english;
		double average = sum/3.0;
		
		if (korean >= 40 && math >= 40 && english >=40 && average >=60) {
			System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n평균 : %.1f\n축하합니다, 합격입니다!"
											,korean, math, english, sum, average);
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int input = osageu.nextInt();
		
		if (input == 12 || input == 1 || input == 2) {
			System.out.println(input + "월은 겨울입니다.");
		} else if (input >=3 && input <= 5) {
			System.out.println(input + "월은 봄입니다.");
		} else if (input >= 6 && input <= 8) {
			System.out.println(input + "월은 여름입니다.");
		} else if (input >=9 && input <= 11) {
			System.out.println(input + "월은 가을입니다.");
		} else {
			System.out.println(input + "월은 잘못 입력된 달입니다.");
		}
	}
	
	public void practice5() {
		System.out.print("아이디 : ");
		String id = osageu.nextLine();
		System.out.print("비밀번호 : ");
		String pw = osageu.nextLine();
		
		if (id.equals("boram") && pw.equals("1234")) {
			System.out.println("로그인 성공");
		} else if (!id.equals("boram")){
			System.out.println("아이디가 틀렸습니다");
		} else if (!pw.equals("1234")) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}
	
	public void practice6() {
		String input;
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		input = osageu.nextLine();
		
		if (input.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리\n게시글 작성, 댓글 작성\n게시글 조회");
		} else if (input.equals("회원")) {
			System.out.println("게시글 작성, 댓글 작성\n게시글 조회");
		} else if (input.equals("비회원")) {
			System.out.println("게시글 조회");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
	}
	
	public void practice7() {
		System.out.print("키 (m)을 입력해주세요 : ");
		double height = osageu.nextDouble();
		System.out.print("몸무게 (kg)을 입력해주세요 : ");
		double weight = osageu.nextDouble();
		
		double BMI = weight / (height * height);
		System.out.println("BMI 지수 : " + BMI);
		if (BMI > 30) {
			System.out.println("고도 비만");
		} else if (BMI < 30 && BMI >=25) {
			System.out.println("비만");
		} else if (BMI <25 && BMI >=23) {
			System.out.println("과체중");
		} else if (BMI <23 && BMI >=18.5)	{
			System.out.println("정상체중");
		} else {
			System.out.println("저체중");
		}
	}
	
	public void practice8() {
		System.out.print("피연산자1 입력 : ");
		int input1 = osageu.nextInt();
		System.out.print("피연산자2 입력 : ");
		int input2 = osageu.nextInt();
		osageu.nextLine();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char input3 = osageu.nextLine().charAt(0);
		
		int plus = input1 + input2;
		int minus = input1 - input2;
		int multi = input1 * input2;
		int div1 = input1 / input2;
		int div2 = input1 % input2;
		
		if (input3 == '+' && input1 > 0 && input2 > 0 ) {
			System.out.printf("%d %c %d = %d", input1, input3, input2, plus);
		} else if (input3 == '-' && input1 > 0 && input2 > 0 ) {
			System.out.printf("%d %c %d = %d", input1, input3, input2, minus);
		} else if (input3 == '*' && input1 > 0 && input2 > 0 ) {
			System.out.printf("%d %c %d = %d", input1, input3, input2, multi);
		} else if (input3 == '/' && input1 > 0 && input2 > 0 ) {
			System.out.printf("%d %c %d = %d", input1, input3, input2, div1);
		} else if (input3 == '%' && input1 > 0 && input2 > 0 ) {
			System.out.printf("%d %c %d = %d", input1, input3, input2, div2);
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
	}
	
	public void practice9() {
		System.out.print("중간 고사 점수 : ");
		double score1 = osageu.nextDouble();
		System.out.print("기말 고사 점수 : ");
		double score2 = osageu.nextDouble();
		System.out.print("과제 점수 : ");
		double score3 = osageu.nextDouble();
		System.out.print("출석 횟수: ");
		double attendance = osageu.nextDouble();
		
		double calc1 = 0.2 * score1;
		double calc2 = 0.3 * score2;
		double calc3 = 0.3 * score3;
		double Final = (0.2 * score1) + (0.3 * score2) + (0.3 * score3) + (attendance);
		System.out.println("==========결과==========");
		if (Final >= 70 && attendance >= 14) {
			System.out.printf("중간 고사 점수(20) : %.1f\n기말 고사 점수(30) : %.1f\n과제 점수(30) : %.1f\n출석 점수(20) : %.1f\n총점 : %.1f\n%s",
					calc1, calc2, calc3, attendance, Final, "PASS");
		} else if (Final < 70 && attendance >= 14) {
			System.out.printf("FAIL [점수 미달] (총점 %.1f)", Final);
		} else if (Final >= 70 && attendance < 14) {
			System.out.printf("FAIL [출석 횟수 부족] (%.0f / 20)", attendance);
		} else {
			System.out.printf("FAIL [출석 횟수 부족] (%.0f / 20)\nFAIL [점수 미달] (총점 %.1f)", attendance, Final);
		}
	}
	
	public void practice10() {
		System.out.print("실행할 기능을 선택하세요." + "\n" + 
											"1. 메뉴 출력" + "\n" + 
											"2. 짝수 / 홀수" + "\n" + 
											"3. 합격 / 불합격" + "\n" + 
											"4. 계절" + "\n" + 
											"5. 로그인" + "\n" + 
											"6. 권한 확인" + "\n" + 
											"7. BMI" + "\n" + 
											"8. 계산기" + "\n" + 
											"9. Pass / Fail" + "\n" + 
											"선택 : ");
		int input = osageu.nextInt();
		System.out.println("==============================================================");
		 if (input == 1) {
			 practice1();
		 } else if (input == 2) {
			 practice2();
		 } else if (input == 3) {
			 practice3();
		 } else if (input == 4) {
			 practice4();
		 } else if (input == 5) {
			 practice5();
		 } else if (input == 6) {
			 practice6();
		 } else if (input == 7) {
			 practice7();
		 } else if (input == 8) {
			 practice8();
		 } else if (input == 9) {
			 practice9();
		 } else {
			 System.out.println("Error");
		 }
	}
	
}








