package programmers;
import java.util.*;

public class Run {
	
	public static void main (String[] args) {
		
		int[] answer = {2,4,3,1,5,3,4,2,1,4,3,2};
		ArrayList<Integer> a = new Solution().solution(answer);
        for (Integer e : a) {
        	System.out.print(e + ", ");
        }
	}
	
}
