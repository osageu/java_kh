package com.kh.test.duck.controller;
import com.kh.test.duck.model.vo.Duck;

public class DuckManager {

	public static void main(String[] args) {
		
		Duck[] duck = new Duck[5];
		duck[0] = new Duck("도날드", "러버덕");
		duck[1] = new Duck("꽥꽥이", "청둥오리");
		duck[2] = new Duck("고무고무", "러버덕");
		duck[3] = new Duck("청둥이", "청둥오리");
		duck[4] = new Duck("미세먼지", "청둥오리");
		
		for ( int i = 0 ; i < duck.length ; i++) {
			System.out.println(duck[i].toString());
		}
	}

}
