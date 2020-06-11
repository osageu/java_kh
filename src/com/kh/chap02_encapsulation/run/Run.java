package com.kh.chap02_encapsulation.run;
import com.kh.chap02_encapsulation.model.vo.*;
import com.kh.chap04_field.model.vo.FieldTest3;

/**
 * @author user1
 *
 */
public class Run {

	public static void main(String[] args) {
		
		Student hong = new Student();
		Student mal = new Student();
		
		/*
		hong.name = "홍길동";
		hong.age = 20;
		hong.height = 163.2;
		*/
		
		// name, age, height 필드 private로 되어있어 직접 접근불가!
		hong.setName("홍길동", "길동홍");
		hong.setAge(20);
		hong.setHeight(162.3);
		
		mal.setName("김말똥", "말똥김");
		mal.setAge(21);
		mal.setHeight(175.4);
		
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getHeight());
		hong.information(); // 이것만 치면 문자열이 여기로 오기만하고 출력은 안 됨.
		System.out.println(hong.information());
		System.out.println(mal.information());
		System.out.println(hong);
		System.out.println(mal);
		
		System.out.println(FieldTest3.sta);
	}

}
