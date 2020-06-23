package mvc2.model.vo;

public class AniBook extends Book {
	
	// field
	private int accessAge;
	
	// constructor
	public AniBook() {
		
	}
	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}
	
	// method
	public int getAccessAge() {
		return accessAge;
	}
	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
	@Override
	public String toString() {
		return super.toString() + accessAge;
	}
	
}
