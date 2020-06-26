package com.kh.chap04_assist.part02_object.model.dao;
import com.kh.chap04_assist.part02_object.model.vo.*;
import java.io.*;

public class ObjectTest {
	
	// 프로그램 --> 파일
	public void fileSave() {
		
		Phone ph1 = new Phone("Samsung", "Galaxy S20", 1200000);
		Phone ph2 = new Phone("Apple", "IPhone 8+", 1200000);
		
		// 객체를 파일에 출력할 때 사용되는 Stream
		// FileOutputStream : 기반스트림(파일과 직접적인 연결통로)
		// ObjectOutputStream
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Phone.dat"))){
			
			// WriteObject()
			oos.writeObject(ph1); // NotSerialzableException, 기록은 이상하게 되지만 문제 없음
			oos.writeObject(ph2); 
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	public void fileRead() {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Phone.dat"))){
			
			// readObject()
			Phone[] pArr = new Phone[2];
			for (int i = 0 ; i < pArr.length ; i++) {
				pArr[i] = (Phone)ois.readObject();
				System.out.println(pArr[i]);
			}
			
			
		} catch (EOFException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	
	
}
