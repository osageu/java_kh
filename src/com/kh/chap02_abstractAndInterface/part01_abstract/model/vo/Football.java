package com.kh.chap02_abstractAndInterface.part01_abstract.model.vo;

public class Football extends Sports{ // Sports가 abstract class라서.. ERROR
	
	@Override
	public void rule() { // superclass에서 abstract method를 overriding해서 완성시켜야 함
		System.out.println("손이 아닌 발로 공을 차야 한다.");
	}
	
}
