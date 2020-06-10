package com.kh.chap02_encapsulation.run;
import com.kh.chap02_encapsulation.model.vo.*;

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
		hong.setName("홍길동");
		hong.setAge(20);
		hong.setHeight(162.3);
		
		mal.setName("김말똥");
		mal.setAge(21);
		mal.setHeight(175.4);
		
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getHeight());
	}

}
