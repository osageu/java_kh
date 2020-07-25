package practice;
import java.util.*;

public class crane_doll {
	
	public int[] solution(int[][] board, int[] moves) { // solution open
		
		int[] baguni = new int[board.length*board.length];
		for (int i = 0 ; i < moves.length ; i++) { // for i open
			for (int j = 0 ; j < board.length ; j++) {
					if(board[j][(moves[i]-1)] != 0) {
						baguni[i] = board[j][(moves[i]-1)];
						board[j][(moves[i]-1)] = 0;
						break;
					}
			}
		} // for i close
		int[] cop = Arrays.copyOf(baguni, moves.length);
		int[] copy2 = Arrays.copyOf(cop, moves.length);
		int[] copy = Arrays.copyOf(cop, moves.length);
		int count = 0;
		for (int i = 0 ; i < cop.length ; i++) {
			if (cop[i] != 0) {
				copy2[count] = cop[i];
				count++;
			}
			if ( i == cop.length-1) {
				copy = Arrays.copyOf(copy2, count);
			}
		}
		
		// copy = { 4, 3, 1, 1, 3, 2, 4 }
		int abc = 0;
		int count2 = 0;
		while(abc < 5) {
			
			for (int i = 0 ; i < copy.length-count2 ; i++) {
				if (i < copy.length-count2-1) {
					if( copy[i] == copy[i+1]) {
						copy[i] = 0;
						copy[i+1] = 0;
						abc = 1;
						count2 += 2;
						break;
					} else {
						abc = 6;
					}
				} else if (i == copy.length-count2-1) {
					break;
				}
			} 
			
			// copy = { 4, 3, 0, 0, 3, 2, 4}
			if (abc != 6) {
				int[] a = Arrays.copyOf(copy, copy.length); // a = {4, 3, 0, 0, 3, 2, 4}
				int[] b = Arrays.copyOf(a, copy.length); // b = {4, 3, 0, 0, 3, 2, 4}
				int count3 = 0;
				for (int i = 0 ; i < a.length ; i++) {
					if (a[i] != 0) {
						b[count3] = a[i];
						count3++;
					} // b = {4, 3, 3, 2, 4, 2, 4}
					if ( i == a.length-1) {
						copy = Arrays.copyOf(b, count3); // copy = {4, 3, 3, 2, 4}
					}
				}
			}
			
		} 
		return copy;
			
	} // solution close
	
	public int test() {
		int a = 1;
		int b = 0;
		int c = 0;
		while(b < 5) {
			a++;
			a++;
			c = a;
			b++;
		}
		c++;
		return a;
	}
	
//	public void solution2(int[][] board, int[] moves) {
//		
//		int[] baguni = new int[board.length*board.length];
//		for (int i = 0 ; i < moves.length ; i++) { // for i open
//			for (int j = 0 ; j < board.length ; j++) {
//					if(board[j][(moves[i]-1)] != 0) {
//						baguni[i] = board[j][(moves[i]-1)];
//						board[j][(moves[i]-1)] = 0;
//						break;
//					}
//			}
//		} // for i close
//		
//		int[] cop = Arrays.copyOf(baguni, moves.length);
//		int[] copy2 = Arrays.copyOf(cop, moves.length);
//		int[] copy = Arrays.copyOf(cop, moves.length);
//		int count = 0;
//		for (int i = 0 ; i < cop.length ; i++) {
//			if (cop[i] != 0) {
//				copy2[count] = cop[i];
//				count++;
//			}
//			if ( i == cop.length-1) {
//				copy = Arrays.copyOf(copy2, count);
//			}
//		}
//		// copy = { 4, 3, 1, 1, 3, 2, 4 }
//		
//		StringBuilder origin = new StringBuilder();
//		for (int i = 0 ; i < copy.length ; i++) {
//			origin.append(copy[i]);
//		}
//		
//		System.out.println(origin);
//		
//	}
	
	public int solution3(int[][] board, int[] moves) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
			for(int i=0;i<moves.length;i++){
	            for(int j=0;j<board.length;j++){
	                if(board[j][moves[i]-1]!=0){
	                    a.add(board[j][moves[i]-1]);
	                    board[j][moves[i]-1]=0;
	                    break;
	                }
	            }
			}
			
			int count = 0;
			for ( int i = 0 ; i < a.size() ; i++) {
				if (i != a.size()-1) {
					if ( a.get(i) == a.get(i+1)) {
						a.remove(i);
						a.remove(i);
						i = 0;
						count += 2;
					}
				}
			}
			return count;
	}
	
}

//import java.util.ArrayList;
//import java.util.List;
//class Solution {
//    public int solution(int[][] board, int[] moves) {
//        int answer = 0;
//        List<Integer> nums = new ArrayList<Integer>();
//
//        for(int i=0;i<moves.length;i++){
//            for(int j=0;j<board.length;j++){
//                if(board[j][moves[i]-1]!=0){
//                    nums.add(board[j][moves[i]-1]);
//                    board[j][moves[i]-1]=0;
//                    break;
//                }
//
//            }
//
//        }
//        for(int k=0;k<nums.size();k++){
//            if(k!=(nums.size()-1)){
//                if(nums.get(k)==nums.get(k+1)){
//                    nums.remove(k);
//                    nums.remove(k);
//                    answer++;
//                    k=-1;
//
//                }
//
//            }
//        }
//
//        return answer*2;
//    }
//}





