package com.kh.chap03.practice.example;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	
	public void method1() {
		int random = ran.nextInt(100)+1;
		int count = 0;
		
		while(true) {
			
			System.out.print("숫자(1~100) : ");
			int input = sc.nextInt();
			
			if (input >= 1 && input <= 100) {
				if (random == input) {
					System.out.println("정답입니다.");
					
					break;
					
				} else if (random > input) {
					System.out.print("Up");
					count++;
					System.out.println(" // count :" + count);
				} else if (random < input) {
					System.out.print("Down");
					count++;
					System.out.println(" // count :" + count);
				}
			} else {
				System.out.println("1~100사이만 입력하세요!");
			}
			
		}
	}
	
}
