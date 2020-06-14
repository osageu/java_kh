package com.hw1.controller;
import java.util.*;

public class NonStaticSample {
	// import
	Random ran = new Random();
	
	// field
	
	// constructor
	
	// method
	// 1)
	public void printLottoNumber() {
		
		int[] lotto = new int[6];
		
		for (int i = 0 ; i < lotto.length ; i++) {
			lotto[i] = ran.nextInt(45) + 1;
			for (int j = 0 ; j < i ; j++) {
				if (lotto[j]==lotto[i]) {
					i--;
				}
			}
		}
		Arrays.sort(lotto);
		for (int i = 0 ; i < lotto.length ; i++) {
			System.out.print(lotto[i] + " ");
		}
		
	}
	
	// 2)
	public void outputChar(int num, char c) {
		
		for (int i = 1 ; i <= num ; i++) {
			System.out.print(c + "  ");
		}
		
	}
	
	// 3)
	public char alphabette() { // 65~90 : A to Z , 97~122 : a to z
		
		while(true) {
			int AToz = ran.nextInt(58) + 65; 
			if ( AToz >= 91 && AToz <= 96) {
				continue;
			} else {
				return (char)AToz;
			}
		}
		
	}
	
	// 4)
	public String mySubstring(String str, int index1, int index2) {
		
		String cut = null;
		cut = str.substring(index1, index2);
		return cut;
		
	}
	
}

