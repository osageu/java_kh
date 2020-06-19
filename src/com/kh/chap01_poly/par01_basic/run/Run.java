package com.kh.chap01_poly.par01_basic.run;
import com.kh.chap01_poly.par01_basic.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		// 1. superclass reference To superclass reference
		System.out.println("1. superclass reference To superclass reference");
		Parent p1 = new Parent();
		p1.printParent();
		
		// 2. subclass reference To subclass reference
		System.out.println("2. subclass reference To subclass reference");
		Child1 c1 = new Child1();
		((Parent)c1).printParent(); // == c1.printParent();
		c1.printChild1();
		
		// 3. superclass reference To subclass reference
		System.out.println("3. superclass reference To subclass reference");
		Parent p2 = new Child1(); // 자동 casting 된 것!!
		p2.printParent();
		((Child1)p2).printChild1();
		/*
		 *  Class casting ( 단, 상속 구조일때만!!)
		 *  
		 *  1. UpCasting
		 *  subclass --> superclass casting
		 *  
		 *  2. DownCasting
		 *  superclass --> subclass casting
		 *  ((sub)super).submethod);
		 *  
		 */
		Parent p3 = new Child2();
		((Child2)p3).printChild2();
		System.out.println("==============================================");
		Parent[] test = new Parent[3];
		test[0] = new Child1(1,2,3);
		test[1] = new Child2(3,2,1);
		test[2] = new Parent(2,1);
		// 각각의 자식객체들에 접근할 때, 하나의 부모타입으로 접근 --> 편리, 코드감소, 유연한 코딩
		((Child1)test[0]).printChild1();
		((Child2)test[1]).printChild2();
		((Parent)test[2]).printParent();
		
		Object[] obj = new Object[3];
		obj[0] = new Parent();
		obj[1] = new Child1();
		obj[2] = new Child2();
		
		System.out.println("==== 반복문을 이용해서 출력 ====");
		for (int i = 0 ; i < test.length; i++) {
			if (test[i] instanceof Child1) {
				System.out.print("Child1 : ");
				((Child1)test[i]).printChild1();
			} else if (test[i] instanceof Child2) {
				System.out.print("Child2 : ");
				((Child2)test[i]).printChild2();
			} else {
				System.out.print("Parent : ");
				test[i].printParent();
			}
		}
		
	}

}
