package com.kh.operator;

public class C_Arithmetic {
	public void method1() {
		// 연산 순서 ; '*' -- '/' -- '%' -- '>' -- '+' -- '-' 
		
		int  a= 5; // a5 
		int  b= 10; // a5 b10
		int  c= (++a) + b; // a6 b10 c16
		int  d= c / a; // a6 b10 c16 d2
		int  e= c % a; // a6 b10 c16 d2 e4 
		int  f= e++; // a6 b10 c16 d2 e4 f4
		int  g= (--b) + (d--); // a6 b9 c16 d1 e5 f4 g11
		int  h= 2; // a6 b9 c16 d1 e5 f5 g10
		int  i= a++ +b / (--c / f) * (g-- - d) % (++e + h); // // a7 b9 c15 d1 e6 f4 g10 h2 i
		
//		System.out.println("a + b = " + (a + b));
//		System.out.println("a + b = " + (a - b));
//		System.out.println("a + b = " + (a * b));
//		System.out.println("a + b = " + (a / b)); // 몫
//		System.out.println("a + b = " + (a % b)); // 나머지
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		
	}
	
}
