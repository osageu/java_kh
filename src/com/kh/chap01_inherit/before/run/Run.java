package com.kh.chap01_inherit.before.run;

import com.kh.chap01_inherit.before.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		// Desktop객체 생성
		Desktop d = new Desktop("삼성", "d-01", "짱짱데스크탑", 1000000, true);

		// SmartPhone객체 생성
		SmartPhone p = new SmartPhone("애플", "s-01", "아이폰12", 860000, "SKT");
		
		// Tv객체 생성
		Tv t = new Tv("LG", "t-01", "겁나얇은티비", 2400000, 32);
		
		System.out.println(d.info());
		System.out.println(p.info());
		System.out.println(t.info());
		
		// 이 세 개의 class에는 공통적인 field, method가 존재함
		// 이런 중복된 코드들 superclass로 한 번만 정의해두고 가져다 쓰겠다
		// --> 나중에 유지 보수를 하게될 때 일일이 찾아가서 수정할 필요X
		// --> superclass만 수정해주면 모든 곳에 반영됨
		
		// three class가 가진 공통적인 field
		// --> brand, pCode, pName, price
		// three class가 가진 공통적인 method
		// --> setter, getter method 4가지, information method
		
	}

}
