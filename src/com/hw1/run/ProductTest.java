package com.hw1.run;
import java.util.Arrays;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		
		// 1)
		Product[] phone = new Product[3];
		phone[0] = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		phone[1] = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		phone[2] = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		for (int i = 0 ; i < phone.length ; i++) {
			System.out.println(phone[i].info());
		}
		System.out.println("==============================================");
		
		// 2)
		for (int i = 0 ; i < phone.length ; i++) {
			phone[i].setPrice(1200000);
			phone[i].setTax(0.05);
		}
		for (int i = 0 ; i < phone.length ; i++) {
			System.out.println(phone[i].info());
		}
		System.out.println("==============================================");
		
		// 3)
		for (int i = 0 ; i < phone.length ; i++) {
			System.out.println("상품명 = " + phone[i].getProductName());
			System.out.println("부가세 포함 가격 = " + (int)(phone[i].getPrice() + (phone[i].getPrice() * phone[i].getTax())) + "원");
		}
		
	}
}
