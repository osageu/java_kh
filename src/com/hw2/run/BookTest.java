package com.hw2.run;
import com.hw2.model.vo.*;

public class BookTest {

	public static void main(String[] args) {
		
		// 1)
		Book osageu1 = new Book();
		Book osageu2 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		System.out.println(osageu1.info());
		System.out.println(osageu2.info());
		System.out.println("==================================");
		
		// 2)
		osageu1.setTitle("C언어");
		osageu1.setPrice(30000);
		osageu1.setDiscountRate(0.1);
		osageu1.setAuthor("홍길동");
		System.out.println("수정된 결과 확인\n" + osageu1.info());
		System.out.println("==================================");
		
		// 3)
		int discount1 = (int)(osageu1.getPrice() - osageu1.getPrice() * osageu1.getDiscountRate());
		int discount2 = (int)(osageu2.getPrice() - osageu2.getPrice() * osageu2.getDiscountRate());
		
		System.out.printf("도서명 = %s\n할인된 가격 = %d원\n도서명 = %s\n할인된 가격 = %d원",
				osageu1.getTitle(), discount1, osageu2.getTitle(), discount2);
		
	}

}
