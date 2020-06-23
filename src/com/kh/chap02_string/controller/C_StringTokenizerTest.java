package com.kh.chap02_string.controller;
import java.util.*;

public class C_StringTokenizerTest {
	
	public void method() {
		
		String str = "JAVA~Orcale~JDBC~HTML~CSS~Spring";
		
		// 구분자를 이용하여 문자열을 분리
		
		// 방법1. 분리된 문자열을 배열로 담아서 관리하고 싶을 때 (String --> String[ ])
		// String class의 split method --> String.split(String regex 구분자) : String[ ]
		String[] sArr = str.split("~");
		System.out.println(Arrays.toString(sArr));
		System.out.println("분리 후 문자열의 개수 : " + sArr.length);
		
		for (int i = 0 ; i < sArr.length ; i++) {
			System.out.println(sArr[i]);
		}
		
		// 방법2. 분리된 문자열을 token 객체로 취급하고 싶을 때
		// java.util.StringTokenizer class 이용
		// StringTokenizer stn = new StringTokenizer("분리시키고자 하는 문자열", "구분자");
		System.out.println("============ Token ============");
		StringTokenizer stn = new StringTokenizer(str, "~");
//		System.out.println("Token의 수 : " + stn.countTokens());
//		System.out.println("첫 번째 Toekn : " + stn.nextToken()); // Token 공간에서 진짜로 빼오는 것!
//		System.out.println("두 번째 Toekn : " + stn.nextToken());
//		System.out.println("세 번째 Toekn : " + stn.nextToken());
//		System.out.println("네 번째 Toekn : " + stn.nextToken());
//		System.out.println("다섯 번째 Toekn : " + stn.nextToken());
//		System.out.println("여섯 번째 Toekn : " + stn.nextToken());
//		System.out.println("Token의 수 : " + stn.countTokens());
		
//		for (int i = 0 ; i < stn.countTokens() ; i++) { // 반복돌 때마다 countTokens도 줄어듦
//			System.out.println(stn.nextToken());
//		}
		
//		int count = stn.countTokens();
//		for (int i = 0 ; i < count ; i++) { 
//			System.out.println(stn.nextToken());
//		}
		
		// stn.hasMoreTokens() : boolean
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
	}
	
}
