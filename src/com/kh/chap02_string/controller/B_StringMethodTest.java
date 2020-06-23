package com.kh.chap02_string.controller;

import java.util.Arrays;

public class B_StringMethodTest {
	
	public void method() {
		
		String str1 = "Hello World";
		
		// 1. String.charAt(int index) : char
		// --> 문자열에서 전달받은 index위치의 문자만을 추출해서 return
		char ch = str1.charAt(4);
		System.out.println("ch : " + ch);
		
		// 2. String.concat(String str)
		// --> String에 전달받은 String을 하나로 합쳐서 return
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);
		
		String str3 = str1 + "!!!";
		System.out.println("str3 : " + str3);
		
		// 3. String.toString()
		System.out.println("str1 : " + str1);
		
		// 4. String.equals(Object obj) : boolean
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		
		// 5. String.hashCode() : int
		System.out.println("str1 hashCode : " + str1.hashCode());
		System.out.println("str2 hashCode : " + str2.hashCode());
		System.out.println("str2 hashCode : " + str3.hashCode());
		
		// 6. String.length() : int
		System.out.println("str1 length : " + str1.length());
		
		// 7. String.subString(int beginIndex, [int endIndex])
		System.out.println(str1.substring(2));
		System.out.println(str1.substring(0, 7));
		
		// 8. String.replace(oldChar, newChar) : String
		String str4 = str1.replace('l', 'c');
		System.out.println("str4 replace : " + str4);
		
		// 9. String.toUpperCase() : String
		// 10. String.toLowerCase() : String
		String str5 = str1.toUpperCase();
		String str6 = str1.toLowerCase();
		System.out.println("str5 toUpperCase : " + str5);
		System.out.println("str6 toLowerCase : " + str6);
		
		// 11. String.trim() : String
		String str7 = "       JAVA       gg      ";
		String str8 = str7.trim();
		System.out.println("str7 trim : " + str8);
		
		// 12. String.toCharArray() : char[]
		char[] cArr = str1.toCharArray();
		System.out.println(Arrays.toString(cArr));
		
		// 13. static valeuOf(char[] data) : String
		System.out.println(String.valueOf(cArr));
		
	}
	
}
