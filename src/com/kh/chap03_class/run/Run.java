package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.*;

/**
 * @author user1
 *
 */
public class Run {

	public static void main(String[] args) {
		
//		Person jang = new Person(); // field에 있는 건 무조건 다 heap으로 주소값을 가진채로 올라감.
//		jang.setAll("user1", "user11", "오장석", 26, 'M', "010-5051-5355", "dhwkdtjr123@naver.com");
//		jang.setPw("user11");
//		jang.setName("오장석");
//		jang.setAge(26);
//		jang.setGender('M');
//		jang.setPhone("010-5051-5355");
//		jang.setEmail("dhwkdtjr123@naver.com");
//		System.out.println(jang.information());
		
		Product pro1 = new Product();
		pro1.setpName("iphone");
		pro1.setPrice(550000);
		pro1.setPrice(pro1.getPrice()-100000);
		pro1.setBrand("apple");
		System.out.println(pro1.info());
		System.out.println(pro1);
		
		System.out.println();
		
		Product pro2 = new Product();
		pro2.setpName("galaxy");
		pro2.setPrice(1000000);
		pro2.setPrice(pro2.getPrice()-100000);
		pro2.setBrand("samsung");
		System.out.println(pro2.info());
		System.out.println(pro2);
		
		// 1년이 흘러서 가격이 기존보다 100,000원 감소..
		
		
	
		
		
	}

}
