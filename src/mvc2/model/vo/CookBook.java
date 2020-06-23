package mvc2.model.vo;

public class CookBook extends Book {
	
	// field
	private boolean coupon;
	
	// constructor
	public CookBook() {
		
	}
	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}
	
	// method
	public boolean isCoupon() {
		return coupon;
	}
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	@Override
	public String toString() {
		return super.toString() + coupon;
	}
	
}
