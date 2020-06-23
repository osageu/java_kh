package mvc2.view;
import java.util.Scanner;

import mvc2.controller.LibraryManager;
import mvc2.model.vo.*;

public class LibraryMenu {
	
	// field
	LibraryManager lm = new LibraryManager();
	Scanner sc = new Scanner(System.in);
	
	// constructor
	public LibraryMenu() {
		
	}
	
	// method
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		Member mem = new Member(name, age, gender);
		
		lm.insertMember(mem);
		while(true) {
			
			System.out.println("====== Menu ======");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기");
			System.out.print("Select Menu : ");
			int select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1 : System.out.println(lm.myInfo().getCouponCount()); break;
			case 2 : selectAll(); break;
			case 3 : searchBook(); break;
			case 4 : rentBook(); break;
			case 0 : System.out.println("Exit Program.."); return;
			}
			
		}
		
	}
	
	public void selectAll() {
		Book[] bList = lm.selectAll();
		for (int i = 0 ; i < bList.length ; i++) {
			System.out.println(i+1 + "번 도서 : " + bList[i]);
		}
		return;
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		
		Book[] searchList = lm.searchBook(keyword);
		for (Book a : searchList) {
			System.out.println(a);
		}
		
	}
	
	public void rentBook() {
		selectAll();
		System.out.print("대여할 도서 번호 선택 : ");
		int num = sc.nextInt();
		int result = lm.rentBook(num-1);
		switch(result) {
		case 0 : System.out.println("성공적으로 대여되었습니다."); break;
		case 1 : System.out.println("나이 제한으로 대여 불가능입니다."); break;
		case 2 : System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요"); break;
		}
		return;
	}
	
}
