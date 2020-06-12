package com.hw1.run;

import com.hw1.controller.*;

public class Run {

	public static void main(String[] args) {
		
		NonStaticSample osageu = new NonStaticSample();
		
		osageu.printLottoNumber();                                                // 1
		osageu.outputChar(5,'a');                                                   // 2
		System.out.println(osageu.alphabette());                           // 3
		System.out.println(osageu.mySubstring("apple", 2, 4));   // 4
		
	}

}
