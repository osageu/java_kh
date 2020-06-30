package com.kh.test.ioTest;

import java.io.*;

public class BookController {
	
	public void fileSave() {
		
		Book bk1 = new Book("자바를 정복하자", 35000);
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.dat"))){
			
			oos.writeObject(bk1);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileRead() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.dat"))){
			
			Book b = (Book)ois.readObject();
			System.out.println(b);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
