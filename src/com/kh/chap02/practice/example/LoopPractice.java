package com.kh.chap02.practice.example;

import java.util.Random;
import java.util.Scanner;

/**
 * @author osageu
 *
 */
public class LoopPractice {
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if (input >= 1) {
			for (int i = 1 ; i <= input ; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice2() {
		while(true) {
			
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if (input >= 1) {
			for (int i = 1 ; i <= input ; i++) {
				System.out.print(i + " ");
			}
			
			break;
			
		} else {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		
		}
	}
	
	public void practice3() {
		// ver.1
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if (input >= 1) {
			for (int i = 0 ; i <=input-1 ; i++) {
				System.out.print(input - i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		System.out.println();
		// ver.2
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input2 = sc.nextInt();
		
		if (input2 >= 1) {
			for (int i = input2 ; i >= 1 ; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice4() {
			while(true) {
				
		// ver.1
				System.out.print("1이상의 숫자를 입력하세요 : ");
				int input = sc.nextInt();
				
				if (input >= 1) {
					for (int i = 0 ; i <=input-1 ; i++) {
						System.out.print(input - i + " ");
					}
					
					break;
					
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			}
	}
	
	public void practice5() {
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int sum = 0;		
		int i = 0;
		
		for(i = 1 ; i <= input ; i++) {
			if (input > i) {
				sum+=i;
				System.out.print(i + " + ");
			} else if (input == i){
			sum += i;
			System.out.print(i + " = ");
			}
		}
		System.out.println(sum);
	}
	
	public void practice6() {
		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();
		int abs = Math.abs(input1-input2);
		int sum = 0;
		
		if (input1>=1 && input2>=1 && input1 < input2) {
			for (int i = 0 ; i <= abs ; i++) {
				sum = input1+i;
				System.out.print(sum + " ");
			}
		} else if (input1>=1 && input2>=1 && input1 > input2) {
			for (int i = 0 ; i <= abs ; i++) {
				sum = input2+i;
				System.out.print(sum + " ");
			}
		} else {
			System.out.println("1이상의 숫자만을 입력해주세요.");
		}
	}
	
	public void practice7() {
		while(true) {
			
			System.out.print("첫 번째 숫자 : ");
			int input1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int input2 = sc.nextInt();
			int abs = Math.abs(input1-input2);
			int sum = 0;
			
			if (input1>=1 && input2>=1 && input1 < input2) {
				for (int i = 0 ; i <= abs ; i++) {
					sum = input1+i;
					System.out.print(sum + " ");
				}
				
				break;
				
			} else if (input1>=1 && input2>=1 && input1 > input2) {
				for (int i = 0 ; i <= abs ; i++) {
					sum = input2+i;
					System.out.print(sum + " ");
				}
				
				break;
				
			} else {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
			
		}
	}
	
	public void practice8() {
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		System.out.printf("=====  %d단 =====\n", input);
		
		for (int i = 1 ; i <= 9 ; i++) {
			System.out.printf("%d * %d = %d\n", input, i, input*i);
		}
	}
	
	public void practice9() {
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if (input >=2 && input <=9) {
			for (int i = input ; i <= 9 ; i++) {
				System.out.printf("=====  %d단  =====\n", i);
				for (int j = 1 ; j <= 9 ; j++) {
					System.out.printf("%d x %d = %d\n",i, j, i*j );
				}
			}
		} else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
		
	}
	
	public void practice10() {
		while(true) {
			
			System.out.print("숫자 : ");
			int input = sc.nextInt();
			
			if (input >=2 && input <=9) {
				for (int i = input ; i <= 9 ; i++) {
					System.out.printf("=====  %d단  =====\n", i);
					for (int j = 1 ; j <= 9 ; j++) {
						System.out.printf("%d x %d = %d\n",i, j, i*j );
					}
				}
				
				break;
				
			} else {
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}
		}
	}
	
	public void practice11() {
		System.out.print("시작 숫자 : ");
		int input1 = sc.nextInt();
		System.out.print("공차 : ");
		int input2 = sc.nextInt();
		int sum = input1;
		
		for (int i = 1 ; i <= 10 ; i++) {
			System.out.print(sum + " ");
			sum +=input2;
		}
		
	}
	
	public void practice12() {
		
		while(true) {
			
			System.out.print("연산자(+, -, *, /, %) : ");
			String input1 = sc.nextLine();
			
			if (input1.equals("exit")) {
				System.out.print("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("정수1 : ");
			int input2 = sc.nextInt();
			System.out.print("정수2 : ");
			int input3 = sc.nextInt();
			sc.nextLine();
			
			if (input1.equals("+")) {
				System.out.printf("%d %s %d = %d", input2, input1, input3, input2 + input3);
				
			} else if (input1.equals("-")) {
				System.out.printf("%d %s %d = %d", input2, input1, input3, input2 - input3);
				
			} else if (input1.equals("*")) {
				System.out.printf("%d %s %d = %d", input2, input1, input3, input2 * input3);
				
			} else if (input1.equals("/") && input3 !=0) {
				System.out.printf("%d %s %d = %d", input2, input1, input3, input2 / input3);
				
			} else if (input1.equals("%") && input3 !=0) {
				System.out.printf("%d %s %d = %d", input2, input1, input3, input2 % input3);
				
			} else if ((input1.equals("/") && input3 == 0) || (input1.equals("%") && input3 == 0)) {
				System.out.print("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				
			} else if ((!input1.equals("+") || !input1.equals("-") || !input1.equals("*") || !input1.equals("/") || !input1.equals("%"))) {
				System.out.print("없는 연산자입니다. 다시 입력해주세요.");
			}
			
			System.out.println();
			System.out.println();
		
		}
	}
	
}






