package com.kh.chap01_inherit.run;
import com.kh.chap01_inherit.model.vo.*;
public class Run {

	public static void main(String[] args) {
		
		Car car1 = new Car("벤틀리", 12.5, "세단", 4);
		Airplane air1 = new Airplane("보잉707", 0.2, "여객기", 16, 4);
		Ship ship1 = new Ship("타이타닉", 3.5, "유람선", 1);
		
		System.out.println(car1.info());
		System.out.println(air1.info());
		System.out.println(ship1.info());
		
		car1.howToMove();
		air1.howToMove();
		ship1.howToMove();
	}

}
