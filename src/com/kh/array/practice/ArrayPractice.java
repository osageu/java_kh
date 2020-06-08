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
		int[] location = new int[sum];
		
		for (int i = 0 ; i < input1.length() ; i++) {
			finder[i] = input1.charAt(i);
			if (finder[i] == input2) {
				sum += 1;
				location[sum-1] = i;
				}
			}
		System.out.println(input1 + "에 " + input2 + "(이)가 존재하는 위치(index) : " + Arrays.toString(location));
		System.out.println(input2 + " 개수 : " + sum);
		}
	
	public void practice6() {
		
	}
	
	public void practice7() {
		
	}
	
	public void practice8() {
		
	}
	
	public void practice9() {
		
	}
	
	public void practice10() {
		
	}
	
	public void practice11() {
		
	}
	
	public void practice12() {
		
	}
	
	public void practice13() {
		
	}
	
	public void practice14() {
		
	}
	
	public void practice15() {
		
	}
	
}
