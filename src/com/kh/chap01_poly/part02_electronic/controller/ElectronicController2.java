package com.kh.chap01_poly.part02_electronic.controller;
import com.kh.chap01_poly.part02_electronic.model.vo.*;

public class ElectronicController2 {
	
	// superclass로 다양한 subclass 수용 가능 --> 하나로 관리
	private Electronic[] all = new Electronic[3];
	private int count = 0;
	
	// 각 객체를 받아서 초기화해주는 method
	public void insert(Electronic any) {
		all[count++] = any;
	}
	// 객체 호출 method
	public Electronic select(int a) {
		return all[a];
	}
	public Electronic[] select() {
		return all;
	}
	
	
}
