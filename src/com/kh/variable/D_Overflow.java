package com.kh.variable;

public class D_Overflow {
	
	public void overflow()	{
		// Data type value storage range of byte : -128 ~ 127: 
		// byte bNum = 128; --> compile error
		byte bNum = 127;
		bNum++; // bNum value 1증가
		bNum--; // bNum value 1감소
		System.out.println("bNum : " + bNum); // 127 +1 -1 = 127
		
		// Data type value storage range of integer : -21억... ~ 21억...
		int num1 = 1000000; // 100만
		int num2 = 700000; // 70만
		int num3 = num1 * num2;
		System.out.println(num3); // -7900만이 나오는 것은 integer storage scale을 여러 번 순환하고 남은 나머지라서.
		
		long result1 = num1 * num2; // 곱셈연산을 하는 순간 integer value이기 때문에 overflow가 발생함.
		long result2 = num1 * (long)num2; // 형변환이 곱셈연산보다 앞섬.
		
		System.out.println(result2);
		
	}
	
}
