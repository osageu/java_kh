package com.kh.chap04_assist.part02_object.model.dao;
import com.kh.chap04_assist.part02_object.model.vo.*;
import java.io.*;

public class ObjectsTest {
	
	public void fileSave() {
		
		Phone[] arr = new Phone[3];
		arr[0] = new Phone("LG", "V40", 900000);
		arr[1] = new Phone("Samgsung", "Galaxy S20", 1200000);
		arr[2] = new Phone("Apple", "IPhone8+", 850000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Phone.dat"))){
			for (int i = 0 ; i < arr.length ; i++) {
				oos.writeObject(arr[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileRead() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Phone.dat"))){
			while(true) {
				System.out.println(ois.readObject());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("File end");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
	}
	
}
