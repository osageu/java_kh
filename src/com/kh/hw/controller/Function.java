package com.kh.hw.controller;

import java.util.Random;
import java.util.Scanner;

/**
 * @author osageu
 *
 */
public class Function {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	
	public void calculator() {
		System.out.print("첫 번째 정수 : ");
		int int1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int int2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자(+, -, x, /) : ");
		String op = sc.nextLine();
		
		switch(op) {
		case "+" : System.out.printf("%d %s %d = %d", int1, op, int2, int1 + int2); break;
		case "-" : System.out.printf("%d %s %d = %d", int1, op, int2, int1 - int2); break;
		case "x" : System.out.printf("%d %s %d = %d", int1, op, int2, int1 * int2); break;
		}
		if(op.equals("/") && int2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.printf("%d / 0 = 0", int1);
		} else if(op.equals("/") && int2 != 0) {
			System.out.printf("%d %s %d = %d", int1, op, int2, int1 / int2);
		}
	}
	
	public void totalCalculator() {
		System.out.print("첫 번째 정수 : ");
		int int1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int int2 = sc.nextInt();
		
		int max = Math.max(int1, int2);
		int min = Math.min(int1, int2);
		int sum = 0;
		
		for (int i = min ; i <=max ; i++) {
			sum += i;
		}
			System.out.printf("%d부터 %d까지 정수들의 합 : %d", min, max, sum);

	}
	
	public void printProfile() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		String gender = sc.nextLine();
		System.out.print("성격 : ");
		String character = sc.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.print("성격 : " + character);
		System.out.println();

	}
	
	public void printScore() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int Class = sc.nextInt();
		System.out.print("번 : ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("성적 : ");
		double point = sc.nextDouble();
		
		char aa ;
		if (point >= 90) {
			aa = 'A';
		} else if (point >= 80) {
			aa = 'B';
		} else if (point >= 70) {
			aa = 'C';
		} else if (point >= 60) {
			aa = 'D';
		} else {
			aa = 'F';
		}
		
		String bb = null;
		if (gender == 'M') {
			bb = "남학생";
		} else if (gender == 'F') {
			bb = "여학생";
		}
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.2f이고 %c등급입니다.",
				grade, Class, number, bb, name, point, aa);
		System.out.println();

	}
	
	public void printStarNumber() {
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		if (input > 0) {
			
			for (int i = 1 ; i <= input ; i++) {
				for (int j =  1 ; j < i ; j++) {
					System.out.print('*');
				}
				System.out.println(i);
			}
			
		} else {
			System.out.println("양수가 아닙니다.");
		}
		System.out.println();

		
	}
	
	public void sumRandom() {
		int nansu = ran.nextInt(100)+1;
		
		int sum = 0;
		for(int i = 1 ; i <= nansu ; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합 : %d", nansu, sum);
		System.out.println();

	}
	
	public void exceptGugu() {
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		if (input > 0) {
			for (int i = 1 ; i <= 9 ; i++) {
				if (i % input != 0) {
					System.out.printf("%d * %d = %d\n", input, i, input * i);
				}
			}
		}
		System.out.println();

	}
	
	public void diceGame() {
		
		int dice1 = ran.nextInt(6)+1;
		int dice2 = ran.nextInt(6)+1;
		int sum = dice1 + dice2;
		
		while(1342124==1342124) {
			
			System.out.print("주사위 두 개의 합을 맞춰보세요(1~12 입력) : ");
			int input = sc.nextInt();
			if (sum == input) {
				System.out.printf("정답입니다.\n주사위의 합 : %d\n", sum);
				sc.nextLine();
				System.out.println();
				System.out.print("계속 하시겠습니까? (y/n) : ");
				char input2 = sc.nextLine().charAt(0);
				
				if (input2 == 'y' || input2 == 'Y') {
					dice1 = ran.nextInt(6)+1;
					dice2 = ran.nextInt(6)+1;
					sum = dice1 + dice2;
					continue;
				} else if (input2 == 'n' || input2 == 'N') {
					System.out.println("종료합니다.");
					break;
				}
				
			} else {
				System.out.println("틀렸습니다");
			}
			
		}
		System.out.println();

	}
	
}

