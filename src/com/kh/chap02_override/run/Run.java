package com.kh.chap02_override.run;

import com.kh.chap01_inherit.model.vo.*;
import com.kh.chap02_override.model.vo.Book;

public class Run {

	// 모든 class는 Object의 후손이다. 즉, 최상위클래스는 항상 Object
	// 그말인 즉슨 Object에 있는 method를 다 갖다 쓸 수 있다.
	// 또 다른 말로는 Object에 있는 method를 재정의 가능(overriding 가능)
	
	
	public static void main(String[] args) {
		
		// 1. toString overriding
		Book bk1 = new Book("수학의 정석", "나수학", 10000);
		Book bk2 = new Book("칭찬은 고래", "네이버", 20000);
		System.out.println(bk1);
		System.out.println(bk2);
		
		// System.out.println(bk1.toString()); /* == */ System.out.println(bk1);
		// 출력문에서 어떤 reference를 출력하고자 할 때 JVM이 자동으로 reference.toString() 호출
		// 이제 info() ==> toString() 으로 대체!!
		// before overriding : Object class의 toString() 실행
		// after overriding : Book class의 toString() 실행 
		
		// 동일객체 : 실제 필드값들도 같고 (equals()) 해쉬코드값도 같은 경우
		// 2.equals() overriding
		Book bk3 = new Book("수학의 정석", "나수학", 10000);
		
		System.out.println("bk1과 bk3가 같은 책입니까? : " + (bk1==bk3)); // 주소값 비교라 false..
		System.out.println("bk1과 bk3가 같은 책입니까? : " + bk1.equals(bk3)); // 
		System.out.println("bk1과 bk3가 같은 책입니까? : " + (bk1.hashCode() == (bk3.hashCode()))); // 
		
		// before overriding : Object class의 equals() 실행
		// after overriding : Book class의 equals() 실행 
		
		// 3. hashCode() overriding
		System.out.println("bk1 hashcode : " + bk1.hashCode());
		System.out.println("bk2 hashcode : " + bk2.hashCode());
		System.out.println("bk3 hashcode : " + bk3.hashCode());
		
		// 4. 총 합
		System.out.println(bk1.match(bk2));
		
		// etc
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		// 다형성 (Polymorphism)
		Book bk4 = new Book();
		Object a = new Airplane();
		Vehicle v = new Car();
		
	}

}
