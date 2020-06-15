package com.hw1.run;
import com.hw1.model.vo.*;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee[] emp = new Employee[3];
		emp[0] = new Employee();
		emp[1] = new Employee(1, "홍길동", 19, 'M', "010-2222-3333", "서울 잠실");
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "010-1111-2222", "서울 마곡");
		
		for (int i = 0 ; i < emp.length ; i++) {
			System.out.println("emp[" + i + "] : " + emp[i].info());
		}
		
	}

}
