package com.kh.operator;

public class B_InDecrease {
	// 증감연산자
	public void method1() {
		//전위연산 테스트 --> 연산 후 출력
		int num1 = 10;
		
		System.out.println("기존 num1의 값 : " + num1);
		System.out.println("전위 증가 1번 : " + ++num1);
		System.out.println("전위 증가 2번 : " + ++num1);
		System.out.println("전위 증가 3번 : " + ++num1);
		System.out.println("최종 :  " + num1);
		
		int num2 = 101;
				
		//후위연산 테스트 --> 기존 값 출력 후 연산
		System.out.println("기존 : " + num2);
		System.out.println("후위 증가 1번 : " + num2++);
		System.out.println("후위 증가 2번 : " + num2++);
		System.out.println("후위 증가 3번 : " + num2++);
		System.out.println("최종 : " + num2);
	}
	
	public void method2() {
		int a = 10;
		int b = ++a;
		System.out.println("a : " + a + ", b : " + b);
		
		int c = 10;
		int d = c++;
		System.out.println("c : " + c + ", d : " + d);
		System.out.println("=================");
		
		int num1 = 20;
		int result = num1++ * 3;
		System.out.println(result);
		
		int num2 = 20;
		int result2 = ++num2 * 3;
		// +num2; num2 = num2+1
	}
	
	public void method3() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++); // a = 10(11)
		// a = 11
		System.out.println((++a) + (b++)); // a=12, b=20(21) ==> 32출력
		// a =12, b=21
		System.out.println((a++) + (--b) + (--c)); // a=12(13), b=20
		// a= 13, b=20, c=29
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
	}
		
}
	


















