package com.kh.chap04_field.model.vo;
/**
 * @author user1
 *
 */

// fields access modifier test
public class FieldTest2 {
	
	/*
	 * field access modifier 4 kinds
	 * 1) public : 어디서든 (모든 package) 접근 가능
	 * 2) protected : 같은 package 접근 가능 + 만약 다른 packaged라면 상속구조에서는 접근 가능
	 * 3) default : 같은 package 접근 가능
	 * 4) private : 오직 같은 class에서만 접근 가능
	 * 
	 * 위에서 아래로 내려올 수록 접근 범위 좁아짐
	 */
	public String pub = "public";
	protected String pro = "protected";
	/*default*/ String def = "default";
	private String pri = "private";
	
	public static String sta = "static2";
	
	
}
