package com.kh.chap04_assist.part01_buffered.model.dao;
import java.io.*;

public class BufferedTest {
	
	public void fileSave() {
		
		// 1. 기반 stream & 보조 stream 객체 생성
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffered.dat"))){
			
			bw.write("안녕... ");
			bw.write("배고파");
			bw.newLine();
			bw.newLine();
			bw.write("이젠 배불러");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
	public void fileRead() {
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffered.dat"))){
			
			String str = "";
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
