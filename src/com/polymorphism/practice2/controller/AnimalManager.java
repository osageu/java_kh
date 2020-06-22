package com.polymorphism.practice2.controller;
import java.util.Random;
import com.polymorphism.practice2.model.vo.*;
public class AnimalManager{

	public static void main(String[] args) {
//		Random ran = new Random();
		Animal[] animal = new Animal[5];
//		for (int i = 0 ; i < animal.length ; i++) {
//			int nansu = ran.nextInt(2)+1;
//			if (nansu == 1) {
//				animal[i] = new Dog();
//			} else {
//				animal[i] = new Cat();
//			}
//			animal[i].speak();
//		}
		animal[0] = new Dog("개1", "비글", 30);
		animal[1] = new Dog("개2", "말티즈", 20);
		animal[2] = new Dog("개3", "치와와", 16);
		animal[3] = new Cat("고양이1", "인절미", "회기", "오렌지색");
		animal[4] = new Cat("고양이2", "고등어", "이문동", "회색");
		for (int i = 0 ; i < animal.length ; i++) {
			animal[i].speak();
		}
		
	}
	
}
