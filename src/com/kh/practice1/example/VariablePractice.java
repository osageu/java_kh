package com.kh.practice1.example;
import java.util.Scanner;
public class VariablePractice {
	public void method1() {
		
		Scanner osageu = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = osageu.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		
		int age = osageu.nextInt();
		osageu.nextLine();
		
		System.out.print("성별을 입력하세요 (남/여) : ");
		
		char gender = osageu.nextLine().charAt(0);
		
		System.out.print("키를 입력하세요 (cm) : ");
		
		double height = osageu.nextDouble();
		
		System.out.println("키 " + height + "인 " + age + "살 " + gender +"자 " + 
		name + "님 반갑습니다^^");
	}
	
	public void method2() {
		Scanner osageu = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int first = osageu.nextInt();
		
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int second = osageu.nextInt();
		
		System.out.println(" ");
		System.out.println("더하기 결과 : " + (first + second));
		System.out.println("빼기 결과 : " + (first - second));
		System.out.println("곱하기 결과 : " + (first * second));
		System.out.println("나누기 몫 결과 : " + (first / second));
	}
	
	public void method3() {
		Scanner osageu = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double hori = osageu.nextDouble();
		
		System.out.print("세로 : ");
		double vert = osageu.nextDouble();
		
		System.out.println(" ");
		System.out.println("면적 : " + (hori * vert));
		System.out.println("둘레 : " + (2*hori + 2*vert));
	}
	
	public void method4() {
		Scanner osageu = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : " );
		String apple = osageu.nextLine();
		
		char fruit1 = apple.charAt(0);
		char fruit2 = apple.charAt(1);
		char fruit3 = apple.charAt(2);
		
		System.out.println(" ");
		System.out.println("첫 번째 문자 : " + fruit1);
		System.out.println("두 번째 문자 : " + fruit2);
		System.out.println("세 번째 문자 : " + fruit3);
		
	}
}