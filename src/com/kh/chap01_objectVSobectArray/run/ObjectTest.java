package com.kh.chap01_objectVSobectArray.run;

import com.kh.chap01_objectVSobectArray.model.vo.*;
import  java.util.*;

public class ObjectTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Book[] osageu = new Book[3];
		
		// 1. 전체 도서 정보 입력
		for (int i = 0 ; i < 3 ; i++) {
			
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			osageu[i] = new Book(title, author, price, publisher);
			
		}
		
		// 2. 전체 도서 정보 출력
		for (int i = 0 ; i<osageu.length ; i++) {
			System.out.println(osageu[i].info());
		}
		
		// 3-1. 도서 제목 검색하기 기능 
		
//		System.out.print("검색할 책 제목 : ");
//		String search = sc.nextLine();
//		for (int i = 0 ; i < osageu.length ; i++) {
//			if (osageu[i].getTitle().contains(search)) {
//				System.out.println(osageu[i].getTitle());
//			}
//		}
		
		// 3-2. 도서 제목 검색하기 기능 
		
		System.out.print("검색할 책 제목 : ");
		String search = sc.nextLine();
		for (int i = 0 ; i < osageu.length ; i++) {
			if (osageu[i].getTitle().indexOf(search) > -1) {
				System.out.println(osageu[i].getTitle());
			}
		}
	}

}
