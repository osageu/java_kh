package mvc3.view;
import java.util.*;
import mvc3.controller.BookManager;
import mvc3.model.vo.Book;

public class BookMenu {
	
	// field
	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
	// constructor
	public BookMenu() {
		
	}
	
	// method
	public void mainMenu() {
		while(true) {
			
			System.out.println();
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 삭제");
			System.out.println("3. 도서 검색");
			System.out.println("4. 전체 출력");
			System.out.println("5. 도서 정렬");
			System.out.println("0. 끝내기");
			System.out.print("Select Menu : ");
			int select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1 : insertBook(); break;
			case 2 : deleteBook(); break;
			case 3 : searchBook(); break;
			case 4 : selectList(); break;
			case 5 : sortBook(); break;
			case 0 : System.out.println("♡~~Exit program~~♡"); return;
			default : System.out.println("Select Again"); break;
			}
			
		}
	}
	
	// 1. 책 추가
	public void insertBook() {
		System.out.print("도서 제목 : "); 
		String title = sc.nextLine();
		
		int category = 0;
		while(true) {
		System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : "); 
		category = sc.nextInt(); sc.nextLine();
		if (category >=1 && category <=4) {
			break;
		} else {
			System.out.println("1~4 사이의 정수를 입력하세요.");
			continue;
		}
		}
		System.out.print("도서 저자 : "); 
		String author = sc.nextLine();
		
		Book book = new Book(title, category, author);
		bm.insertBook(book);
	}
	
	// 2. 책 삭제
	public void deleteBook() {
		System.out.print("도서 번호 : "); 
		int bNo = sc.nextInt(); sc.nextLine();
		int result = bm.deleteBook(bNo);
		if (result == 1) {
			System.out.println("성공적으로 삭제되었습니다");
		} else if (result == 0) {
			System.out.println("삭제할 도서가 존재하지 않습니다.");
		}
	}
	
	// 3. 책 검색
	public void searchBook() {
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		ArrayList<Book> book = bm.searchBook(title);
		if (book.isEmpty()) {
			System.out.println("검색 결과가 존재하지 않습니다.");
		} else {
			for (Book a : book) {
				System.out.println(a);
			}
		}
	}
	
	// 4. 책 목록
	public void selectList() {
		ArrayList<Book> bookList = bm.selectList();
		if (bookList.isEmpty()) {
			System.out.println("도서 목록이 존재하지 않습니다.");
		} else {
			for (Book a : bookList) {
				System.out.println(a);
			}
		}
	}
	
	/**
	 * 
	 */
	public void sortBook() {
		System.out.println("1. 도서명 오름차순 정렬");
		System.out.println("2. 저자명 내림차순 정렬");
		System.out.print("Select Menu : ");
		int select = sc.nextInt(); 
		sc.nextLine();
		ArrayList<Book> copy = bm.sortBook(select);
		for (Book b : copy) {
			System.out.println(b);
		}
	}
	
}













