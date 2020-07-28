package programmers;

public class Run {
	
	public static void main (String[] args) {
		
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		new Clothes().solution(n, lost, reserve);
		
		
		
		
	}
	
}
/*
n		lost		reserve		return
5		[2, 4]		[1, 3, 5]		5       --> [1 - 2] [2 - 0] [3 - 2] [4 - 0] [5 - 2] 
5		[2, 4]		[3]				4       --> [1 - 1] [2 - 0] [3 - 2] [4 - 0] [5 - 1]
3		[3]			[1]				2       --> [1 - 2] [2 - 1] [3 - 1]

[key + value] ???
int[] clothes = {0, 0, 0, 0, 0};
for (int i = 0 ; i < clothes.length ; i++){
	if (reserve[j] == i)
	clothes[i] = 
}

1) reserve안에 lost가 들어간 경우

2) reserve안에 lost가 없는 경우 (reserve와 lost가 노 중복)


*/