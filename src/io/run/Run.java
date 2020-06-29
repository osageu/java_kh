package io.run;
import io.model.dao.*;
import java.util.*;
public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FileDao fd = new FileDao();
		
		while(true) {
			
			System.out.println("****** MyNote ******");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");
			System.out.print("Select Menu : ");
			int select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1 : fd.fileSave(); break;
			case 2 : fd.fileOpen(); break;
			case 3 : fd.fileEdit(); break;
			case 4 : System.out.println("Exit program.."); return;
			}
			
		}
		
		
	}

}
