package com.kh.practice2.example;
import java.util.Scanner;
public class CastingPractice {
	
	public void method1() {
		Scanner osageu = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char english1 = osageu.nextLine().charAt(0);
		int english2 = english1;
		
		System.out.println("\n" + english1 + " Unicode : " + english2);
	}
	
	public void method2() {
		Scanner osageu = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double data1 = osageu.nextDouble();
		osageu.nextLine();
		System.out.print("영어 : ");
		double data2 = osageu.nextDouble();
		osageu.nextLine();
		System.out.print("수학 : ");
		double data3 = osageu.nextDouble();
		
		System.out.println("\n총점 : " + (int)(data1 + data2 + data3));
		System.out.println("평균 : " + (int)(data1 + data2 + data3)/3);
	}
	
	public void method3() {
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		
		System.out.println( iNum1 - (2*iNum2) ); // 2
		System.out.println( (int)dNum ); // 2
		System.out.println( (0*iNum2) + (4*dNum) ); // 10.0
		System.out.println( (double)iNum1 ); // 10.0
		System.out.println( (double)iNum1 / iNum2 ); // 2.5
		System.out.println( dNum ); // 2.5
		System.out.println( (int)fNum ); // 3
		System.out.println( (0*iNum1) + (int)fNum ); // 3
		System.out.println( iNum1 / fNum );// 3.3333333
		System.out.println( iNum1 / (double)fNum ); // 3.333333333333335
		System.out.println( "'" + ch + "'" ); // 'A'
		System.out.println( (int)ch ); // 65
		System.out.println( (int)ch + iNum1 ); // 75
		System.out.println("'" + (char)(ch + iNum1) + "'"); // 'K'
	}
}
