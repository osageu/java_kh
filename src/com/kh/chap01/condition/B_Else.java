package com.kh.chap01.condition;

import java.util.Scanner;

/**
 * @author user1
 *
 */
public class B_Else {
	Scanner osageu = new Scanner(System.in);
		/*
		 * if - else 문 
		 * if(조건식) { ... 실행코드 1... } else { ... 실행코드 2... } 
		 * --> 조건식의 결과가 true일 경우, 실행코드 1 수행 후 if-else문 빠져나감 
		 * --> 단, 결과가 false일 경우, 무조건 실행코드 2 수행됨
		 * 
		 * if - else if 문 
		 * if(조건식1) { 
		 * ... 실행코드 1 ... 
		 * } else if(조건식2) { 
		 * ... 실행코드 2 ... 
		 * } else if(조건식3) {
		 *  ... 실행코드 3 ... 
		 * } else {
		 * 		위의 조건들이 다 false일 경우 반드시 실행할 코드
		 * }
		 * --> else if는 여러개 해도됨(5개..10개..)
		 * --> 조건식1의 결과가 true일 경우, 실행코드 1 수행하고 빠져나감 
		 * 단, 조건식1의 결과가 false일 경우 조건식 2 실행
		 * 		조건식2의 결과가 true일 경우, 실행코드 2 수행하고 빠져나감
		 * 		단, 조건식2의 결과가 false일 경우 그 뒤의 조건....
		 * 단, else문이 제시되어 있고 모든 조건문이 false일 경우, 최종적으로 else 구문 실행
		 * 
		 *
		 */
	public void method1() {
		System.out.print("정수 : ");
		int num = osageu.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수다");
		} else if(num % 2 == 1) {
			System.out.println("홀수다");
		}
	}
	
	public void method2() {
		System.out.print("정수 : ");
		int num = osageu.nextInt();
		
		if(num > 0) {
			System.out.println("양수다");
		} else if(num==0) {
			System.out.println("0이다");
		} else if(num < 0) {
			System.out.println("음수다");
		}
	}
	
	public void method3() {
		System.out.print("이름 : ");
		String name = osageu.nextLine();
		
		System.out.print("학년 (숫자만) : ");
		int grade = osageu.nextInt();

		System.out.print("반 (숫자만) : ");
		int Class = osageu.nextInt();
		
		System.out.print("번호 (숫자만) : ");
		int number = osageu.nextInt();
		osageu.nextLine();
		
		System.out.print("성별 (M/F) : ");
		char gender = osageu.nextLine().charAt(0);
		
		System.out.print("성적 (소수점 아래 둘째 자리까지) : ");
		double point = osageu.nextDouble();
		
		System.out.println();
		String student = null;
		if(gender == 'M' || gender == 'm') {
			student = "남학생";
		} else if(gender == 'F' || gender == 'f') {
			student = "여학생";
		} else {
			System.out.println("Error");
			return;
		}
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, Class, number, name, student, point);
	}
	
	public void method4() {
		System.out.print("나이 : ");
		int age = osageu.nextInt();
		
		if (age < 13) {
			System.out.println("어린이");
		} else if (/* age>13 && */ age <=19) { // 조건문 1에서 이미 나이가 13이 false라는 정보가 내려왔기 때문에 생략가능
			System.out.println("청소년"); // 하지만 if 문을 3개 썼을 때는 13보다 크다는 조건을 넣어줘야 정상작동함
		} else {
			System.out.println("성인");
		}
	}
	
	public void method5() {
		// 새로운 예시
		// 사용자에게 점수를 입력받아
		// 90점 이상 --> A등급
		// 80점 이상 90점 미만 --> B등급
		// 70점 이상 80점 미만 --> C등급
		// 60점 이상 70점 미만 --> D등급
		// 60점 미만 --> F등급
		
		System.out.print("점수 : ");
		double score = osageu.nextDouble();
		
		String grade; // String grade = null;
		if (score >= 90.0) {
			grade = "A";
//			System.out.println("A등급");
		} else if (score >= 80.0){
			grade = "B";
//			System.out.println("B등급");
		} else if (score >= 70.0){
			grade = "C";
//			System.out.println("C등급");
		} else if (score >= 60.0){
			grade = "D";
//			System.out.println("D등급");
		} else {
			grade = "F";
//			System.out.println("F등급");
		}
		System.out.printf("당신의 점수는 %.1f점이고, 등급은 %s등급입니다",score,grade);
	}
	
	public void method6() {
		// 새로운 예시
		// method5에서 각 등급별 중간 점수 이상일 경우, "+"라는 문자를 추가해서 출력
		// ex) 95점 이상 : A+ / 85점 이상 : B+
		System.out.print("점수 : ");
		double score = osageu.nextDouble();
		
		String grade; // String grade = null;
		if (score >= 90.0) {
			grade = "A";
			if (score >= 95.0) {
				grade += "+";
			}
			
		} else if (score >= 80.0) {
			grade = "B";
			if (score >= 85.0) {
				grade += "+";
			}
			
		} else if (score >= 70.0) {
			grade = "C";
			if (score >= 75.0) {
				grade += "+";
			}
			
		} else if (score >= 60.0) {
			grade = "D";
			if (score >= 65.0) {
				grade += "+";
			}
			
		} else {
			grade = "F";
		}
		
		System.out.printf("당신의 점수는 %.1f점이고, 등급은 %s등급입니다",score,grade);
	}
	
	public void method7() {
		System.out.print("month : ");
		int month = osageu.nextInt();
		System.out.print("temperature : ");
		int temperature = osageu.nextInt();
		
		String season = null;
		if (month == 1 || month == 2 || month == 12) {
			season = "겨울";
			if(temperature <= -15) {
			season += " 한파 경보";
			} else if(temperature <= -12) {
			season += " 한파 주의보";
			}
			
			} else if (month >= 3 && month <= 5) {
			season = "봄";
			
			} else if (month >= 6 && month <= 8) {
			season = "여름";
			if(temperature >= 35) {
			season += " 폭염 경보";
			} else if(temperature >= 33) {
			season += " 폭염 주의보";
			}
			
			} else if (month >= 9 && month <= 11) {
			season = "가을";
			
			} else {
			season = "해당하는 계절이 없습니다.";
			}
		System.out.println(season);
	}
	
	public void method8() {
		System.out.print("이름 : ");
		String name = osageu.nextLine();
		
		if (name.equals("오장석")) {
			System.out.println("본인입니다.");
		} else if(!name.equals("오장석")) {
			System.out.println("본인이 아닙니다.");
		}
	}
}







