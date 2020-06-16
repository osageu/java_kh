package mvc.view;
import mvc.controller.*;
import mvc.model.vo.*;
import java.util.*;

/**
 * @author user1
 *
 */
public class MemberMenu {
	
	// field 
	private MemberController mc = new MemberController();
	private Scanner sc = new Scanner(System.in);
	
	// constructor
	public MemberMenu(){
		
	}
	
	// method
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("\n====== 회원 관리 메뉴 ======");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("Select Menu!! : ");
			String select = sc.nextLine();
			
			switch(select) {
			case "1" : insertMember(); break;
			case "2" : searchMember(); break;
			case "3" : updateMember(); break;
			case "4" : deleteMember(); break;
			case "5" : printAllMember(); break;
			case "9" : System.out.println("Exit the program"); return;
			default : System.out.println("Select Again!!"); 
			}
			
		}
	}
	public void insertMember() {
			
		System.out.println();
		if (mc.getMemberCount() == MemberController.SIZE) {
			System.out.println("제한된 회원 수를 초과하였습니다.");
			return;
		}
		
			while (true) {
				
				System.out.print("아이디 : ");
				String userId = sc.nextLine();
				Member overlap = mc.checkId(userId);
				if (overlap != null) {
					System.out.println("동일한 아이디가 존재합니다. 회원등록 실패\n" + overlap.info());
					continue;
				} else if (overlap == null){
					System.out.print("비밀번호 : ");
					String userPwd = sc.nextLine();
					System.out.print("이름 : ");
					String name = sc.nextLine();
					System.out.print("나이 : ");
					int age = sc.nextInt();
					sc.nextLine();
					System.out.print("성별 : ");
					char gender = sc.nextLine().charAt(0);
					System.out.print("이메일 : ");
					String email = sc.nextLine();
					int result = mc.insertMember(userId, userPwd, name, age, gender, email);
					if (result == 1) {
						System.out.println("성공적으로 회원 등록이 되었습니다.");
						break;
					}
			}
				
		}
			
	}
		
	
	public void searchMember() {
		
		System.out.println();
		while(true) {
			System.out.println("\n====== 회원 정보 검색 ======");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전 메뉴로");
			System.out.print("Select Menu! : ");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 9) {
				return;
			} else if ((menu >= 4 && menu <=8) || menu > 9) {
				System.out.println("다시 선택해주세요.");
				continue;
			}
			System.out.print("검색 내용 : ");
			String select = sc.nextLine();
			
			Member[] copy = mc.searchMember(menu, select);
			if (copy != null) {
				for ( int i = 0 ; i < copy.length ; i++) {
					System.out.println(copy[i].info());
				}
			} else if (copy == null) {
				System.out.println("검색된 결과가 없습니다.");
				continue;
			}
			return;
		}
		
	}
	
	public void updateMember() {
		
		System.out.println();
		while(true) { // while open
			
			System.out.println("\n====== 회원 정보 수정 ======");
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 이름 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("9. 이전 메뉴로");
			System.out.print("Select Menu! : ");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 9) {
				return;
			} else if ((menu >= 4 && menu <=8) || menu > 9) {
				System.out.println("다시 선택해주세요.");
				continue;
			}
			System.out.print("변경할 회원 아이디 : ");
			String userId = sc.nextLine();
			
			Member check = mc.checkId(userId);
			if (check == null) {
				System.out.println("변경할 회원이 존재하지 않습니다.");
			} else if(check != null) {
				System.out.println(check.info());
			}
			
			System.out.print("변경할 내용 : ");
			String change = sc.nextLine();
			
			mc.updateMember(check, menu, change);
			System.out.println("회원의 정보가 변경되었습니다.");
			System.out.println(check.info());
			return;
		} // while close
		
	}
	
	public void deleteMember() {
		
		System.out.println();
		System.out.print("삭제할 회원 아이디 : ");
		String userId = sc.nextLine();
		
		Member check = mc.checkId(userId);
		if (check == null) {
			System.out.println("삭제할 회원이 존재하지 않습니다.");
		} else if(check != null) {
			System.out.println(check.info());
		}
		
		System.out.print("정말 삭제하시겠습니까? (y/n) : ");
		char yn = sc.nextLine().charAt(0);
		if ( yn == 'Y' || yn == 'y') {
			mc.deleteMember(userId);
			System.out.println("회원의 정보가 삭제되었습니다.");
			return;
		} else {
			System.out.println("이전 메뉴로 돌아갑니다.");
			return;
		}
		
		
	}
	
	public void printAllMember() {
		System.out.println();
		if (mc.getMemberCount() == 0) {
			System.out.println("가입한 회원이 없습니다.");
			return;
		}
		for (int i = 0 ; i < mc.getMemberCount() ; i++) {
			System.out.println(mc.getMem()[i].info());
		}
	}
	
}

