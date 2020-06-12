package com.kh.chap05_constructor.run;
import com.kh.chap05_constructor.model.vo.*;
public class Run {

	public static void main(String[] args) {
		
		//1. 기본 생성자로 생성
		User osageu = new User();
		System.out.println(osageu.info());
		osageu.setUserId("user01");
		osageu.setUserPwd("pass11");
		osageu.setUserName("오장석");
		System.out.println(osageu.info());
		System.out.println("====================================================");
		
		// 2. 매개변수 생성자로 객체 생성
		User u2 = new User("pass22", "이상훈",26); // age랑 gender field도 기본값으로 만들어지긴 함
		System.out.println(u2.info());
		// 생성과 동시에 userId, userPwd, userName에 초기화됨
		System.out.println("====================================================");
		
		User u3 = new User("user03", "pass33", "김희태", 26, 'M');
		System.out.println(u3.info());
		u3.setUserAge(30);
		System.out.println(u3.info());

	}

}
