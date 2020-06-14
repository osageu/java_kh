package com.hw1.run;

import com.hw1.controller.*;

public class Run {

	public static void main(String[] args) {
		
		NonStaticSample osageu = new NonStaticSample();
		
		// 1)
		System.out.print("1. 랜덤 값 : ");
		osageu.printLottoNumber();
		System.out.println();
		
		// 2)
		int aa = 5;
		char bb = 'a';
		System.out.printf("2. %c문자 %d개 출력 : ", bb, aa);
		osageu.outputChar(5,'a'); 
		System.out.println();
		
		// 3)
		System.out.println("3. 랜덤 영문자 출력 : " + osageu.alphabette());
		
		// 4)
		String cc = "apple";
		int d1 = 2;
		int d2 = 4;
		System.out.printf("%s의 %d번 %d번 인덱스 사이의 값 출력 : %s", cc, d1, d2, osageu.mySubstring(cc, d1, d2));
		
	}

}
