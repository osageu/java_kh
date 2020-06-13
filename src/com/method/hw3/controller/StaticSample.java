package com.method.hw3.controller;

public class StaticSample {
	
	// field
	private static String value;
	
	// constructor
	
	// method
	public static void setValue(String value) {
		StaticSample.value = value;
	}
	
	public static String getValue() {
		return StaticSample.value;
	}
	
	public static void toUpper() {
		
		char[] upper = new char[StaticSample.value.length()];
		for (int i = 0 ; i < upper.length ; i++) {
			upper[i] = StaticSample.value.charAt(i);
		}
		
		int temp = 0;
		for (int i = 0 ; i < upper.length ; i++) {
			temp = upper[i];
			if (temp <= 90) {
				temp = 0;
				continue;
			} else {
				upper[i] = (char)(temp-32);
			}

		}
		
		String aa = "";
		for (int i = 0 ; i < upper.length ; i++) {
			aa += upper[i];
		}
		StaticSample.value = aa;
		
	}
	
	public static void setChar(int index, char c) {
		
		char[] cArr = new char[StaticSample.value.length()];
		for ( int i = 0 ; i < StaticSample.value.length() ; i++) {
			cArr[i] = StaticSample.value.charAt(i);
			if ( i == index) {
				cArr[i] = c;
			}
		}
		
		String str = "";
		for (int i = 0 ; i < cArr.length ; i++) {
			str += cArr[i];
		}
		StaticSample.value = str;
		
	}
	
	public static int valueLength() {
		return StaticSample.value.length();
	}
	
	public static String valueConcat(String str) {
		return StaticSample.value + str;
	}
	
}
