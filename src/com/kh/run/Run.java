package com.kh.run;

import java.io.IOException;
import com.kh.exception.B_CheckedException;

public class Run {

	public static void main(String[] args) throws IOException{
		
		B_CheckedException b = new B_CheckedException();
		b.method1(); // 여기서 떠넘기면 JVM이 처리..
		
	}

}
