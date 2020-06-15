package com.kh.chap06_method.part2_overloadingTest;

public class OverloadingTest {
	
	// osageu.test();
	public void test() {
		
	}
	
	// osageu.test(10);
	public void test(int a) {
		
	}
	
	// osageu.test(10, "apple");
	public void test(int a, String s) {
		
	}
	
	// osageu.tset("apple", 10);
	public void test(String s, int a) {
		
	}
	
	// osageu.test(10, 5);
	public void test(int a, int b) {
		
	}
	
	public void test(int a, int b, String s) {
		
	}
	
	public int test(int a, String s, int c) {
		return 0;
	}
	
	protected void test (String s, int e, int a) {
		
	}
	
	// 결론 : 접근제한자, 반환형 상관없이 무조건 매개변수의 자료형, 순서, 갯수가 달라야 오버로딩이 가능
}
