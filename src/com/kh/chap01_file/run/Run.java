package com.kh.chap01_file.run;
import java.io.*;

public class Run {

	public static void main(String[] args) {
		
		try {
			
			// 1. 경로지정을 딱히 하지 않으면 현재 project folder에 해당 파일이 만들어짐
			File f1 = new File("test.txt"); // 메모리상에 File 객체 생성한 것!
			f1.createNewFile();
			// 2. 경로지정
			File f2 = new File("D:\\test.txt"); // \를 escape문자로 인식할 수 있어서 \\써줌
			f2.createNewFile();
			// 3. 없는 폴더
//			File f3 = new File("D:\\temp\\test.txt");
//			f3.createNewFile();
			// 4. 폴더 생성
			File tempFolder = new File("D:\\temp"); // 확장자 지정안하면 폴더로 인식
			tempFolder.mkdir();
			
			File f3 = new File("D:\\temp\\test.txt");
			f3.createNewFile();
			
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\person.jpg");
			file.createNewFile();
			
			File html = new File("parent\\love.html");
			html.createNewFile();
			
			System.out.println("파일명 : " + html.getName());
			System.out.println("경로 : " + html);
			System.out.println("절대경로 : " + html.getAbsolutePath());
			System.out.println("파일 용량 : " + html.length());
			System.out.println("상위폴더 : " + html.getParent());
			System.out.println("File 여부 : " + html.isFile());
			System.out.println("File 여부 : " + folder.isFile());
			System.out.println("존재 여부 : " + html.exists());
			
		} catch (IOException e) {
			e.printStackTrace(); // 오류 구문을 출력해줌
		}
		
	}

}
