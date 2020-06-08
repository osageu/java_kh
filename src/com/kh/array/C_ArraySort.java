package com.kh.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C_ArraySort {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	// 배열 정열
	public void method1() {
		// 변수를 가지고 값을 변경해보자
		int num1 = 10;
		int num2 = 20;
		System.out.println("===== 변경 전 =====");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println();
		System.out.println("===== 변경 후 =====");
		num1 = num2; // num1 = 20, num2 = 20;
		num2 = num1; // num1 = 20, num2 = 20;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
}
