package com.hw2.run;
import com.hw2.controller.*;

public class Run {

	public static void main(String[] args) {

		NonStaticSample osageu = new NonStaticSample();
		
		// 1)
		int aa = 5;
		System.out.print("- 크기가 " + aa + "인 배열의 랜덤값 : ");
		int[] arr = osageu.intArrayAllocation(aa);
		osageu.display(arr);
		System.out.println();
		
		// 2)
		System.out.print("- 내림차순 출력 : ");
		osageu.sortDescending(arr);
		System.out.println();
		
		// 3)
		System.out.print("- 오름차순 출력 : ");
		osageu.sortAscending(arr);
		System.out.println();
		
		// 4)
		System.out.println();
		String str1 = "apple";
		char c1 = 'p';
		System.out.println("- " + str1 + " 문자열에 " + c1 + "의 갯수 : " + osageu.countChar(str1, c1));
		
		// 5)
		int num1 = 13;
		int num2 = 7;
		System.out.println("- " + num1 + "과(와) " + num2 + "사이 정수들의 합계 : " + osageu.totalValue(num1, num2));
		
		// 6)
		String str2 = "programming";
		int index = 3;
		System.out.println("- " + str2 + " 문자열의 " + index + "번 인덱스 문자 : " + osageu.pCharAt(str2, index));
		
		// 7)
		String str3 = "JAVA";
		String str4 = "programming";
		System.out.println("- " + str3 + "와 " + str4 + "을(를) 합친 문자열 : " + osageu.pConcat(str3, str4));
		
	}

}
