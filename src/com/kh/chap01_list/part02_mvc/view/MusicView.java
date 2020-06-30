package com.kh.chap01_list.part02_mvc.view;
import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;
import java.util.ArrayList;
import java.util.Scanner;

// view : 시각적인 요소 (출력 및 입력)
public class MusicView {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		
		
		while (true) { // while open
			
			System.out.println();
			System.out.println("=== Welcome 별밤 ===");
			System.out.println("1. 신규 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 검색");
			System.out.println("4. 특정 곡 삭제");
			System.out.println("5. 특정 곡 수정");
			System.out.println("6. 곡 정렬 하기");
			System.out.println("0. 프로그램 종료");
			System.out.print("Select Menu : ");
			int select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1 :  insertMusic(); break;
			case 2 :  showAllMusic(); break;
			case 3 :  searchMusic(); break;
			case 4 :  deleteMusic(); break;
			case 5 :  editMusic(); break;
			case 6 :  sortMusic(); break;
			case 0 : System.out.print("Exit program..."); return;
			default : System.out.println("Error : select again"); break;
			}
			
		} // while close
		
		
	}
	
	// 서브화면1. 신규 곡을 추가하는 화면
	private void insertMusic() {
		System.out.println("==== 곡 추가 ====");
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String artist = sc.nextLine();
		mc.insertMusic(title, artist);
		System.out.println("곡 추가 완료");
	}
	
	// 서브화면2. 전체 곡 조회
	private void showAllMusic() {
		System.out.println("==== 곡 리스트 ====");
		ArrayList<Music> salmon = mc.showAllMusic();
		if (salmon.isEmpty()) {
			System.out.println("아직 추가된 곡이 없습니다.");
		} else {
			for (int i = 0 ; i < salmon.size() ; i++) {
				System.out.println(salmon.get(i));
			}
		}
	}
	
	// 서브화면3. 특정 곡 검색
	private void searchMusic() {
		System.out.println("==== 곡 검색 ====");
		if (mc.showAllMusic().isEmpty()) {
			System.out.println("아직 추가된 곡이 없습니다.");
			return;
		}
		
		System.out.println("1. 곡명으로 검색");
		System.out.println("2. 가수명으로 검색");
		System.out.println("3. 곡명+가수명으로 검색");
		System.out.print("Select Menu : ");
		int select = sc.nextInt();
		sc.nextLine();
		System.out.print("검색할 키워드 : ");
		String search = sc.nextLine();
		ArrayList<Music> salmon = mc.searchMusic(select, search);
			if(salmon.isEmpty()) {
				System.out.println("검색 결과가 없습니다.");
			} else {
				for (int i = 0 ; i < salmon.size() ; i++) {
					System.out.println(salmon.get(i));
			}
		}
	}
	
	// 서브화면4. 특정 곡 삭제
	private void deleteMusic() {
		System.out.println("==== 곡 삭제 ====");
		if (mc.showAllMusic().isEmpty()) {
			System.out.println("아직 추가된 곡이 없습니다.");
			return;
		}
		System.out.print("삭제할 곡의 이름 : ");
		String delete = sc.nextLine();
		int result = mc.deleteMusic(delete);
		if (result == 1) {
			System.out.println("삭제되었습니다.");
		} else if (result ==2) {
			System.out.println("존재하지 않는 곡명입니다.");
		}
	}
	
	// 서브화면5. 특정 곡 수정
	private void editMusic() {
		System.out.println("==== 곡 수정 ====");
		if (mc.showAllMusic().isEmpty()) {
			System.out.println("아직 추가된 곡이 없습니다.");
			return;
		}
		String edit = "";
		while(true) {
			System.out.print("수정할 곡의 이름 : ");
			edit = sc.nextLine();
			int result = 0;
			for (int i = 0 ; i < mc.showAllMusic().size() ; i++) {
				if (mc.showAllMusic().get(i).getTitle().equals(edit)) {
					System.out.println(mc.showAllMusic().get(i));
					break;
				} else {
					System.out.println("존재하지 않는 곡명입니다. 다시 입력하세요.");
					result = 1;
				}
			}
			if (result == 1) {
				continue;
			}
			break;
		}
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String artist = sc.nextLine();
		
		int result = mc.editMusic(edit, title, artist);
		if (result == 1) {
			System.out.println("수정되었습니다.");
		} else if (result ==2) {
			System.out.println("존재하지 않는 곡명입니다.");
		}
	}
	
	// 서브화면6. 곡 정렬
	private void sortMusic() {
		
	}
	
}















