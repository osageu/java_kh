package com.kh.chap01_list.part01_basic.run;
import java.util.*;
import com.kh.chap01_list.part01_basic.model.vo.*;
public class Run {
	
	public static void main(String[] args) {
		
		/*
		 *  Collection
		 *  : in Java, "자료구조"개념이 이미 내재되어 있는 "Framework"
		 *  : 자료구조 --> 방대한 데이터를 효율적(구조적)으로 다룰 때 필요한 개념
		 *  : Framework --> 데이터나 기능들을 다루기 쉽게 이미 정의되어있는 툴
		 *  : 즉, 방대한 데이터를 추가, 삭제, 수정, 정렬을 쉽게 가능
		 *  : 크기 제약X, 중간 추가 - 삭제용이, 객체 저장 가능
		 *  
		 *  Array
		 *  : 크기 지정 필요 --> 크기 변경 불가
		 *  : 배열 중간에 데이터 추가, 삭제 시 배열 index 조절해야 함
		 *  : 한 타입의 자료형만 저장 가능
		 *  
		 */
		
		// ArrayList
		
		ArrayList<Music> list = new ArrayList<>(3); // 내부적으로 3size 배열
		System.out.println("내용 없음 : " + list); // empty
		// E --> Element : list에 담길 요소들(Object로 간주)
		
		// 1. add(E e) : boolean --> list끝에 object추가
		list.add(new Music("Good Bye", "박효신"));
		list.add(new Music("이 밤", "양다일"));
		list.add(new Music("잊혀지다", "정키"));
		System.out.println("add1 : " + list); // 크기 제약X, 무작위로 담으면 보안 문제..
		
		// 2. add(int index, E e) : void --> list 사이에 object추가
		list.add(1, new Music("진심이 담긴 노래", "케이시")); // 중간에 내용 추가
		System.out.println("add2 : " + list);
		
		// 3. set(int index, E e) : E e (수정 전 Object) --> 해당 index의 데이터를 e로 변경
		list.set(0, new Music("술이달다", "에픽하이"));
		System.out.println("set : " + list);
		
		// 4. size() : int --> 데이터의 개수
		System.out.println("size : " + list.size());
		
		// 5. remove(int index) : E e (제거된 객체) --> 해당 index의 데이터를 제거 
		System.out.println("삭제된 데이터 : " + list.remove(1));
		System.out.println("remove : " + list);		
		
		// 6. get(int index) : E e --> 해당 index의 데이터를 반환
		System.out.println(list.get(0));
		Music m = (Music)list.get(0); // 강제형변환 필요
		System.out.println(m);
		System.out.println(((Music)list.get(0)).getTitle());
		
		// 7. subList(int fromIndex, int toIndex) : List list --> from~to index 추출
		List<Music> sub = list.subList(1, 3);
		System.out.println(sub);
		
		// 8. addAll(Collection c) : boolean --> collection을 통째로 추가
		list.addAll(sub);
		System.out.println(list);
		
		// 9. isEmpty : boolean --> collection이 비어있는지 확인
		System.out.println(list.isEmpty());
		
		// 10. clear() : void --> collection 전체 삭제
//		list.clear();
		System.out.println(list.isEmpty());
		
		// for loop
		for (int i = 0 ; i < list.size() ; i++) {
			
			System.out.println(list.get(i).getTitle());
			
		}
		
		System.out.println("==================================");
		
		// for each
		for (Music a : list) { // Music a = list.get(i);
			System.out.println(a.getTitle());
		}
		
		
	}
	
}
