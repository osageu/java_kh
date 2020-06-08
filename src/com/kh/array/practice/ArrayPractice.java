package com.kh.array.practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	
	public void practice1() {
		int[] iArr = new int[10];
		for (int i = 0 ; i < iArr.length ; i++) {
			iArr[i] = i+1;
			System.out.printf(iArr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] iArr = new int[10];
		for (int i = 0 ; i < iArr.length ; i++) {
			iArr[i] = 10-i;
			System.out.print(iArr[i] + " ");
		}
	}
	
	public void practice3() {
		System.out.print("양의 정수 : ");
		int[] iArr = new int[sc.nextInt()];
		for (int i = 0 ; i < iArr.length ; i++) {
			iArr[i] = i+1;
			System.out.print(iArr[i] + " ");
		}
	}
	
	public void practice4() {
		String[] sArr = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(sArr[1]);
	}
	
	public void practice5() {
		System.out.print("문자열 : ");
		String input1 = sc.nextLine();
		System.out.print("문자 : ");
		char input2 = sc.nextLine().charAt(0);
		char[] finder = new char[input1.length()];
		int sum = 0;

		for (int i = 0 ; i < input1.length() ; i++) {
			finder[i] = input1.charAt(i);
			if (finder[i] == input2) {
				sum += 1;
				}
			}
		System.out.print(input1 + "에 " + input2 + "(이)가 존재하는 위치(index) : ");
		for (int i = 0 ; i < input1.length() ; i++) {
			if (finder[i]==input2){
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println(input2 + " 개수 : " + sum);
		
		}
	
	public void practice6() {
		String[] day = {"월", "화", "수", "목", "금", "토", "일"};
		System.out.print("0 ~6 사이 숫자 입력 : ");
		int input = sc.nextInt();
		if (input >=0 && input <=6) {
			System.out.println(day[input] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice7() {
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int[] iArr = new int[input];
		
		int sum = 0;
		for (int i = 0 ; i < iArr.length ; i++) {
			System.out.printf("배열 %d번째 index에 넣을 값 : ", i);
			iArr[i] = sc.nextInt();
			sum += iArr[i];
		}
		for (int i = 0 ; i < iArr.length ; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		System.out.println("총합 : " + sum);
		
	}
	
	public void practice8() {
		while(true) {
			
			System.out.print("정수 : ");
			int input = sc.nextInt();
			if (input < 3 || input % 2 == 0) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			int[] iArr = new int[input];
			for (int i = 0 ; i <= iArr.length/2 ; i++) { 
				iArr[i] = i+1;
			}
			for (int i = iArr.length/2 + 1 ; i < iArr.length; i++) {
				iArr[i] = iArr[i-1]-1;
			}
			for (int i = 0 ; i < iArr.length ; i++) {
				if (i == iArr.length-1) {
					System.out.print(iArr[i]);
					break;
				}
				System.out.print(iArr[i] + ", ");
			}
			break;
			
		}
	}
	
	public void practice9() {
		System.out.print("치킨 이름을 입력하세요 : ");
		String input = sc.nextLine();
		String[] chicken = {"간장","갈릭", "양념", "후라이드"};
		
		for (int i = 0 ; i < chicken.length ; i++) {
			if (input.equals(chicken[i])) {
				System.out.println(input + "치킨 배달 가능");
				return;
			} 
		}
		System.out.println(input + "치킨은 없는 메뉴입니다.");
	}
	
	public void practice10() {
		
		int[] iArr = new int[10];
		for (int i = 0 ; i < iArr.length ; i++) {
			iArr[i] = ran.nextInt(10)+1;
		}
		for (int i = 0 ; i < iArr.length ; i++) {
			System.out.print(iArr[i] + " ");
		}
		
	}
	
	public void practice11() {
		
		int[] iArr = new int[10];
		for (int i = 0 ; i < iArr.length ; i++) {
			iArr[i] = ran.nextInt(10)+1;
		}
		
		for (int i = 0 ; i < iArr.length ; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		
		int temp = iArr[0];
		for (int i = 0 ; i <= iArr.length-2 ; i++) {
			if ( Math.max(temp, iArr[i+1]) == iArr[i]) {
				temp = iArr[i];
			} else if(Math.max(temp, iArr[i+1]) == iArr[i+1]) {
				temp = iArr[i+1];
			}
		}
		System.out.println("최댓값 : " + temp);
		
		int temp2 = iArr[0];
		for (int i = 0 ; i <= iArr.length-2 ; i++) {
			if ( Math.min(temp2, iArr[i+1]) == iArr[i]) {
				temp2 = iArr[i];
			} else if(Math.min(temp2, iArr[i+1]) == iArr[i+1]) {
				temp2 = iArr[i+1];
			}
		}
		System.out.println("최솟값 : " + temp2);
		
	}
	
	public void practice12() {
		
		int[] iArr = new int[10];
		
		for (int i = 0 ; i < iArr.length ; i++) {
			iArr[i] = ran.nextInt(10)+1;
			for (int j = 0 ; j < i ; j++) {
				if (iArr[j] == iArr[i]) {
					i--;
				}
			}
		}
		for (int i = 0 ; i < iArr.length ; i++) {
			System.out.print(iArr[i] + " ");
		}
		
	}
	
	public void practice13() {
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		char[] number = new char[input.length()];
		for (int i = 0 ; i < input.length() ; i++) {
			number[i] = input.charAt(i);
		}
		
		char[] copy = new char[input.length()];
		System.arraycopy(number, 0, copy, 0, 8);
		for (int i = 8 ; i < copy.length ; i++) {
			copy[i] = '*';
		}
		
		for (int i = 0 ; i < copy.length ; i++) {
			System.out.print(copy[i]);
		}
	
	}
	
	public void practice14() {
		int[] lotto = new int[6];
		
		for (int i = 0 ; i < lotto.length ; i++) {
			lotto[i] = ran.nextInt(45) + 1;
			for (int j = 0 ; j < i ; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
				}
			}
		}
		Arrays.sort(lotto, 0, lotto.length);
		for (int i = 0 ; i < lotto.length ; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void practice15() {
		
	}
	
}
