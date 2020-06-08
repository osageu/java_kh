package com.kh.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class D_ArrayOverlap {
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	// 중복제거
	public void method1() {
		// 사용자에게 입력받은 값을 매 번 0번 index에서부터 차곡차곡 담기
		// 단, 기존의 값들 중에서 방금 입력받은 값과 중복된 값이 있을 경우 다시 입력받게끔
		int[] iArr = new int[5];
		
		for (int i = 0 ; i < iArr.length ; i++) {
			System.out.print(i + "번째 정수값 : ");
			iArr[i] = sc.nextInt();
			for (int j = 0 ; j < i ; j++) {
				if (iArr[i]==iArr[j]) {
					System.out.println("중복값이 존재합니다. 다시 입력해주세요.");
					i--;
					break; // 중복된 오른쪽 index값과 굳이 연산할 필요 없다는 것을 알려줘서 연산적으로 효율적이게.
				}
			}
		}
		System.out.println(Arrays.toString(iArr));
	}
	
	public void method2() {
		int k = 0;
		while(k <=5 ) {
			int[] iArr = new int[5];
			
			for (int i = 0 ; i < iArr.length ; i++) {
				iArr[i] = ran.nextInt(10) + 1;
				for (int j = 0 ; j < i ; j++) {
					if (iArr[i] == iArr[j]) {
						i--;
						break;
					}
				}
			}
			Arrays.sort(iArr);
			System.out.println(Arrays.toString(iArr));
			k++;
		}
		
	}
	
	public void method3() {
		int [][] arr = new int[5][5];
		System.out.println(Arrays.toString(arr));
		
	}
}
