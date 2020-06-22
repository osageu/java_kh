package com.kh.chap02_abstractAndInterface.part01_abstract.run;
import com.kh.chap02_abstractAndInterface.part01_abstract.model.vo.*;
public class Run {

	public static void main(String[] args) {
		
//		Sports s = new Sports(); --> abstract class라 객체 생성 불가
		Sports s; // --> reference로는 사용 가능 
		s = new Football();
		s = new Basketball();
		Sports[] arr = new Sports[2];
		arr[0] = new Football();
		arr[1] = new Basketball();
		
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i].rule();
		}
		// abstract class의 abstract method
	}

}
