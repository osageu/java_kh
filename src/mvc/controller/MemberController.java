package mvc.controller;
import java.util.Arrays;

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
	{
	mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
	mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
	mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
	mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
	mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com"); 
	memberCount = 5;
	}
	// constructor
	public MemberController() {
		
	}
	
	// method
	public int getMemberCount() {
		return memberCount;
	}
	
	public Member[] getMem() {
		return mem;
	}
	
	public Member checkId (String userId){
		
		Member m = null;
		for (int i = 0 ; i < memberCount ; i++) {
			if (userId.equals(mem[i].getUserId())) {
				m = mem[i];
			} 
		}
		return m;
		
	}
	
	public int insertMember (String userId, String userPwd, String name, int age, char gender, String email) {
		int result = 0;
		mem[memberCount] = new Member(userId, userPwd, name, age, gender, email);
		memberCount++;
		result = 1;
		return result;
	}
	
	public Member[] searchMember (int menu, String search) {
		
		Member[] result = new Member[10];
		int count = 0;
		
		for ( int j = 0 ; j < memberCount ; j++) {
			if (menu == 1 && mem[j].getUserId().equals(search)) {
				result[count] = mem[j];
				count++;
				continue;
			} else if (menu == 2 && mem[j].getName().equals(search)) {
				result[count] = mem[j];
				count++;
				continue;
			} else if (menu == 3 && mem[j].getEmail().equals(search)) {
				result[count] = mem[j];
				count++;
				continue;
			}

		}
		if (count == 0) {
			Member[] copy = null;
			return copy;
		} else {
			Member[] copy =  Arrays.copyOf(result, count);
			return copy;
		}
		
	}
	
	public void updateMember (Member m, int menu, String update) {
		
		switch(menu) {
		case 1 : m.setUserPwd(update); break;
		case 2 : m.setName(update); break;
		case 3 : m.setEmail(update); break;
		}
		
	}
	
	public void deleteMember(String userId) { // userId = mem[2].getUserId;
		
		int temp = 0;
		for ( int i = 0 ; i < memberCount ; i++) { // memberCount = 5 ( i = 0, 1, 2, 3, 4 )
			if (userId.equals(mem[i].getUserId())) {
				temp = i;
			}
		}
		for ( int i = temp ; i < memberCount-1 ; i++) {
			mem[temp] = mem[temp+1];
			temp++;
		}
		memberCount--;
		
	}
	// mem[0] --> pass
	// mem[1] --> pass
	// mem[2] --> mem[2] = mem[3]
	// mem[3] --> mem[3] = mem[4]
	// mem[4] --> mem[4]
	
	
}
