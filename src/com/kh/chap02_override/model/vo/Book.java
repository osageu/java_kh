package com.kh.chap02_override.model.vo;

public class Book {
	
	// field
	private String title;
	private String author;
	private int price;
	
	// constructor
	public Book() {
		
	}
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	// method
	// setter, getter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	// information
	/*
	public String info() {
		return "제목 : " + title + ", 저자 : " + author + ", 가격 : " + price;
	}
	*/
	
	// toString overriding : 실제 담겨있는 필드값들을 하나의 문자열로 합쳐서 반환해주는 method
	@Override
	public String toString() {
		return "title : " + title + ", author : " + author + ", price : " + price;
	}
	
	// equals overriding : 주소값 비교가 아닌 실제 담겨있는 필드값들이 모두 일치할 경우 'true'를 반환해주는 method
	@Override
	public boolean equals(Object obj) {
		// 		this (현 객체) vs obj (전달받은 비교할 대상 객체)
		// 		Book               Object
		// 		편의를 위해서 자료형 일치 시켜줄 것임
		
		Book copy = (Book)obj; // 상속 구조간에는 class casting 가능 ( Object --> Book )
		
 		// 		this (현 객체) vs copy (전달받은 비교할 대상 객체)
		// 		Book               Book
		// 		this.title == copy.title && this.author == copy.author && this.price == copy.price
		boolean result = false;
		if (this.toString().equals(copy.toString())) {
			result = true;
		}
		return result;
	}
	
	// hashCode overriding : 주소값이 아닌 필드값들을 가지고 동일한 hashCode가 반환될 수 있게 재정의
	@Override
	public int hashCode() {
		// 해당 객체의 필드값들을 문자열로 합쳐서 해당 문자열의 hashcode값을 return
		return toString().hashCode();
	}
	
	public String match(Book bk) {
	
		String result2 = null;
		if (this.equals(bk) && (this.hashCode() == bk.hashCode())) {
			result2 = "perfectly mathced!";
		}  else {
			result2 = "mismateched";
		}
		return result2;
	}
	
}
