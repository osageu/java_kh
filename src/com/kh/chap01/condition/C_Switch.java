package com.kh.chap01.condition;

import java.util.Scanner;

/**
 * @author user1
 *
 */
public class C_Switch {
	Scanner osageu = new Scanner(System.in);
	/*
	 * switch문(조건문)
	 * if문과의 차이점 : if문은 조건에 범위를 지정할 수 있었다고 한다면
	 * 						switch문은 확실값의 조건이다. (동등비교와 같다)
	 * [표현법]
	 * switch( 비교할 대상자 ) {
	 * 		case 값1 : 실행코드1; (비교할 대상자가 case 값1과 같아서 true일 경우 실행)
	 * 		break; (if문과 달리 switch는 빠져 나가지 않아서 써줘야함)
	 * 		
	 * 		case 값2 : 실행코드2; (case 값1과의 결과가 false일 경우 실행)
	 * 		break; (break를 안 걸면 break 만날 때 까지 계속 진행함)
	 * 
	 * 		case 값3 : 실행코드3;
	 * 		break; 
	 * 		.....
	 * 		.....
	 * 		default : 실행코드 n;(위의 값이 모두 false일 경우 실행, break가 불필요)
	 * 	
	 * }
	 * 
	 * 비교 대상자 == 값1 ; true일 경우 실행코드 1 수행되고 break만나 빠져나감
	 * switch문은 if-else, if문과 달리 실행코드만을 실행하고 자동으로 빠져나가지 못함.. 직접 break 필요
	 */
	public void method1() {
		// 사용자에게 1~3사이의 정수를 입력받아 그 정수값
		// 1일 경우 " 빨간색입니다. "
		// 2일 경우 " 파란색입니다. "
		// 3일 경우 " 초록색입니다. "
		// 잘못 입력했을 경우 " ERROR"
		System.out.print("정수(1~3) : ");
		int input = osageu.nextInt();
		
//		if (input == 1) {
//			System.out.println("빨간색입니다.");
//		} else if (input == 2) {
//			System.out.println("파란색입니다.");
//		} else if (input == 3) {
//			System.out.println("초록색입니다.");
//		} else {
//			System.out.println("ERROR");
//		}
//		switch (input) {
//		case 1 : 
//			System.out.println("빨간색입니다.");
//			System.out.println("Hello");
//			break;
//			
//		case 2 : 
//			System.out.println("파란색입니다.");
//			break;
//			
//		case 3 : 
//			System.out.println("초록색입니다.");
//			break;
//			
//		default : System.out.println("ERROR");
//		}
		
		String color = null;
		switch (input) {
		case 1 : 
			color = "빨간색";
			break;
			
		case 2 : 
			color = "파란색";
			break;
			
		case 3 : 
			color = "초록색";
			break;
			
		default : System.out.println("ERROR"); return; // method1을 빠져나가게..
		}
		System.out.println(color + "입니다.");
	}
	
	public void method2() {
		// 사용자에게 과일을 입력받은 후 그에 해당하는 가격을 출력
		// 수박의 가격은 1000원입니다.
		// 사과 : 1000원, 바나나 : 3000원, 키위 : 5000원, ERROR
		System.out.print("과일(사과, 바나나, 키위) : ");
		String input = osageu.nextLine();
		
//		switch ( input ) {
//		case "사과" : 
//			System.out.println("사과 : 1000원");
//			break;
//		case "바나나" :
//			System.out.println("바나나 : 3000원");
//			break;
//		case "키위" : 
//			System.out.println("키위 : 5000원");
//			break;
//		default : System.out.println("ERROR"); return;
//		}
		int price = 0;
		switch(input) {
		case "사과" : 
			price = 1000; 
			break;
		case "바나나" : 
			price = 3000;
			break;
		case "키위" : 
			price = 5000;
			break;
		default : System.out.println("ERROR"); return;
		}
		System.out.printf("%s의 가격은 %d원 입니다.", input, price);
	}
	
	public void method3() {
		// break를 쓰지 않는 예시
		// 등급(1,2,3)별 권한
		// 3등급 : 관리 권한, 글쓰기 권한, 읽기 권한
		// 2등급 : 글쓰기 권한, 읽기 권한
		// 1등급 : 읽기 권한
		System.out.print("등급(1,2,3) 입력 : ");
		int level = osageu.nextInt();
		
		switch (level) {
		case 3 : 
			System.out.print("관리 권한, ");
		case 2 : 
			System.out.print("글쓰기 권한, ");
		case 1 : 
			System.out.print("읽기 권한"); return; // or break;
		default : System.out.println("ERROR");
		}
	}
	
	public void method4() {
		// 사용자에게 1~12월까지 입력받아 해당하는 달의 마지막 날짜를 출력
		// 28 or 29: 2
		// 31 : 1, 3, 5, 7, 8, 10, 12
		// 30 : 4, 6, 9, 11
		
		System.out.print("1월~12월까지 중 하나를 입력하세요(숫자) : ");
		int input = osageu.nextInt();
		
		int month = 0;
		switch (input) {
		case 1 : 
		case 3 : 
		case 5 : 
		case 7 : 
		case 8 : 
		case 10 : 
		case 12 : System.out.println("입력하신 월은 31일까지입니다."); break;
		case 4 :
		case 6 :
		case 9 :
		case 11 : System.out.println("입력하신 월은 30일까지입니다."); break;
		case 2 : System.out.println("입력하신 월은 28일 또는 29일까지입니다."); break;
		default : System.out.println("ERROR");
		}
//		System.out.printf("입력하신 월은 %d일 까지 입니다.");
	}
}
