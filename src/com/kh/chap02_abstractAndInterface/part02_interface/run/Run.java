package com.kh.chap02_abstractAndInterface.part02_interface.run;

import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		Person p1 = new Mother("준식맘", 50, 70, "출산");
		Person p2 = new Baby("엄준식", 3.5, 80);
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("================= after eating =================");
		// 엄마와 아기가 밥을 먹는다
		((Basic)p1).eat();
		((Basic)p2).eat();
		System.out.println(p1);
		System.out.println(p2);

		System.out.println("================= after sleeping =================");
		// 엄마와 아기가 잠을 잔다
		((Basic)p1).sleep();
		((Basic)p2).sleep();
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("================= after interface =================");
		Basic b1 = new Mother("준식맘", 50, 70, "출산");
		Basic b2 = new Baby("엄준식", 3.5, 80);
		b1.sleep();
		b2.sleep();
		b1.eat();
		b2.eat();
		System.out.println(b1);
		System.out.println(b2);
		
		//  일반클래스 상속 --> 추상클래스 상속 --> 인터페이스
		//  ------------------------------------------------------->
		//                     갈수록 강제성이 더 짙어짐
		//  class To class	 					: class extends class								(단일상속)
		//  class To interface				 	: class implements interface, inferface, .... (다중상속)
		//  interface To interface			: interface exteds interface, interface, ....	(다중상속)
		
		
		
	}

}
