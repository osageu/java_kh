package com.kh.chap03.branch;

import java.util.Random;
import java.util.Scanner;

public class A_Break {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	// break : 이 구문과 가장 가까운 반복문을 빠져나가는 문구. 단, swtich문 안의 break는 switch문을 빠져나가는 구
	public void method1() {
	
		// 사용자에게 반복적으로 문자열을 입력받고 출력 (반복적으로 실행)
		// 단, 사용자가 입력만 문자열이 만약 "exit" 일 경우, 탈출!
		while(true) {
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();

			if (str.equals("exit")) {
				break;
			}
			System.out.println("str : " + str);
			System.out.println("str의 길이 : " + str.length());
		}
		System.out.println("프로그램을 종료합니다.");
		// 무한반복 안에 break가 없는 경우 unreachable code error!
	}
	
	public void method2() {
		// 반복적으로 랜덤값(1~50) 발생시킨 후 출력
		// 단, 그 랜덤값이 홀수일 결우 출력하지 않고 반복문이 종료!
		while(true) {
			
			int random = ran.nextInt(50) + 1;
			
			if (random % 2 == 1) {
				break;
			}
			System.out.println("랜덤값 : " + random);
			
		}
		
	}
	
	public void method3() {
		// 사용자에게 정수 두 개와 연산기호(+, -)를 입력받고 
		// 그에 해당하는 연산 결과를 출력(반복적으로 수행)
		// 단, 제시된 연산기호를 입력하지 않고 다른 문자를 입력했을 경우
		// 오류문구 출력 후 반복문 종료!
		
		while(true) {
			
			System.out.print("정수 1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수 2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			System.out.print("연산기호(+, -) : ");
			char op = sc.nextLine().charAt(0);
			
//			System.out.println(num1 + " " + op + " " + num2 + " = " + num1);
//			if(op != '+' && op != '-') {
//				System.out.println("ERROR");
//				break;
//			}
//			if(op == '+') {
//				System.out.printf("%d %c %d = %d\n", num1, op, num2, num1 + num2);
//			} else if(op == '-') {
//				System.out.printf("%d %c %d = %d\n", num1, op, num2, num1 - num2);
//			}
//			System.out.println();
			int result = 0;
			
			if(op=='+') {
				result = num1 + num2;
			} else if(op=='-') {
				result = num1 - num2;
			} else {
				System.out.println("ERROR");
				break;
			}
			System.out.printf("%d %c %d = %d\n", num1, op, num2, result);
			System.out.println();
			
		}
	}
	
}
