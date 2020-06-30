package mvc3.controller;
import mvc3.model.vo.Book;
import java.util.*;

public class BookManager {
	
	// field
	private ArrayList<Book> bookList = new ArrayList<>();
	private int bNo = 1;
	// constructor
	public BookManager() {
		
	}
	
	// method
	// 1.책 추가
	public void insertBook(Book book) {
		int lastNo = 0;
		try {
			lastNo = bookList.get(bookList.size()-1).getbNo() +1;
		} catch (ArrayIndexOutOfBoundsException e) {
			lastNo = 1;
		}
		bookList.add(book);
		bookList.get(bookList.size()-1).setbNo(lastNo);
	}
	
	// 2. 책 삭제
	public int deleteBook(int bNo) {
		int result = 0;
		for ( int i = 0 ; i < bookList.size() ; i++) {
			if (bookList.get(i).getbNo() == bNo) {
				bookList.remove(i);
				result = 1;
				break;
			} else {
				result = 0;
			}
		}
		return result;
	}
	
	// 3. 책 검색
	public ArrayList<Book> searchBook(String title) {
		ArrayList<Book> searchList = new ArrayList<Book>();
		for ( int i = 0 ; i < bookList.size() ; i++) {
			if (bookList.get(i).getTitle().contains(title)) {
				searchList.add(bookList.get(i));
			}
		}
		return searchList;
	}
	
	// 4. 책 목록
	public ArrayList<Book> selectList() {
		return bookList;
	}
	// end
}
