package com.kh.chap01_file.run;
import java.io.*;

public class Run {

	public static void main(String[] args) {
		
		try {
			// 1. 경로지정을 딱히 하지 않으면 현재 project folder에 해당 파일이 만들어짐
			File f1 = new File("test.txt"); // 메모리상에 File 객체 생성한 것!
			f1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
