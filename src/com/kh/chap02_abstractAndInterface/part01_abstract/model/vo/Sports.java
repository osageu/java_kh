package com.kh.chap02_abstractAndInterface.part01_abstract.model.vo;

public abstract class Sports {
	
	// field
	private int personCount;
	
	// constructor
	public Sports() {
		
	}
	public Sports(int personCount) {
		this.personCount = personCount;
	}
	
	// method
	public int getPersonCount() {
		return personCount;
	}
	public void setPersonCount(int personCount) {
		this.personCount = personCount;
	}
	@Override
	public String toString() {
		return "사람수 : " + personCount;
	}
	
	// 추상 method : 내용구현이 되어있지 않은 method
	// --> {  }몸통부가 아직 구현되어있지 않은 상태
	// --> abstract method가 있으면 해당 class 또한 미완성 ~ 추상 class로 만들어야 함
	public abstract void rule();
	
	
}
