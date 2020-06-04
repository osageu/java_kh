package com.kh.chap03.practice.example;

import java.util.Random;
import java.util.Scanner;

/**
 * @author osageu
 *
 */
public class CompExample {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	
	public void method1method2() {
		
		while(true) {
			
			System.out.print("정수 : ");
			int input = sc.nextInt();
			
			if (input >= 1) {
				
				for (int i = 1 ; i <= input ; i++) {
					if (i % 2 == 1) {
						System.out.print("박");
					} else if (i % 2 == 0) {
						System.out.print("수");
					}
				}
				
				break;
				
			} else {
				System.out.println("양수가 아닙니다");
			}
			System.out.println();
		}
			
	}
	
	public void method3() {
		System.out.print("문자열 : ");
		String input1 = sc.nextLine();
		System.out.print("문자 : ");
		char input2 = sc.nextLine().charAt(0);
		
		int count = 0;
		for (int i = 0 ; i < input1.length(); i++) {
			if (input1.charAt(i) == input2) {
				count++;
			} 
		}
		System.out.println(count);
		
	}
	
	public void method4() {

		for (int i = 1 ; i <=4 ; i++) {
			for (int j = 1 ; i >= j ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
