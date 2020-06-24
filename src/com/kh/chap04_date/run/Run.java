package com.kh.chap04_date.run;
import java.text.*;
import java.util.*;
public class Run {

	public static void main(String[] args) {
		
		/* 
		 *  Date(java.util)
		 *  : 완성도는 낮음
		 *  
		 */
		// 1. default constructor 
		Date today = new Date();
		System.out.println("기본 생성자 (현재날짜) : " + today);
		
		// 2. parameterized constructor
		// 2020.05.21
		System.out.println("============ 2020.05.21 세팅하기 ============");
		Date date1 = new Date(2020, 5, 21); // <-- deprecated
		System.out.println("1. Parameterized constructor : " + date1); // y+1900, month+1
		Date date2 = new Date(2020-1900, 5-1, 21);
		System.out.println("1. Parameterized constructor : " + date2);
		Date date3 = new Date(2020-1900, 5-1, 21, 6, 10, 30);
		System.out.println("1. Parameterized constructor : " + date3);
		
		// 3. 기본생성자로 생성 후 setter method로 변경
		Date date4 = new Date();
		date4.setYear(2020);
		date4.setMonth(5);
		date4.setDate(21);
		System.out.println("2. Default constructor + setter method : " + date4);
		System.out.println(date4.getYear() + "년");
		System.out.println(date4.getMonth() + "월");
		System.out.println(date4.getDate() + "일");
		System.out.println(date4.getDay() + "");
		System.out.println(date4.getHours() + "시");
		
		// 4. 2020년 05월 21일 11시 11분 21초
		// 특정 format 지정한 채로 출력 --> SimpleDateFormat class
		// SimpleDateFormat Parameterized constructor
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		// today --> String
		String todayStr = sdf.format(today); // today는 위에서 Date class로 정의
		System.out.println(todayStr);
	}

}
