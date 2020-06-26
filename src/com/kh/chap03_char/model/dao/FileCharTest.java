package com.kh.chap03_char.model.dao;

import java.io.*;

public class FileCharTest {
	
	// 프로그램 --> 파일(출력)
	public void fileSave() {
		
		// FileWriter : 파일로 데이터를 2byte단위로 출력
		// 1. FileWrite 객체 생성
		// try ~ with ~ resource
		try(FileWriter fw = new FileWriter("b_char.dat")) {
			// 2. write() method
			fw.write("와! IO 재밌다..");
			fw.write("\n");
			fw.write('A');
			char[]	cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write("\n");
			fw.write(cArr);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
	// 프로그램 <-- 파일 (입력)
	public void fileRead() {
		
		// FileReader : 파일로부터 데이터를 2byte단위로 받기
		// 1. FileReader 객체 생
		try(FileReader fr = new FileReader("b_char.dat")) {
			
			// 2. read();
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
			
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
