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
			int select = sc.nextInt();
			sc.nextLine();
			
			switch(select) {
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : printAllMember(); break;
			case 9 : System.out.println("Exit the program"); return;
			default : System.out.println("Select Again!!"); 
			}
			
		}
	}
	public void insertMember() {
		if (mc.getMemberCount() > MemberController.SIZE) {
			return;
		}
			System.out.print("아이디 : ");
			String userId = sc.nextLine();
			
			while (true) {
				
				Member overlap = mc.checkId(userId);
				if (overlap != null) {
					System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
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
		
	}
	
	public void updateMember() {
		
	}
	
	public void deleteMember() {
		
	}
	
	public void printAllMember() {
		
	}
	
}

