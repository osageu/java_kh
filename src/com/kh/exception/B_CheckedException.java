package com.kh.exception;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	
	// CheckedException : 반드시 예외처리를 해야하는 classes
	
	public void method1() throws IOException{
		
		method2();
		
	}
	
	public void method2() throws IOException{
		
		// 1. try ~ catch : 여기서 처리
		//	try {
		//		method3();
		//	} catch (IOException e) {
		//		System.out.println("예외가 발생!!");
		//	}
		
		// 2. throws : 떠넘기다
		method3();
		
	}
	
	public void method3() throws IOException{
		
		// 기존에 사용자에게 값을 입력받았을 때의 방법
		// 문자열만 입력받을 수 있음 = readLine() : String
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수입력 : ");
		// int num = Integer.parseInt(br.readLine()); "10" --> 10 
		
		// 1. try~catch 방법 : 여기서 바로 예외를 처리하겠다. 
//		String num = "";
//		try {
//			num = br.readLine();
//		} catch (IOException e) {
//			System.out.println("예외가 발생했습니다!");
//		}
//		System.out.println(num);
		
		// 2. throws : 현재 method를 호출한 곳으로 위임하겠다.
		String num = br.readLine();
		System.out.println(num);
	}
	
}
