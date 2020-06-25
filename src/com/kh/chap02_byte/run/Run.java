package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.*;

public class Run {
	
	/* 
	 *  프로그램상의 데이터를 외부매체로 출력을 한다거나 또는 외부매첼로부터 입력을 받아올 때
	 *  반드시 그 외부매체와의 통로를 만들어줘야됨!! --> "Stream"
	 *  
	 *  Stream
	 *  : 단방향 - 입력이면 입력, 출력이면 출력만 가능! 즉, 입력과 출력을 동시에 하려면 각각의 Stream필요
	 *  : 선입선출 - 먼저 들어간 값이 먼저나오게 된다. 즉, 시간지연이 생길 수 있다.
	 *  
	 *  Stream의 구분
	 *  : 통로의 size
	 *  	1) byte stream : 1byte 통행가능한 사이즈(좁은 통로) --> XXXInputStream(입력) / XXXOutputStream(출력)
	 *  	2) character stream : 2byte 통행가능한 사이즈(넓은 통로) --> XXXReader(입력) / XXXWriter(출력) 
	 *  
	 *  : 외부매체와 직접 연결 유무
	 *  	1) 기반 Stream : 외부매체와 직접 연결하는 통로
	 *  	2) 보조 Stream : 보조역할 
	 *  		--> 속도 증가, 데이터 자료형 변환, 그 외 유용한 기능 제공
	 *    		--> 따라서 stream이 반드시 필요함(단독 사용 불가)
	 *  
	 */
	
	
	public static void main(String[] args) {
		
		// "바이트 기반 스트림" 가지고 데이터 입출력!!
		// 외부매체를 지정하고 그 외부매체와 직접적으로 연결된 통로에 데이터를 1byte단위로 전송하겠다
		// File Input/Output Stream : 외부매체로 파일 지정
		// Audio Input/Output Stream : 외부매체로 오디오 지정
		// Piped Input/Output Stream : 외부매체로 또 다른 프로세스 지정
		
		FileByteTest a = new FileByteTest();
		a.fileRead();
		
		}

}
