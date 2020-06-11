package com.kh.chap04_field.run;
import com.kh.chap04_field.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		// FieldTest2
		FieldTest2 f2 = new FieldTest2();
		
		// public : 어디서든 직접 접근 가능
		System.out.println(f2.pub);
		
		// protected : 같은 package 가능, 다른 package일 경우 상속구조에서만 가능
		// System.out.println(f2.pro);
		
		// default : 같은 package 가능
		// System.out.println(f2.def);
		
		// private : 같은 class 가능
		// System.out.println(f2.pri);
		
		
		// FieldTest3
		// static 예약어가 붙은 순간 해당 클래스로 굳이 객체생성 안해도
		// 프로그램 구동과 동시에 static 메모리 영역에 저장
		System.out.println(FieldTest2.sta);
		System.out.println(FieldTest3.sta);
		FieldTest3.sta = "static3 --> change";
		System.out.println(FieldTest3.sta);
		
		// FieldTest4
//		FieldTest4.NUM = 10;
		System.out.println(FieldTest4.NUM);
		System.out.println(Math.PI);
		System.out.println(Math.E);
	}

}
