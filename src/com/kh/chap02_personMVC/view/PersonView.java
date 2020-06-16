package com.kh.chap02_personMVC.view;

import java.util.*;
import com.kh.chap02_personMVC.controller.PersonController;
import com.kh.chap02_personMVC.model.vo.Person;

/**
 * @author user1
 *
 */

// View : 사용자(client)의 시각적인 부분(화면)을 담당
//          출력, 입력을 진행할 것임
//          여기서 보여지는 화면(메뉴)을 통해서 요청이 진행
//          요청을 한다는 건 Controller class의 method를 호출한다는 의미

public class PersonView {
	
	// field
	// client에게 값을 입력받기 위한 Scanner 객체 global variable로 생성해놓음
	private Scanner sc = new Scanner(System.in);
	// client request 처리할 controller class 객체 global variable로 생성해놓음
	private PersonController pc = new PersonController();
	
	// constructor
	
	
	
	// method
	// 프로그램 실행과 동시에 제일 먼저 보여지는 메인 화면
	public void mainMenu() {
		
		// client가 종료하겠다는 의사를 밝힐 때 까지 main menu 반복적으로 출력
		while(true) {
			
			System.out.println("\n==== Main menu ====");
			System.out.println("1. 회원추가"); 						// 회원 추가로 넘어가는 method
			System.out.println("2. 회원 전체 조회");				// 회원 전체 조회로 넘어가는 method
			System.out.println("3. 회원 이름 검색"); 				// 회원 이름 검색으로 넘어가는 method
			System.out.println("4. 회원 평균 재산 조회"); 		// 회원 평균 재산 조회로 넘어가는 method
			System.out.println("9. 프로그램 종료"); 				// 프로그램 종료
			System.out.print("Select menu : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : insertPerson(); break;
			case 2 : printPerson(); break;
			case 3 : searchPerson(); break;
			case 4 : averagePerson(); break;
			case 9 : System.out.println("Exit the program"); return; // 아예 method를 빠져나가기 위해 return
			default : System.out.println("Error :: Select again!!");
			}
			
		}
		
	}
	
	
	// 회원 정보를 입력받은 후 입력받은 정보들로 "회원 추가 요청"하는 화면
	public void insertPerson() {
		
		System.out.println("\n=== 회원 정보 입력 ===");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("재산 : ");
		int wealth = sc.nextInt();
		
		// client가 입력한 정보들을 가지고 회원 추가 요청할것임
		// Controller에 있는 method 호출하겠다
		int result = pc.insertPerson(name, age, wealth);
		if (result  == 1) {
			System.out.println("회원 추가 성공!!");
		} else if (result == 0) {
			System.out.println("회원 추가 실패...");
		}
		
	}
	
	// 현재 추가되어있는 회원 전체 조회 요청하는 화면
	public void printPerson() {
		
		System.out.println("\n=== 회원 정보 조회 ===");
		
		// 현재 회원 수 몇 명인지 조회 요청
		// Controller의 method 호출하겠다!!
		int count = pc.selectCount();
		if (count == 0) {
			System.out.println("현재 추가된 회원이 없습니다.");
		} else {
			Person[] people = pc.selectPeople();
			for (int i = 0 ; i < count ; i++) {
				System.out.println(people[i].info());
			}
		}
		
	}
	
	// 현재 추가되어있는 회원의 이름 검색을 요청하는 화면
	public void searchPerson() {
		
		System.out.println("\n==== 회원 정보 검색 ====");
		System.out.print("검색할 이름 : ");
		String name = sc.nextLine();
		
		int count = pc.selectCount();
		if (count == 0) {
			System.out.println("현재 추가된 회원이 없습니다.");
		} else {
			Person[] people = pc.selectPeople();
			for (int i = 0 ; i < count ; i++) {
				if (people[i].getName().indexOf(name) > -1) {
					System.out.println(people[i].info());
				} else {
					System.out.println("No matched");
				}
			}
		}
		
//		Person search = pc.searchPerson(name);
//		if (search == null) {
//			System.out.println("No matched");
//		} else {
//			System.out.println(search.info());
//		}
		
	}
	
	// 회원 평균 재산 조회
	public void averagePerson() {
		
		System.out.println("\n==== 회원 평균 재산 조회 ====");
		int count = pc.selectCount();
		if (count == 0) {
			System.out.println("현재 추가된 회원이 없습니다.");
		} else {
			System.out.println("전체 회원 평균 재산 : " + pc.averageWealth() + "원");
		}
		
//		
//		int count = pc.selectCount();
//		int average = 0;
//		if (count == 0) {
//			System.out.println("현재 추가된 회원이 없습니다.");
//		} else {
//			Person[] people = pc.selectPeople();
//			for (int i = 0 ; i < count ; i++) {
//				average += people[i].getWealth();
//			}
//		}
//		System.out.println("전체 회원의 평균 재산 : " + average/3 + "원");
		
	}
	
}
