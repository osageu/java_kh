package programmers;
import java.util.Arrays;
import java.util.HashMap;

public class Marathon {
	
	public static void main(String[] args) {
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"kiki", "eden"};
		String[] participant2 = {"mislav", "stanko", "mislav", "ana"};
		String[] completion2 = {"stanko", "ana", "mislav"};
		System.out.println(solution2(participant, completion));
	}
	
	public static String solution(String[] participant, String[] completion) {
		
		int count = 0;
		int test = 0;
		int tf = 0;
		String answer = "";
		for (int i = 0 ; i < completion.length ; i++) {
			for (int j = 0 ; j < participant.length ; j++) {
				if (completion[i].equals(participant[j])) {
					test++;
				}
			}
		}
		if (test == completion.length) {
			for (int i = 0 ; i < participant.length ; i++) {
				for (int j = 0 ; j < completion.length ; j++) {
					if (participant[i].equals(completion[j])) {
						count++;
					}
				}
				if (count > 0) {
					count = 0;
				} else if (count == 0) {
					answer = participant[i];
				}
			}
			// {a, b, c, a}
			// {a, b, c, a}
		} else if (test > completion.length) {
			for (int i = 0 ; i < completion.length ; i++) {
				for (int j = 0 ; j < participant.length ; j++) {
					if (completion[i].equals(participant[j])) {
						count++;
					}
				}
				if (count == 1) {
					count = 0;
				} else if (count  > 1) {
					answer = participant[i];
				}
			}
		}
        return answer;
    }
	
	public static String solution2(String[] participant, String[] completion) {
		String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
	}
	
	public static String solution3(String[] participant, String[] completion) {
		 Arrays.sort(participant);
	        Arrays.sort(completion);
	        int i;
	        for ( i=0; i<completion.length; i++){

	            if (!participant[i].equals(completion[i])){
	                return participant[i];
	            }
	        }
	        return participant[i];
	}
	
}
