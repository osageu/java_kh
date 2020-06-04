package com.kh.chap03.branch;

import java.util.Random;
import java.util.Scanner;

public class B_Continue {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	// continue : 나와 가장 가까운 반복문으로 올라가라는 의미
	public void method1() {
		// 1부터 10까지의 홀수만을 출력
		// 1 3 5 7 9
//		for (int i = 1 ; i < 10 ; i++) { // 1에서 10까지 1씩 증가하는 동안 반복
//			if (i % 2 == 1) {
//				System.out.print(i + " ");
//			}
//		}
		for (int i = 1 ; i <= 10 ; i++) {
			
			if(i%2 == 0) { // 짝수일 경우
				continue; // 뒤의 실행문은 건너뛰고 반복문 위로 올라가라!!(증감식)
			}
			System.out.print(i + " ");
		}
	}
	
	public void method2() {
		// 1~100까지의 정수값의 총 합계
		// 단, 6의 배수값은 빼고 덧셈연산
		int sum = 0;
		for (int i = 1 ; i <= 100 ; i++) {
			if (i % 6 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.print(sum);
	}
	
	public void method3() {
		// 2~9단까지의 구구단 출력 중 4의 배수단은 빼고 출력
		for (int i = 2 ; i <= 9 ;  i++) {
			if(i==4) {
				continue;
			}
			System.out.println();
			System.out.printf("=====  %d단  =====\n", i);
			for (int j = 1 ; j <= 9 ; j++) {
				// 3의 배수 수는 건너띄겠다.	
				if (j % 3 == 0) {
					continue;
				}
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
		}
			
	}
}
