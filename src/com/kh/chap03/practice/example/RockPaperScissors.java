package com.kh.chap03.practice.example;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	
	public void method1() {
		
		int count = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		while(true) {
			
			System.out.print("가위, 바위, 보 : ");
			String input = sc.nextLine();
			
			String array[] = {"가위","바위","보"};
			int random = ran.nextInt(3);
			String RPS = array[random];
			
			if (input.equals("가위") || input.equals("바위") || input.equals("보")) {
				System.out.println(input + " vs " + RPS);
				count++;
			}
			
			if (input.equals(RPS)) {
				System.out.println("Draw");
				draw++;
			} else if ((input.equals("가위") && RPS.equals("보")) || (input.equals("보") && RPS.equals("바위")) || (input.equals("바위") && RPS.equals("가위"))) {
				System.out.println("Win");
				win++;
			} else if ((input.equals("가위") && RPS.equals("바위")) || (input.equals("보") && RPS.equals("가위")) || (input.equals("바위") && RPS.equals("보"))) {
				System.out.println("Lose");
				lose++;
			} else if (input.equals("전적")) {
				System.out.printf("수행 횟수 : %d\n이긴 횟수 : %d\n비긴 횟수 : %d\n진 횟수 : %d\n", count, win, draw, lose);
			} else if (input.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("ERROR");
			}
		
			System.out.println();
		}
		
	}
}
