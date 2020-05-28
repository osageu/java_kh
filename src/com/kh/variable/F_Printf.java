package com.kh.variable;

public class F_Printf {
	
	public void printfMethod() {
//		println : 출력 후 한 줄 띄어쓰기
//		print : 출력만 하기
//		printf : "출력하고자 하는 format(형식)", value, value, ...) --> 내가 제시한 format에 맞춰서 출력만 해줌(개행X)
//		형식을 지정할 때 제시할 수 있는 키워드 : %d
		
		int iNum1 = 10;
		int iNum2 = 20;
		int iNum3 = 30;
		int iNum4 = 40;
		
		// " iNum1 = 10 "
		System.out.println("iNum1 : " + iNum1);
		
//		System.out.printf("iNum1 : %d\niNum2 : \niNum3 : %d\niNum4 : ", iNum1, iNum2, iNum3, iNum4);
		
		// " iNum1 : 10, iNum2 : 20 "
		System.out.printf("iNum1 : %d, iNum2 : %d\n", iNum1, iNum2);
		
		// " 10 + 20 = 30 "
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1 + iNum2);
		System.out.printf("%-10d%10d\n", iNum1, iNum2);
		
		// " dNum1 : xxxx, dNum2 : xxxx " --> 여섯자리까지 무조건 출력(넘어가면 반올림, 모자라면 0으로 채워짐)
		double dNum1 = 1.2345458;
		double dNum2 = 4.53;
		System.out.printf("dNum1 : %f, dNum2 : %f\n", dNum1, dNum2);
		System.out.printf("dNum1 : %.3f, dNum2 : %.3f\n", dNum1, dNum2);
		
		char ch = 'a';
		String str = "HeLLo";
		
		System.out.printf("%c %s\n", ch, str);
		System.out.printf("%C %S", ch, str);
	}
	
	
}
