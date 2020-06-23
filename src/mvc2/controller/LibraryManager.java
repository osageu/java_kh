package mvc2.controller;
import java.util.Arrays;

import mvc2.model.vo.AniBook;
import mvc2.model.vo.Book;
import mvc2.model.vo.CookBook;
import mvc2.model.vo.Member;

public class LibraryManager {
	
	// field
	private Member mem = null;
	Book[] bList = new Book[5];
	{
	bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
	bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
	bList[2] = new AniBook("원피스", "오다 에이치로", "Japan", 12);
	bList[3] = new CookBook("얼마나 맛있게요", "이혜정", "문학", false);
	bList[4] = new CookBook("날 따라해봐", "최현석", "소금책", true);
	}
	//constructor
	public LibraryManager() {
		
	}
	
	// method
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	public Member myInfo() {
		return mem;
	}
	
	public Book[] selectAll() {
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		Book[] book = new Book[5];
		int count = 0;
		for (int i = 0 ; i < bList.length ; i++) {
			if (bList[i].getTitle().contains(keyword) == true) {
				book[count++] = bList[i];
			}
		}
		Book[] copy = Arrays.copyOf(book, count);
		return copy;
	}
	
	public int rentBook(int index) {
		int result = 0;
		
		if (bList[index] instanceof AniBook) {
			if (((AniBook) bList[index]).getAccessAge() > mem.getAge())
			result = 1;
		}
		
		if (bList[index] instanceof CookBook) {
			if (((CookBook)bList[index]).isCoupon() == true) {
				mem.setCouponCount(mem.getCouponCount() + 1);
			}
			result = 2;
		}
		
		return result;
	}
	
}
