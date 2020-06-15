package com.hw2.run;
import java.util.Scanner;
import com.hw2.model.vo.Student;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] osageu = new Student[10];
		int count = 0;
		
		while(true) {
			
			// 사용자 입력 & 변수 초기화
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			
			System.out.print("반 : ");
			int classroom = sc.nextInt();
			sc. nextLine();
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			
			System.out.print("수학점수 : ");
			int math = sc.nextInt()	;
			sc.nextLine();
			
			// 객체배열 초기화 
			osageu[count] = new Student(grade, classroom, name, kor, eng, math);
			count++;
			
			// 계속 추가할 지 
			System.out.print("계속 추가할껴?(y/n) : ");
			String yn = sc.nextLine();
			if (yn.equals("y")) {
				continue;
			} else if(yn.equals("n")) {
				break;
			}
			
		}
		for ( int i = 0 ; i < count ; i++) {
			System.out.print(osageu[i].info() + " 평균 : " + (osageu[i].getKor()+osageu[i].getEng()+osageu[i].getMath())/3 + "\n" );
		}
		
	}

}
