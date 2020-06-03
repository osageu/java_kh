package com.kh.chap02.loop;

import java.util.Random;
import java.util.Scanner;

public class C_Dowhile {
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	
	/*
	 * do-while문
	 * 
	 * do {
	 * 	반복적으로 실행할 코드; // ==> 처음에 반드시 한 번  실행하고 while 돌
	 * 	
	 * 	증감식;
	 * 
	 * } while (조건식); {
	 * 
	 * }
	 * 
	 * 초기식 --> 무조건 한 번은 실행 --> 증감식 -->
	 * 조건식 --> true면 실행             --> 증감식 -->
	 * 조건식 --> false일 경우 반복문 빠져나감
	 */
	public void method1() {
		int num = 1;
		
		do {
			System.out.println("안녕하세요");
		} while (num == 5);
	}
	
	public void method2() {
		// 1 2 3 4 5
		int i = 1;
		
		System.out.println("start");
		do {
			System.out.println(i++ + " ");
		} while(i<=5); {
			System.out.println("end");
		}
	}
	
	public void method3() {
		// 1에서부터 랜덤값(1~100)까지의 총 합계
		int random = ran.nextInt(100) + 1;
		int sum = 0;
		int i = 1;
		
		System.out.println(random);
		do {
			sum += i++;
		} while (i <= random);
		
		System.out.println("1부터" + random + "까지의 총 합계 : " + sum);
	}
}













