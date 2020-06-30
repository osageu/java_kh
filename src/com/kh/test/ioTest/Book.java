package com.kh.test.ioTest;

import java.io.*;

public class Book implements Serializable{
	
	// field
	private String title;
	private int price;
	
	// constructor
	public Book() {
		
	}
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	// method
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
}
