package com.kh.chap02.loop;

import java.util.Random;
import java.util.Scanner;

/**
 * @author osageu
 *
 */
public class B_While {
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	/*
	 * while문
	 * [표현법]
	 * 
	 * 초기식 변수;
	 * 
	 * while(조건식) {
	 * 	반복적으로 실행할 코드;
	 * 	증감식;
	 * }
	 * 
	 */
	public void method1() {
		int i ;
		i = 1;
		while (i <= 5) { 
			System.out.println("안녕하세요!");
			i++;
		}
		System.out.println("i : " + i); // for문은 { } 내에서 마무리 되기 때문에 i값이 안나옴
		
		// 1 2 3 4 5
		i = 1; 
		while (i <= 5) {
//			System.out.print(i + "\n");
			System.out.print(i++ + " ");
		}
		System.out.println();
		// 5 4 3 2 1
		i = 5;
		while(i>=1) {
			System.out.print(i-- + " ");
			
		}
		
	}
	
	public void method2() {
		// 1에서 10사이의 홀수만 출력
		// 1 3 5 7 9
		// 첫 번째 방법 : if를 이용
		int i = 1;
		
		while (i <= 10) {
			if ( i % 2 == 1) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		// 두 번째 방법 : +=2를 이용해 2씩 증가시킴
		i = 1;
		
		while (i<= 10) {
			System.out.print(i + " ");
			i+=2;
		}
	}
	
	public void method3() {
		// 1부터 난수(1~10)까지 출력 및 총 합계
		int random = ran.nextInt(10) + 1;
		int sum = 0;
		int i = 1;
		while (i <= random) {
			System.out.print(i + " ");
			sum += i;
			i++;
		}
		System.out.println();
		System.out.println("총 합계 : " + sum);
	}
	
	public void method4() {
		// 사용자가 입력한 단 출력하기
		System.out.print("단 수를 입력하세요 : ");
		int dan = sc.nextInt();
		
		if (dan >= 2 && dan <= 9) { // 잘 입력했을 경우
			int i = 1;
			while (i <= 9) {
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
				i++;
			}
		} else { // 잘못 입력했을 경우 ==> "잘못입력했습니다." 출력
			System.out.println("잘못 입력했습니다.");
		}
	}
	
	private void method5() { // Run class에서 호출 불가 
		// 사용자에게 문자열 입력받은 후 index별 문자 뽑아 출력하기
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		int i = 0;
		while (i < str.length())/*i <= str.length()*/ {
			System.out.println(str.charAt(i));
			i++;
		}
		System.out.println(i);
	}
	
	public void method6() {
		
	}
	
	public void method7() {
		
	}
	
}















