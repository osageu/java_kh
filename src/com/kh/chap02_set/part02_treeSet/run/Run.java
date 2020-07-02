package com.kh.chap02_set.part02_treeSet.run;
import java.util.*;

import com.kh.chap02_set.part02_treeSet.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
//		TreeSet<String> ts = new TreeSet<>();
//		ts.add(new String("하하하"));
//		ts.add(new String("aa"));
//		ts.add(new String("가가가"));
//		ts.add(new String("1하하"));
//		ts.add(new String("다다다"));
//		System.out.println(ts); // 순서유지X, 중복저장X 
//		// 오름차순 정렬
//		
//		TreeSet<Integer> ts2 = new TreeSet<>();
//		ts2.add(new Integer(3));
//		ts2.add(new Integer(10));
//		ts2.add(new Integer(1));
//		ts2.add(2);
//		System.out.println(ts2);
		
		TreeSet<Person> ts3 = new TreeSet<>();
		ts3.add(new Person("공유", 40, 100));
		ts3.add(new Person("홍길동", 26, 40));
		ts3.add(new Person("김말똥", 24, 40));
		ts3.add(new Person("공유", 40, 80));
		// System.out.println(ts3); // 순서유지X, 중복저장X 
		
		// 1. for each
		for (Person p : ts3) {
			System.out.println(p);
		}
		System.out.println("============================================");
		// 2. ArrayList
		ArrayList<Person> copy = new ArrayList<>(ts3);
		for (int i = 0 ; i < copy.size() ; i++) {
			System.out.println(copy.get(i));
		}
		System.out.println("============================================");
		// 3. Iterator
		Iterator<Person> it = ts3.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
