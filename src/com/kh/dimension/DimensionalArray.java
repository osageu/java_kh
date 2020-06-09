package com.kh.dimension;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DimensionalArray {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	
	// 이차원 배열 : 일차원 배열 여러 개를 하나로 묶은 것이 이차원 배열
	public void method1() {
		/*
		 * int[] arr ;
		 * int arr[] ;
		 * 1. 이차원 배열 선언
		 * 		[표현법]
		 * 		자료형 배열명 [] [];
		 *		자료형 [] 배열명 [];
		 * 		자료형 [] [] 배열명;
		 * 
		 */
		int arr1[][];
		int[] arr2[];
		int[][] arr3;
		
		/*
		 *  2. 이차원 배열 할당
		 *  	배열명 = new 자료형 [행크기][열크기];
		 */
		arr3 = new int[2][4];
		
		// 위의 과정 동시에 진행 (선언과 동시에 할당)
		int[][] arr = new int[3][5];
//		System.out.println(Arrays.toString(arr[1]));
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[0][0]);
		
	}
	
}
