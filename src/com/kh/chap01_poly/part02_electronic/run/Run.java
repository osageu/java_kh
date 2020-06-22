package com.kh.chap01_poly.part02_electronic.run;
import com.kh.chap01_poly.part02_electronic.model.vo.*;
import com.kh.chap01_poly.part02_electronic.controller.*;
public class Run {

	public static void main(String[] args) {
		
		// 납품업체
		// 1. 다형성 적용 X
		ElectronicController ec = new ElectronicController();
		
		// 용산전자상가에 새 desktop, notebook, tablet 납품할 것임!
		ec.insert(new Desktop("Samsung", "데탑", 1200000, "Geforce 1070"));
		ec.insert(new NoteBook("LG", "그램", 1800000, 4));
		ec.insert(new Tablet("Apple", "아이패드프로", 1200000, true));
		
		// 가게에 초기화된 물건들의 정보를 조회할 것임!
		Desktop d = ec.selectDesktop();
		System.out.println(d);
		NoteBook n = ec.selectNoteBook();
		System.out.println(n);
		Tablet t = ec.selectTablet();
		System.out.println(t);
		System.out.println("============ 다형성 적용 후 ============");
		
		
		
		// 2. 다형성 적용 O
		ElectronicController2 ec2 = new ElectronicController2();
		ec2.insert(new Desktop("Samsung", "데탑", 1200000, "Geforce 1070"));
		ec2.insert(new NoteBook("LG", "그램", 1800000, 4));
		ec2.insert(new Tablet("Apple", "아이패드프로", 1200000, true));
		
		// 값 조회하는 요청
		Desktop d2 = (Desktop)ec2.select(0);
		NoteBook n2 = (NoteBook)ec2.select(1);
		Tablet t2 = (Tablet)ec2.select(2);
		System.out.println(d2);
		System.out.println(n2);
		System.out.println(t2);
		System.out.println("============ 반복문으로 출력 ============");
		
		Electronic[] aa = ec2.select();
		for (int i = 0 ; i < aa.length ; i++) {
			if ( aa[i] instanceof Desktop) {
			System.out.println(((Desktop)aa[i]).getGraphic());
			} else if ( aa[i] instanceof NoteBook) {
			System.out.println(((NoteBook)aa[i]).getUsbPort());
			} else {
			System.out.println(((Tablet)aa[i]).isPenFlag());
			}
		}
		System.out.println("============ 동적 바인딩으로 출력 ============");
		for (int i = 0 ; i < aa.length ; i++) {
			System.out.println(aa[i].print());
		}
		
	}

}
