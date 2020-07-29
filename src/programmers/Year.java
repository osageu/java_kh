package programmers;

class Year {
    public String solution(int a, int b) {
        String answer = "";
        int[] year = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 2016.1.1 = 금요일
        String[] day = {"MON", "TUE", "WED", "THU","FRI","SAT","SUN"};
        
        // 1. 연도를 일수(int c)로 변환
        int c = 0;
        if (a == 1) {
        	c = b;
        } else if (a == 12) {
        	c = 335 + b;
        } else {
        	for (int i = 0 ; i < a ; i++) {
        		c += year[i];
        	}
        	c += b;
        }
        
        // 2. c를 7로 나눈 나머지로 요일 특정
        answer = day[c % 7];
        
        return answer;
    }
}
