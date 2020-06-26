package io.model.dao;
import java.io.*;
import java.util.*;

public class FileDao {
	
	// field
	Scanner sc = new Scanner(System.in);
	
	// constructor
	public FileDao() {
		
	}
	
	// method
	public void fileSave() {
		
		StringBuilder sb = new StringBuilder();
		while(true) { // while open
			
			System.out.print("파일에 저장할 내용을 반복해서 입력하시오(\"exit\"을 입력하면 내용 입력 끝) : ");
			String input = sc.nextLine();
			if (input.equals("exit")) {
				break;
			}
			sb.append(input);
			
		} // while close
		
		System.out.print("저장하시겠습니까? (y/n) : ");
		char input = sc.nextLine().charAt(0);
		if (input == 'y' || input == 'Y') {
			System.out.print("파일명 : ");
			String filename = sc.nextLine();
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename+".txt"))){
				bw.write(sb.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("다시 메뉴로 돌아갑니다.");
			return;
		}
		
	}
	
	public void fileOpen() {
		
		System.out.print("열기 할 파일명 : ");
		String input = sc.nextLine();
		try(BufferedReader br = new BufferedReader(new FileReader(input+".txt"))){
			String str = "";
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			System.out.println("존재하는 파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileEdit() {
		System.out.print("수정 할 파일명 : ");
		String input = sc.nextLine();
		try (BufferedReader br = new BufferedReader(new FileReader(input+".txt"))){
			// 입력
			String str = "";
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			// 입력
			
			// 출력
			StringBuilder sb = new StringBuilder();
			while(true) { // while open
				
				System.out.print("파일에 추가할 내용을 입력하시오(\"exit\"을 입력하면 내용 입력 끝) : ");
				String edit = sc.nextLine();
				if (edit.equals("exit")) {
					break;
				}
				sb.append(edit);
				
			} // while close
			
			System.out.print("변경된 내용을 파일에 추가하시겠습니까? (y/n) : ");
			char yn = sc.nextLine().charAt(0);
			if (yn == 'y' || yn == 'Y') {
				try(BufferedWriter bw = new BufferedWriter(new FileWriter(input+".txt", true))){
					bw.write(sb.toString());
					System.out.println("입력받은 " + input + ".txt 파일의 내용이 변경되었습니다^^;;");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				return;
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
} // end
