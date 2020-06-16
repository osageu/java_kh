package mvc.controller;
import mvc.model.vo.*;

/**
 * @author user1
 *
 */
public class MemberController {
	
	// field
	public static final int SIZE = 10;
	private int memberCount = 0;
	private Member[] mem = new Member[SIZE];
	
	// constructor
	public MemberController() {
		
	}
	
	// method
	public int getMemberCount() {
		return memberCount;
	}
	
//	public Member[] getMem() {
//		
//	}
	
	public Member checkId (String userId){
		Member overlap = null;
		for (int i = 0 ; i < memberCount ; i++) {
			if (mem[memberCount].getUserId() != mem[i].getUserId()) {
				overlap = null;
			}
		}
		return overlap;
	}
	
	public int insertMember (String userId, String userPwd, String name, int age, char gender, String email) {
		int result = 0;
		mem[memberCount] = new Member(userId, userPwd, name, age, gender, email);
		memberCount++;
		result = 1;
		return result;
	}
	
//	public Member searchMember (int menu, String search) {
//		
//	}
	
	public void updateMember (Member m, int menu, String update) {
		
	}
	
	public void deleteMember(String userId) {
		
	}
	
	
}
