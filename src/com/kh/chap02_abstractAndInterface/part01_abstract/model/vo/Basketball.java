package com.kh.chap02_abstractAndInterface.part01_abstract.model.vo;

public class Basketball extends Sports{
	
	@Override
	public void rule() {
		System.out.println("발이 아닌 손으로 공을 던져 림에 넣어야 된다.");
	}

}
