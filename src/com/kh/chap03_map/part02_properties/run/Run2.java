package com.kh.chap03_map.part02_properties.run;
import java.util.*;
import java.io.*;

public class Run2 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		Properties prop2 = new Properties();
		try {
			prop.load(new FileInputStream("test.properties"));
			// load.properties
			Set load = prop.keySet();
			Iterator<String> it = load.iterator();
			while(it.hasNext()) {
				String key = it.next();
				System.out.println("Key : " + key);
				System.out.println("Value : " + prop.get(key));
			}
			System.out.println("=============================================");
			// load.XML
			prop2.loadFromXML(new FileInputStream("test.xml"));
			Set load2 = prop2.keySet();
			Iterator<String> it2 = load2.iterator();
			while(it2.hasNext()) {
				String key = it2.next();
				System.out.println("Key : " + key);
				System.out.println("Value : " + prop2.get(key));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
