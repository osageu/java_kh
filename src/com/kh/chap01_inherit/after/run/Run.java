package com.kh.chap01_inherit.after.run;

import com.kh.chap01_inherit.after.mdoel.vo.*;

public class Run {

	public static void main(String[] args) {
		
		// Desktop object 생성
//		Desktop d1 = new Desktop();
//		d1.setBrand("삼성"); 							// superclass로부터 받아옴
//		d1.setpCode("d-01");							// superclass로부터 받아옴
//		d1.setpName("짱짱데스크탑");				// superclass로부터 받아옴
//		d1.setPrice(1000000);							// superclass로부터 받아옴
//		d1.setAllInOne(true);							// Desktop class로부터 받아옴
//		System.out.println(d1);

//		Product d3 = new Product("삼성", "d-01", "짱짱데스크탑", 1000000);
//		System.out.println(d3);

		Desktop d1 = new Desktop("삼성", "d-01", "짱짱데스크탑", 1000000, true);
		SmartPhone s1 = new SmartPhone("사과", "s-01", "아이폰", 850000, "Skt");
		Tv t1 = new Tv("LG", "t-01","겁나얇은티비",3500000, 32);
		
		System.out.println(s1.info());
		System.out.println(t1.info());
		System.out.println(d1.info());
		System.out.println(d1);  // JVM이 해상 reference variable.toString( ) 호출한 결과를 사실상 출력했던 것!
		System.out.println(d1.toString());  // Object class method가 실행
		System.out.println(d1.hashCode()-1);
		
	}
	
}
