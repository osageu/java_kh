package com.inherit.hw1.run;
import com.inherit.hw1.model.vo.*;
import java.util.*;
public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose : ");
		String input = sc.nextLine();
		
		switch(input) {
		case "s" : student(); break;
		case "e" : employee(); break;
		}
		
	}
	
	public static void student() {
		Student[] osageu = new Student[3];
		osageu[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		osageu[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		osageu[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		for ( int i = 0 ; i < osageu.length ; i++) {
			System.out.println(osageu[i].info());
		}
	}
	
	public static void employee() {
		Scanner sc = new Scanner(System.in);
		Employee[] sakki = new Employee[10];
		int count = 0;
		
		while(true) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("부서 : ");
			String dept = sc.nextLine();
			
		
			sakki[count] = new Employee(name, age, height, weight, salary, dept);
			count++;
			
			System.out.print("계속 등록하겠습니까? : ");
			char yn = sc.nextLine().charAt(0);
			if ( yn == 'y' || yn == 'Y') {
				continue;
			} else if ( yn == 'n' || yn == 'N') {
				Employee[] copy = Arrays.copyOf(sakki, count);
				for ( int i = 0 ; i < copy.length ; i++) {
					System.out.println(copy[i].info());
				}
				break;
			}
		}
	}

}
