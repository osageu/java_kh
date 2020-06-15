package com.kh.chap01_objectVSobectArray.model.vo;

public class Book {
	
	// Field (== member variable == property)
	// (access modifier) [reserved word] (data type) (variable name); --> ( ) 필수, [ ] 생략가능
	// = [value]; 하면 생성과 동시에 초기화
	private String title; 		// 도서명
	private String author; 		// 저자명
	private int price; 			// 가격
	private String publisher; 	// 출판사
//	private String publisher = "kh정보교육원"; 	// 출판사
	
	// Constructor --> 생성 or (생성 + 초기화 ; parameterized constructor)
	// (access modifier) (class name) ( ) {   } : default constructor
	// --> 생성만이 목적
	// (access modifier) (class name) ([parameter, parameter, .... ]) {   } : parameterized constructor
	// --> 생성뿐만 아니라 전달값들을 필드에 초기화까지
	
	// default : 생성 (즉, 해당 필드를 공간 확보만이 목적)
	public Book() {
		
	}
	
	// parameterrized : 생성 및 초기화
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	// Method (== function)
	// (access modifier) [reserved word] (return type) (method name) ([parameter, parameter, .... ]) {   }
	// setter method : 전달값 받은 후 해당 필드에 초기화
	public void setTitle (String title) {
		this.title = title;
	}
	public void setAuthor (String author) {
		this.author = author;
	}
	public void setPrice (int price) {
		this.price = price;
	}
	public void setPublisher (String publisher) {
		this.publisher = publisher;
	}
	
	// getter method : 해당 필드에 담긴값 반환
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public String getPublisher() {
		return publisher;
	}
	
	// information method : 모든 필드에 담긴값 하나의 문자열로 합쳐서 반환
	public String info() {
		return "제목 : " + title + "\t" + "저자 : " + author + "\t" + "가격 : " + price + "\t" + "출판사 : " + publisher; 
	}
	
}
