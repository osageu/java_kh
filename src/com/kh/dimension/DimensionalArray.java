package com.kh.dimension;

import java.util.*;

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
		
		System.out.println("행의 길이 : " + arr.length);
		
		// 각 행별로 열의 길이를 알아내야 함.
		System.out.println("열의 길이 : " + arr[0].length);
		System.out.println("열의 길이 : " + arr[1].length);
		System.out.println("열의 길이 : " + arr[2].length);
		
		// *****
		// *****
		// *****
		
		for (int i = 0 ; i < arr.length ; i++) { // i == 행의 index
			for (int j = 0 ; j < arr[i].length ; j++) { // j == 열의 index
				System.out.print("*"); 
			}
			System.out.println();
		}
		
		for (int i = 0 ; i < arr.length ; i++) { // i == 행의 index
			for (int j = 0 ; j < arr[i].length ; j++) { // j == 열의 index
				System.out.print(arr[i][j] + " "); 
			}
			System.out.println();
		}
		
		// 가변 배열
		int[][] test = new int[3][];
		test[0] = new int[3];
		test[1] = new int[5];
		test[2] = new int[7];
		
		for (int i = 0 ; i < test.length ; i++) { // i == 행의 index
			for (int j = 0 ; j < test[i].length ; j++) { // j == 열의 index
				System.out.print(test[i][j] + " "); 
			}
			System.out.println();
		}
		
	}
	
	public void method2() {
		
		int[][] arr = new int[3][5];
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		int k = 1;
		for (int i = 0 ; i < arr.length ; i++) { // row for문 (i == row index)
			for (int j = 0 ; j < arr[i].length ; j++) { // column for문 (j == colum index)
				arr[i][j] = k++;
			}
		}
		
		for (int i = 0 ; i < arr.length ; i++) {
			for (int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public void method3() {
		
		// 이차원 배열의 선언 및 할당과 동시에 초기화
		int[][] 배열 = { {1, 2, 3, 4, 5} , {6, 7, 8, 9, 10} , {11, 12, 13, 14, 15} };
		for (int i = 0 ; i < 배열.length ; i++) {
			for (int j = 0 ; j < 배열[i].length ; j++) {
				System.out.printf("%-2d", 배열[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void method4() {
		
		// 가변 배열
		// row는 정해져있으나 각 row에 대한 column의 갯수가 정해지지 않은 상태
		int[][] arr = new int[3][]; // 가변 배열 할당
		arr[0] = new int[3];
		arr[1] = new int[5];
		arr[2] = new int[7];
		
		int k = 1;
		for (int i = 0 ; i < arr.length ; i++) {
			for (int j = 0 ; j < arr[i].length ; j++) {
				arr[i][j] = k++;
				k++;
				k++;
			}
		}
//		for (int i = 0 ; i < arr.length ; i++) {
//			for (int j = 0 ; j < arr[i].length ; j++){
//				arr[i][j] = j+1;
//			}
//		}
		
		for (int i = 0 ; i < arr.length ; i++) {
			for (int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public void method5() { // method open
		
		int[][] arr = { {1, 2} , {3} , {4, 5, 6} };
		
		for (int i = 0 ; i < arr.length ; i++) { // for open
			// row 1 : 1 2
			// row 2 : 3
			// row 3 : 4 5 6
			System.out.printf("row %d : ", i+1);
			for (int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		} // for close
		
	} // method close
	
	public void method6() {
		
		int[][] arr = new int[2][4];
		int korean = 0;
		int english = 0;
		
//		for (int i = 0 ; i < arr[0].length ; i++) {
//			if (i == 3) {
//				arr[0][i] = korean;
//				break;
//			}
//			System.out.print("국어점수: "); // o o o sum1
//			arr[0][i] = sc.nextInt();
//			korean += arr[0][i];
//		}
//		
//		for (int i = 0 ; i < arr[1].length ; i++) {
//			if (i == 3) {
//				arr[1][i] = english;
//				break;
//			}
//			System.out.print("영어점수: "); // o o o sum2
//			arr[1][i] = sc.nextInt();
//			english += arr[1][i];
//		}
//		
//		for (int i = 0 ; i < arr.length ; i++) {
//			for (int j = 0 ; j < arr[i].length ; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
		for (int i = 0 ; i < arr.length ; i++) {
			for (int j = 0 ; j < arr[i].length-1 ; j++) {
				if (i == 0) {
					System.out.print("국어점수 : ");
				} else {
					System.out.print("영어점수 : ");
				}
				arr[i][j] = sc.nextInt();
				arr[i][3] += arr[i][j];
			}
		}
		
		for (int i = 0 ; i < arr.length ; i++) {
			for (int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public void method7() {
		
		int[][] arr = new int[4][4];
		int nansu = ran.nextInt(10) + 1;
		
//		4x4 행렬을 만들고 오른쪽, 아래에 합계를 구하고 오른쪽아래에 최종합
//		3x3 에는 1~10까지 난수를 넣어줌(중복안되게 해보세요..)
		
	}
	
}
