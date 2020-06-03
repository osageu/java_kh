package com.kh.chap02.loop;


import java.util.Random;
import java.util.Scanner;

/**
 * @author osageu
 */
public class A_For {
	Scanner osageu = new Scanner(System.in);
	Random ran = new Random();
	/*
	 * < 반복문 > 
	 * 프로그램 수행흐름을 제어하는 제어문 중 하나
	 * 어떤 실행코드를 반복적으로 수행시킬 수 있음
	 * for문 vs while(or do-while)문
	 * for ( [초기식] ; [조건식] ; [증감식] ) { // ;은 꼭 있어야 하는 구분자
	 * 		... 반복적으로 실행시키고자 하는 실행 구문 ...
	 * }
	 * for문을 만나는 순간,
	 * 초기식 --> 조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 * 			--> 조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 * 			--> 조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 * 			--> 조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 * 			....
	 * 			....
	 * 			--> 조건식 검사 --> false일 경우 종료
	 * 1) 초기식 : 반복문이 수행될 때 "단 한 번만 실행되는 구문" (보통 반복문 안에서 사용될 변수를 선언 및 초기화 하는 부분)
	 * 2) 조건식 : 반복문이 수행될 "조건을 작성하는 구문" (true면 반복실행하다 false가 나오면 빠져나옴, 보통 초기식에서 선언된 변수를 가지고 작성)
	 * 3) 증감식 : 반복문을 제어하는 변수 값을 증감시키는 부분 (보통 증감연산자(++,--)를 가지고 작성)
	 * 
	 */
	public void method1() {
		for( double i = 1 ; i<=5.00000000000000000000001 ; i++ ) { // 1에서 5까지 1씩 증가할 동안 반복한다.
			System.out.println("안녕하세요");
		}
		/*
		 *  i = 1 출력 ++
		 *  i = 2 출력 ++
		 *  i = 3 출력 ++
		 *  i = 4 출력 ++
		 *  i = 5 출력 ++
		 *  i = 6 종료
		 */
	}
	
