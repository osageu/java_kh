package com.kh.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class C_ArraySort {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	// 배열 정렬
	public void method1() {
		// 변수를 가지고 값을 변경해보자
		int num1 = 10;
		int num2 = 20;
		System.out.println("===== 변경 전 =====");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println();
		System.out.println("===== 변경 후 =====");
		
		/*
		num1 = num2; // num1 = 20, num2 = 20;
		num2 = num1; // num1 = 20, num2 = 20;
		*/
		// 임시로 한 개의 값을 보관해둘 변수
		int temp = num1; // temp = 10;
		num1 = num2; // num1 = 20;
		num2 = temp; // num2 = 10;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
	
	public void method2() {
		int[] iArr1 = {2, 1, 3, 5, 2, 1, 1, 7, 3, 4};
		// iArr[0] <-> iArr[1]
//		int temp = iArr[0];
//		iArr[0] = iArr[1];
//		iArr[1] = temp; // temp = 2;
//		System.out.println(Arrays.toString(iArr));
		Arrays.sort(iArr1, 0, iArr1.length);
		System.out.println(Arrays.toString(iArr1));
	}
	public void method3() {
		int[] iArr = {2, 5, 4, 1, 3, 10, 1, 3, 5, 3, 100, -3, 94, 7, -32};
		int[] iArr2 = {2, 5, 4, 1, 3, 10, 1, 3, 5, 3, 100, -3, 94, 7, -32};
		String[] iArr3 = {"ab", "cd", "de", "fg"};
		int[] iArr4 = {2, 5, 4, 1, 3, 10, 1, 3, 5, 3, 100, -3, 94, 7, -32};
		// 오름차순
		for (int i = 0 ; i < iArr.length ; i++) { 
			for (int j = i+1 ; j < iArr.length ; j++) {
				if (iArr[i] > iArr[j]) {
					int temp = iArr[i];
					iArr[i] = iArr[j];
					iArr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(iArr));
		Arrays.sort(iArr2, 0, iArr2.length);
		System.out.println(Arrays.toString(iArr2));
		// 내림차순
		for (int i = 0 ; i < iArr4.length ; i++) { 
			for (int j = i+1 ; j < iArr4.length ; j++) {
				if (iArr4[i] < iArr4[j]) {
					int temp = iArr4[i];
					iArr4[i] = iArr4[j];
					iArr4[j] = temp;
				}
			}
		}
		Arrays.sort(iArr3,Collections.reverseOrder());
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(iArr4));
	}
	
	public void method4() {
		
		int [] iArr = {2, 5, 4, 1, 3, -1, 50, -3, 7};
		Arrays.sort(iArr, 0, iArr.length);
		System.out.println(Arrays.toString(iArr));

	}
	
	public void method5() {
		
	}
	
}
