package com.kh.chap01_objectVSobectArray.run;
import java.util.Arrays;

import com.kh.chap01_objectVSobectArray.model.vo.*;

public class Run {
	
	public static void main(String[] args) {
		
		// 제품 객체 3개를 보관할 arr 배열 생성
		Product[] arr = new Product[3];
		
		// 각 인덱스에 제품객체들 담기
		arr[0] = new Product("galaxy", "samsung", 1000000);
		arr[1] = new Product("iphone", "apple", 550000);
		arr[2] = new Product("velvet", "LG", 800000);
		
		// 단순한 for문 (for - loop)
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i].info());
		}
//		
//		// 향상된 for문
////		int[] iArr = new int[3];
////		for (int number : iArr) {
////			System.out.print(number + " ");
////		}
		for (Product p : arr) {
			System.out.print(p.info() + "\n");
		}
		
	}
	
}
