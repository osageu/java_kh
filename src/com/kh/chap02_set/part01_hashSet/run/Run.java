package com.kh.chap02_set.part01_hashSet.run;
import com.kh.chap02_set.part01_hashSet.model.vo.Person;
import java.util.*;

public class Run {

	public static void main(String[] args) {
		
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("공차", 21 ,60));
		hs.add(new Person("공명", 28 ,40));
		hs.add(new Person("공유", 40 ,100));
		hs.add(new Person("공명", 28 ,40));
		// --> 주소값 차이 때문에 중복처리 X
		// --> hashCode(), equals() overriding해야 함
		// System.out.println(hs);
		// --> Set : 무작위 객체 저장, index nono
		// 1. for - each
		for (Person a : hs) { 
			System.out.println(a.getName()); 
			}
		// 2. HashSet --> ArrayList
		ArrayList<Person> al = new ArrayList<>(hs);
		for (int i = 0 ; i < al.size() ; i++) {
			System.out.println(al.get(i));
		}
		System.out.println("==================================");
		// 3. Iterator(반복자)를 이용해서 출력
		// hs --> it --> 하나씩 뽑기
		// iterator() : Set, List에서만 사용 가능
		Iterator<Person> it = hs.iterator();
		try {
			while(it.hasNext()) { // hasNext : 아직 iterator에 남아있나요??
				System.out.println(it.next().getName());
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

}
