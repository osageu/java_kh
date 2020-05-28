package com.kh.variable;

public class C_Casting {
	
	public void rule1() {
		
	}
	
	public void rule2() {
		
		double d2 = 5.89;
		int i = (int)d2;
		System.out.println("i : "+ i );
		
		int i2 = 10;
		int isSum = (int)(d2 + i2);
		System.out.println("isSum : " + isSum);
		
		int iSum2 = (int)d2 + i2;
		System.out.println("iSum2 : " + iSum2);
		System.out.println("new");
		
		byte b1 = 1;
		short s1 = 2;
		
		// byte bSum = b1 + s1;
		// short sSum = b1 + s1;
		// 해결 1) 연산 결과를 byte 또는 short로 강제형변환 후 해당 변수에 담기
		byte bSum = (byte)(b1 + s1);
		short sSum = (short)(b1 + s1);
		// 해결 2) 연산 결과를 int형 변수에 담기
		int iSum = b1 + s1;
		
		System.out.println("new test");
		
	}
}
