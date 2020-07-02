package com.kh.chap03_map.part01_hashMap.run;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.mode.vo.Snack;

public class Run {

	public static void main(String[] args) {
		
		HashMap<String, Snack> hm = new HashMap<>(); 
		// 1. put()
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸초", new Snack("단맛", 600));
		hm.put("포테이토칩", new Snack("짠맛", 500));
		hm.put("새우깡", new Snack("짠맛", 500));
		hm.put("새우깡", new Snack("단맛", 599));
		System.out.println(hm);
		
		// 2. get()
		Snack s = hm.get("다이제");
		System.out.println(s);
		
		// 3. size()
		System.out.println("size : " + hm.size());
		
		// 4. replace()
		hm.replace("포테이토칩", new Snack("매우 짠 맛", 1000));
		System.out.println(hm.get("포테이토칩"));
		
		// 5. remove()
		hm.remove("포테이토칩");
		System.out.println(hm.get("포테이토칩"));
		
		System.out.println("======================================================");
		// 1) keySet() 이용하는 방법
		// 		1. hm에 있는 key들만 Set에 담기 (key들의 집합형태) : keySet()
		// 		2. keySet을 Iterator에 담기 : iterator()
		// 		3. 반복문을 통해 key 뽑고 value값 알아내기
		// 1.
		Set<String> keySet = hm.keySet(); 
		// 2.
		Iterator<String> it = keySet.iterator();
		// 3.
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : " + key);
			System.out.println("value : " + hm.get(key));
		}
		System.out.println("==================================================");
		// 2) entrySet() 이용하는 방법
		//		1. hm에 있는 key+value로 entrySet이라는 공간에 담기 (key + value들의 집합형태)
		// 		2. entrySet을 Iterator에 담기 : iterator()
		// 		3. 반복문을 통해 key, value값 알아내기
		// 1.
		Set<Entry<String, Snack>> entrySet = hm.entrySet();
		// 2.
		Iterator<Entry<String, Snack>> it2 = entrySet.iterator();
		// 3.
		while(it2.hasNext()) {
			Entry<String, Snack> entry = it2.next();
			String key = entry.getKey();
			Snack value = entry.getValue();
			System.out.println("key : " + key);
			System.out.println("value : " + value);
		}
		
	}

}
