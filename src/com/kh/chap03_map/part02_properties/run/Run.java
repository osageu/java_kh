package com.kh.chap03_map.part02_properties.run;
import com.kh.chap03_map.part01_hashMap.mode.vo.Snack;
import java.util.*;
import java.io.*;

public class Run {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		/*
		prop.put("다이제", new Snack("초코맛", 1500));
		System.out.println(prop);
		System.out.println(prop.get("다이제"));
		
		try { 
			prop.store(new FileOutputStream("test.properties"), "Hello");
		} catch (IOException e) { // Snack --> String이 안 됨
			e.printStackTrace();
		}
		*/
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Change~!");
		
		System.out.println(prop);
		System.out.println(prop.getProperty("Map"));
		
		try {
			prop.store(new FileOutputStream("test.properties"), "Hello Universe~!");
			prop.store(new FileOutputStream("tes2t.xml"), "DayDay~~!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
