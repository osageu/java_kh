package com.kh.chap02_byte.model.dao;
import java.io.*;

public class FileByteTest {
	
	// 프로그램 (java or code or memory) --> 외부매체(파일) (출력 : 프로그램상의 데이터를 파일로 내보내기)
	public void fileWrite() {
		
		// 출력용 Stream 
		
		// FileOutputStream : "파일"로 데이터를 1byte 단위로 출력하는 stream
		// 1. FileOutputStream 객체 생성 --> 해당 파일과의 연결통로를 만들겠다!
		// true 미작성 시 : 기존의 파일에 덮어쓰기 (기본값 : false)
		// true 작성 시 : 기존의 파일에 이어서 출력
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("a_byte.txt",true); // 해당 파일없으면 생성, 있으면 연결
			// FileNotFoundException : 존재하지 않는 경로 제시할 경우
			// 2. 해당 Stream으로 데이터 출력 --> Stream.write() method 사용!
			// 단, 파일에 기록되기로는 숫자로 기록되지 않음 
			// --> 실제로 기록되는 건 해당 숫자의 고유한 문자가 기록됨
			// --> 97 = 'a'   98 = 'b'   ... 문자들의 고유한 숫자값은 0부터 시작 (0~127) <-- 음수값 불가!!
			// fos.write(98); // b
			// fos.write('b'); // b
			// fos.write('강'); // 한글은 2byte여서 깨짐
			// byte array를 파일에 출력
			byte[] bArr = {111, 115, 97, 103, 101, 117}; // <-- osageu ,, character 하나씩 하나씩 전달
			fos.write(bArr);
			fos.write(bArr,1,2);
			// 3. Stream 반납하기 
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 어떤 예외가 발생하든 반드시 실행하는 구문
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	// 입력용 Stream
	// 프로그램 <-- 파일 (입력받아옴)
	public void fileRead() {
		
		// FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력받는 Stream
		// 1. FileInputStream 객체 생성
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a_byte.txt");
			// 2. 파일로부터 데이터 입력받아오기
			// --> Stream.read() method
//			for (int i = 1 ; i < "a_byte.txt".length() ; i++) {
//				if (fis.read() != -1) { // 조건식에서의 fis.read()도 문자값을 불러오기 때문에 퐁당퐁당 입력됨
//					System.out.println(fis.read());
//				} 
//			}
			// 해결 1. 무한반복 돌리면서 조건검사
//			while(true) {
//				
//				int value = fis.read();
//				if (value == -1) {
//					break;
//				}
//				System.out.println(value);
//			}
			// 해결 2. 그냥.. 변수활용해
			int value = 0;
			while((value = fis.read()) != -1) {
				System.out.print((char)value);
			}
			
		} catch(Exception e) {
			
		} finally {
			try {
				fis.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
