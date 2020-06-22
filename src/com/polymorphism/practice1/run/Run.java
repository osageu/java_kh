package com.polymorphism.practice1.run;
import com.polymorphism.practice1.model.vo.*;
public class Run {

	public static void main(String[] args) {
		
		SmartPhone[] sp = new SmartPhone[2];
		sp[0] = new GalaxyNote9();
		sp[1] = new V40();
		
		for (int i = 0 ; i < sp.length ; i++) {
			sp[i].printMaker();
			sp[i].makeacall();
			sp[i].takeacall();
			sp[i].touch();
			sp[i].charge();
			sp[i].picture();
			System.out.println();
		}
		
	}

}
