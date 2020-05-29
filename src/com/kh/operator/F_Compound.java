package com.kh.operator;

public class F_Compound {
	
	public void method1(){
		// 복합대입 연산자 :  산술연산자와 대입연산자를 함께 사용하는 연산자
		// a = a +3; ~ a += 3;
		// a = a -3; ~ a -= 3;
		// a = a *3; ~ a *= 3;
		// a = a / 3; ~ a /= 3;
		// a = a % 3; ~ a %=3 ;
		
		int num = 12;
		System.out.println("기존 num : " + num);
		
		num = num + 3;
		System.out.println("3 증가시킨 값 : " + num);
		
		num += 3;
		System.out.println("6 증가시킨 값 : " + num);
		
//		num =+ 3;
//		System.out.println("6 증가시킨 값? : " + num);
		
		num -= 5;
		System.out.println("5 감소시킨 값 : " + num);
		
		num *= 6;
		System.out.println("6배 증가시킨 값 : " + num);
		
		num /= 2;
		System.out.println("2배 감소시킨 값 : " + num);
		
		num %= 4;
		System.out.println("num을 4로 나눈 나머지 : " + num);
		
		double num2 = 34.5247575;
		num2 %= 17;
		System.out.println(num2);

	}
	
}
