package com.method.hw3.run;
import com.method.hw3.controller.*;

public class Run {
	
	public static void main(String[] args) {
		
		// 1)
		StaticSample.setValue("Java");
		System.out.println("value : " + StaticSample.getValue());
		
		// 2)
		System.out.print("대문자로 : ");
		StaticSample.toUpper();
		System.out.println(StaticSample.getValue());
		
		// 3)
		System.out.print("길이 : ");
		System.out.println(StaticSample.valueLength());
		
		// 4)
		String str = "PROGRAMMING";
		System.out.print(str + " 붙여서 : ");
		System.out.println(StaticSample.valueConcat(str));
		
		
		
		// 5)
		int aa = 0;
		char cc = 'C';
		System.out.print(StaticSample.getValue().charAt(aa) + " => " + cc + " : ");
		StaticSample.setChar(aa, cc);
		System.out.println(StaticSample.getValue());
		
	}

}
