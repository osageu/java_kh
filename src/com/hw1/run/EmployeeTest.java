package com.hw1.run;
import com.hw1.model.vo.*;

public class EmployeeTest {

	public static void main(String[] args) {
		
		// 1)
		Employee[] emp = new Employee[3];
		emp[0] = new Employee();
		emp[1] = new Employee(1, "홍길동", 19, 'M', "010-2222-3333", "서울 잠실");
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "010-1111-2222", "서울 마곡");
		
		for (int i = 0 ; i < emp.length ; i++) {
			System.out.println("emp[" + i + "] : " + emp[i].info());
		}
		System.out.println("=====================================================================");
		
		// 2)
		emp[0].setEmpNo(0);
		emp[0].setEmpName("김말똥");
		emp[0].setDept("영업부");
		emp[0].setJob("팀장");
		emp[0].setAge(30);
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("010-5555-9999");
		emp[0].setAddress("전라도 광주");
		
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		
		for (int i = 0 ; i < emp.length-1 ; i++) {
			System.out.println("emp[" + i + "] : " + emp[i].info());
		}
		System.out.println("=====================================================================");

		// 3)
		for (int i = 0 ; i < emp.length ; i++) {
			System.out.println(emp[i].getEmpName() + "의 연봉 : " + (int)(emp[i].getSalary() + (emp[i].getSalary() * emp[i].getBonusPoint()))*12 + "원");
		}
		System.out.println("=====================================================================");
		
		// 4) 
		int average = 0;
		for (int i = 0 ; i < emp.length ; i++) {
			average += (emp[i].getSalary() + (emp[i].getSalary() * emp[i].getBonusPoint()))*12;
		}
		System.out.println("직원들의 연봉의 평균 : " + average/emp.length + "원");
		
		
		
	}

}
