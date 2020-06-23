package com.kh.chap01_math.run;

public class Run {

	public static void main(String[] args) {
		
		/*
		 *  API (Application Programming Interface)
		 *  : 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스
		 *  
		 *  1. Math
		 *  : 상수필드(public static final) + static method
		 *  : 객체 생성할 필요없이 Math. 으로 접근해서 가져다 쓸 수 있음!!
		 *  : "싱글톤패턴 (Singleton pattern)" --> application시작될 때 최초 단 한번만 메모리(static)에 할당하고 공유(재사용)
		 *  
		 */
		
		// 파이
		System.out.println("파이 : " + Math.PI);
		
		// 절댓값
		System.out.println("절댓값 : " + -23 + " --> " + Math.abs(-23));
		
		// 올림 & 반올림 & 버림
		System.out.println("올림 : " + 4.328 + " --> " + Math.ceil(4.328));
		System.out.println("반올림 : " + 4.223 + " --> " + Math.round(4.223));
		System.out.println("버림 : " + 4.823 + " --> " + Math.floor(4.823));
		
		// 가장 가까운 정수값
		System.out.println("가까운 정수(실수형) : " + 3.501  + " --> " + Math.rint(3.501));
		
		// 제곱근
		System.out.println("제곱근 : " + 2  + " --> " + Math.sqrt(2));
		
		// 제곱
		System.out.println("제곱 : " + "2^10" + " --> " + Math.pow(2, 10));
		
	}

}
