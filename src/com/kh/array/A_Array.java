package com.kh.array;

import java.util.Arrays;

public class A_Array {
	// 배열 : "같은 자료형의 값"들을 하나의 공간에 담을 수 있는 개념
	// 				저장된 값마다 index가 지정됨 (index는 0부터 시작됨)
	//[표현법]
	// 자료형 배열명 [] ;
	// 자료형 [] 배열명 ;
	public void method1() {
		// 배열을 왜 쓰는지
		// 대량의 데이터를 보관하고자할 때, 각각의 변수를 만들어서 관리해야됨...
		
		// 1. 변수 선언
		int arr1 [];
//		int [] arr2;
		
		// 2. 배열 할당 (이 배열에 몇 개의 값들을 보관할건지 크기지정하는 과정, 그 갯수만큼 방이 만들어짐)
		//		배열명 = new 자료형[배열크기];
		arr1 = new int[5];
		
		// 3. 선언 및 할당
		int arr[] = new int[5];
		
		// 4. 값 초기화(대입)
		// 		배열명[index] = 값;
//		arr[0] = 0;
//		arr[1] = 1;
//		arr[2] = 2;
//		arr[3] = 3;
//		arr[4] = 4;
		
		// 배열 장점 : 반복문을 사용할 수 있다는 장점 
//		for (int i = 0 ; i <= 4 ; i++) // 0에서 부터 4까지 1씩 증가하는 동안 반복수행
		for (int i = 0 ; i <= arr.length-1 ; i++) {
			arr[i] = i;
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0 ; i <=arr.length-1 ; i++) {
			System.out.print(arr[i] + " ");
		}
	
	}
}
