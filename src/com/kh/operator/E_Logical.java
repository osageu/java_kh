package com.kh.operator;
import java.util.Scanner;
public class E_Logical {
	public void method1() {
		// 논리 연산자 : 두 논리값(true/false)을 연산하는 연산자
		
		// [논리값] && [논리값] : 왼쪽, 오른쪽 둘 다 true일 경우 최종적으로 true 
		// true && true --> true
		// true && false --> false
		// false && true --> false	
		// false && false --> false
		// 왼쪽 값이 false값으로 나오면, 오른쪽 연산은 굳이 실행하지 않음
		
		// [논리값] || [논리값] : 왼쪽, 오른쪽 둘 중 하나라도 true일 경우 최종적으로 true
		// true || true --> true
		// true || false --> true
		// false || true --> true	
		// false || false --> false
		// 왼쪽값이 true값으로 나오면, 오른쪽 연산은 굳이 실행하지 않음
		
		// 사용자가 입력한 값이 1~100사이의 값인지 확인하는 예시
		Scanner osageu = new Scanner(System.in);
		System.out.print("숫자를 기입하시오 : ");
		double input = osageu.nextDouble();
		
		boolean result = (input >= 1)  && (input <=100);
		System.out.println(result);
	}
	
	public void method2() {
		//사용자가 입력한 값이 영어 대문자(A ~ Z)인지 확인하는 것
		Scanner osageu = new Scanner(System.in);
		System.out.print("알파벳을 기입하시오 : ");
		char input = osageu.nextLine().charAt(0);
		
		boolean result = ( 'A' <= input) && ('Z' >=input);
		System.out.println("사용자가 입력한 값이 대문자 입니까 : " + result);
	}
	
	public void method3() {
		Scanner osageu = new Scanner(System.in);
		System.out.print("프로그램을 종료하시겠습니까? (y 또는 Y) : ");
		char input = osageu.nextLine().charAt(0);
		// 사용자가 입력한 값이 y 또는 Y 입니까?
		
		boolean result = (input == 'y') || (input == 'Y');
		System.out.println("사용자가 입력한 값이 y 또는 Y 입니까 : " + result);
		if (result == true) {
			System.out.println("승인되었습니다.");
		} else {
			System.out.println("거부되었습니다.");
		}
		
		
	}
}