	public void method2() {
		// 1
		// 2
		// 3
		// 4
		// 5
//		for (double i = 1.3 ; i < 7.34 ; i++) {
//			System.out.println("i : "+ i);
//		}
		for (int i = 1 ; i < 6 ; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void method3() {
		// 5
		// 4
		// 3
		// 2
		// 1
		for (int i = 5 ; i >= 1 ; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void method4() {
		// 1 2 3 4 5 ... 9 10
		
		for(int i = 0 ; i <= 9 ; i++) { // 0에서 9까지 1씩 증가하는 동안 반복 ==> 10번 
			System.out.print(i + 1 + " ");
		}
		
		System.out.println();
		
		for (int i = 2 ; i <= 11 ; i++) { // 2에서 11까지 1씩 증가하는 동안 반복 ==> 10번
			System.out.print(i - 1 + " ");
		}
	}
	
	public void method5() {
		// 1부터 10사이의 홀수만을 출력
		// 1 3 5 7 9
		for (int i = 1 ; i <= 10 ; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			} /* else {
				System.out.print("[" + i + "] ");
			}*/
		}
		
		System.out.println();
		
		for (int i = 1 ; i <= 10 ; i+=2) { // 1에서 10까지 2씩 증가하는 동안 반복
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for (double i = 1.1 ; i <= 10 ; i+=0.9) { // 1.1에서 10까지 0.9씩 증가하는 동안 반복
			System.out.printf("%.1f ", i);
		}
		
		System.out.println();
		
		for (double i = 1.5 ; i <= 10 ; i*=2) { // 1.5에서 10까지 2씩 곱하는 동안 반복
			System.out.printf("%.1f ", i);
		}
		
	}
	
	public void method6() {
		// 1부터 10까지의 정수들의 합계
		int sum = 0;
		// sum += 1; 
		// sum += 2;
		// ....
		// sum += 10;
		for (int i = 1 ; i <=10 ; i++) {
			sum += i;
			/* if (i==10) {
				System.out.println(sum);
			}*/
		}
		System.out.println("sum : " + sum); 
	}
	
	public void method7() {
		// 1부터 사용자가 입력한 수까지의 합계를 구하시오
		System.out.print("정수 : ");
		int input = osageu.nextInt();
		
		int sum = 0;
		for (int i = 1 ; i <= input ; i++) { // 1부터 input까지 1씩 증가하는 동안 반복
			sum += i;
		}
		System.out.printf("1부터 %d까지의 총 합계 : %d", input, sum);
	}
	
	public void method8() {
		// 1부터 random값(범위지정 가능; 1~10)까지의 합계
		/*
		 * java.lang.Math 클래스에서 제공하는 random() method를 사용해서 랜덤값 발생가능
		 * Math.random() --> 0.0 ~ 0.9999999999사이의 랜덤값 발생
		 */
		double value = Math.random(); // 실수형 난수
		int ivalue = (int)(value * 10); // 정수형 난수
		char Cvalue = (char)((value * 26) + 65); // 대문자 난수
		char cvalue = (char)((value * 26) + 97); // 소문자 난수
		int ivalue2 = (int)(value * 10 + 1);
		
		int sum = 0;
		for(int i = 1 ; i <= ivalue2 ; i++) {
			sum += i ;
		}
		System.out.println("1부터 " + ivalue2 + "까지의 총 합계 : " + sum);
	}
	
	public void method9() {
		// 5~584
		double value = Math.random();
		int value2 = (int)(value*10);
		System.out.println(value2);
		int ivalue = (int)(value * 579 + 5); // 0.00 ~ 0.99 ==> 0.00 ~ 579.99 ==> 5.00 ~ 584.99 ==> 5 ~ 584
		System.out.println(ivalue);
		for (int i = 1 ; i <= 584 ; i++) {
			if(ivalue==583) {
				System.out.println("yes");
			} 
	
		int aa = ran.nextInt(49) + 7;// 7~55 ==> nextInt(max - min + 1) + min
		System.out.println(aa);
		}
	}
	
	public void method10(	) {
		// 구구단 2단 출력하기
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 3 = 6
		// 2 x 4 = 8
		// 2 x 5 = 10
		for (int i = 1 ; i <= 9 ; i++) { // 1에서부터 9까지 1씩 증가하는 동안 반복 ==> 9번
//			System.out.println("2 x " + i + "= " + 2 * i);
			System.out.printf("2 x %d = %2d\n", i,i*2);
		}
	}
	
	public void method11() {
		System.out.printf("구구단(2~9단) : ");
		int input = osageu.nextInt();
		
		if (input >= 2 && input <= 9) { // 잘 입력했을 경우 --> 반복문을 통해 출력
			for (int i = 1 ; i <=9 ; i++) {
				System.out.printf("%d x %d = %2d\n", input, i, i*input);
			}
		} else { // 잘못 입력했을 경우 --> 오류문구
			System.out.println("ERROR");
		}
	}
	
	public void method12() {
		// 2~9사이의 랜덤단을 출력하기
		int aa = ran.nextInt(8) + 2; 
		if (aa >= 2 && aa <= 9) { // 잘 입력했을 경우 --> 반복문을 통해 출력
			for (int i = 1 ; i <=9 ; i++) {
				System.out.printf("%d x %d = %2d\n", aa, i, i*aa);
			}
		} else { // 잘못 입력했을 경우 --> 오류문구
			System.out.println("ERROR");
		}
		
		int random = (int)(Math.random() * 8 + 2); // 2.00 ~ 9.99 ==> 2 ~ 9
	}
	
	public void method13() {
		// 입력받은 문자을 각 index별 문자를 추출 후 출력
		// apple로 입력받았다면 ==> str ==> a, p, p, l, e
		System.out.print("단어 : ");
		String str = osageu.nextLine();
		System.out.println("str : " + str);
		System.out.println("문자열의 길이 : " + str.length());
		for (int i = 0 ; i <=str.length()-1 ; i++) { // 0에서 마지막 index까지 1씩 증가하는 동안 반복
			System.out.println(str.charAt(i));
		}
	}
	
	public void method14() {
		/*
		 * 중첩 for문
		 * 
		 * for (초기식1 ; 조건식1 ; 증감식1) {
		 * 	수행할 문장1;
		 * 		for (초기식2 ; 조건식2 ; 증감식2) {
		 * 			수행할 문장2;
		 * 		}
		 * 	수행할 문장3;
		 * }
		 */
		
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		for (int i = 1 ; i <=3 ; i++) { // 안 쪽 for문을 3번 반복 ==> 행 3번 반복
			for(int j = 1 ; j <=5 ; j++) { // 1~5까지 1씩 증가하는 동안 반복 ==> 열 5번 반복
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public void method15() {
		
		// *****
		// *****
		// *****
		for (int i = 0 ; i <= 2 ; i++) {
			for (int j = 0 ; j <= 4 ; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	public void method16() {
		// 0시 ~ 23시 59분
		// 0시 1분
		// 0시 2분
		// ...
		// ...
		// 1시 0분
		// ...
		// ...
		// 23시 0분
		// 23시 1분
		// ...
		// ...
		// 23시 59분
		//
		for (int hour = 0 ; hour <=23 ; hour++) {
			for (int min = 0 ; min <=59 ; min++) {
				System.out.printf("%d시 %d분", hour, min);
				System.out.println();
			}
			System.out.println();
		}
		
	}
	
	public void method17() {
		for (int i = 2 ; i <= 9 ; i++) {
			System.out.printf("=====%2d단=====\n",i );
			for(int j = 1 ; j <= 9 ; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
	}
}













