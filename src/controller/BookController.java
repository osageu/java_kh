package controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.StringTokenizer;

import model.vo.Book;

public class BookController {
	
	// field
	private Book[] list = new Book[5];
	private int count = 4;
	{
		list[0] = new Book("자바의 정석", "제임스 고슬링", "나무", new Date(2018-1900, 4-1, 15), 20000);
		list[1] = new Book("여러분들 성공할꺼에요", "보람쌤", "KH", new Date(2019-1900, 6-1, 15), 30000);
		list[2] = new Book("API의 모든것", "강보람", "KH", new Date(2017-1900, 2-1, 13), 15000);
		list[3] = new Book("씨언어 프로그래밍", "김절차", "문학동네", new Date(2016-1900, 8-1, 30), 10000);
	}
	
	// constructor
	public BookController() {
		
	}
	
	// method
	// 1. 도서 전체 출력 기능 메소드
	public void printAll() {
		
		for (int i = 0 ; i < count ; i++) {
			System.out.println(list[i]);
		}
		
	}
	
	// 2. 도서 추가 기능 메소드
	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		
		int change = Integer.parseInt(newPrice);
		StringTokenizer stn = new StringTokenizer(newDate, "-");
		int a = Integer.parseInt(stn.nextToken());
		int b = Integer.parseInt(stn.nextToken());
		int c = Integer.parseInt(stn.nextToken());
		Date date = new Date(a-1900,b-1,c);
		
		list[count++] = new Book(newTitle, newAuthor, newPublisher, date, change); 
		// 1. 매개변수로 전달받은 newPrice값  ==>      String --> int로 변환 작업
		
		//      내용 작성
		
		// --------------------------------------------------------
		// 2. 매개변수로 전달받은 newDate값   ==>       String --> Date로 변환 작업
		//	  '-'를 구분자로 StringTokenizer를 이용하여 문자열 분리 후 각각 년,월,일 을 Date에 적용
	
		//      내용 작성
		
		
		// ------------------------------------------------------
		// 3. 나머지 전달받은 값들과 위에서 변환작업을 해준 price와 date값을 가지고
		//	  매개변수 생성자를 통해 생성한 값 4번 인덱스에 대입
	
	}
	
	
	// 3. 도서 출간일 출력 기능 메소드
	public String printBookPublishDate() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 출간");
		String change = sdf.format(list[count-1].getPublishDate());
		return change;
		// 마지막 도서의 출간일 출력
		// "xxxx년 xx월 xx일 출간" 과 같은 패턴으로 출력
		
		// SimpleDateFormat을 이용하여 출력
		
		//		내용 작성
		
		
	}
	
	
	// 4. 도서 검색 기능 메소드
	public void searchBook(String searchTitle) {
		
		for (int i = 0 ; i < count ; i++) {
			if (list[i].getTitle().contains(searchTitle)==true) {
				System.out.println(list[i].toString());
			}
		}
		
		// 도서 리스트를 전체적으로 조회하면서 (for문 이용)
		// 전달받은 검색명을 포함한!! 도서들 출력
		
	
		
	}
	
	
	

}
