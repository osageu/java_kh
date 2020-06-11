package com.kh.chap01_abstraction.run;
import com.kh.chap01_abstraction.model.vo.*;
import com.kh.chap04_field.model.vo.FieldTest3;
public class Run {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		// student class 가지고 객체 찍어내기
		
		Student hong = new Student();
		hong.name = "홍길동";
		hong.age = 20;
		hong.height = 162.3;
		System.out.printf("%s님은 %d살이고, 키는 %.1fcm입니다.", hong.name, hong.age, hong.height);
		
		Student mal = new Student();
		hong.name = "김말똥";
		hong.age = 21;
		hong.height = 175.4;
		
		System.out.println(FieldTest3.sta);
		
	}

}
