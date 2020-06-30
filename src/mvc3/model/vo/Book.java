package mvc3.model.vo;

public class Book {
	
	// field
	private int bNo;
	private String title;
	private int category;
	private String author;
	
	// constructor
	public Book() {
		
	}
	public Book(String title, int category, String author) {
		this.title = title;
		this.category = category;
		this.author = author;
	}
	
	// method
	public int getbNo() {
		return bNo;
	}
	public void setbNo(int bNo) {
		this.bNo = bNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bNo=" + bNo + ", title=" + title + ", category=" + category + ", author=" + author + "]";
	}
	
}
