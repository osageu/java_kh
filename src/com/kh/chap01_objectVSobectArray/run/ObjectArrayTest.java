package com.kh.chap01_objectVSobectArray.run;
import java.util.*;

import com.kh.chap01_objectVSobectArray.model.vo.Book;
public class ObjectArrayTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		int[] arr = new int[3];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		  
		Book[] books = new Book[3];
		// books의 자료형 : Book[]
		// ==> reference variable
		// ==> 주소값을 가지는 변수
		
		books[0] = new Book();
		books[1] = new Book();
		books[2] = new Book();
		
		System.out.println(books);
		System.out.println(books[0]);
		System.out.println(books[0].getPrice());
		 */
		
		Book[] books = new Book[3];
		
		for (int i = 0 ; i < books.length ; i++) {
			
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			books[i] = new Book(title, author, price, publisher);
			
		}
		
		for (int i = 0 ; i < books.length ; i++) {
			System.out.println(books[i].info());
		}
		
		System.out.print("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		int count = 0;
		for (int i = 0 ; i < books.length ; i++) {
			if (books[i].getTitle().indexOf(search) > -1) {
				System.out.println(books[i].info());
				count++;
			}
//			if (i == books.length-1 && count ==0) {
//				System.out.println("검색되는 책이 없습니다.");
//			}
		}
		if (count ==0) {
			System.out.println("검색되는 책이 없습니다.");
		}
		
	}
}
