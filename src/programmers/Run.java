package programmers;

public class Run {
	
	public static void main (String[] args) {
		
		int a = 5;
		int b = 24;
//		System.out.println(new Year().solution(a,b));
		String answer = "";
        int[] year = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 2016.1.1 = 금요일
        String[] day = {"THU","FRI","SAT","SUN","MON", "TUE", "WED"};
        
        // 1. 연도를 일수(int c)로 변환
        int c = 0;
        if (a == 1) {
        	c = b;
        } else if (a == 12) {
        	c = 335 + b;
        } else {
        	for (int i = 0 ; i < a-1 ; i++) {
        		c += year[i];
        	}
        	c += b;
        }
        
        // 2. c를 7로 나눈 나머지로 요일 특정
        answer = day[c % 7];
        System.out.println(c);
        System.out.println(c%7);
        System.out.println(answer);
	}
	
}

