package programmers.kit.sort.k번째수;
import java.util.*;

public class Solution {
	public static void main(String[] args){
        System.out.println("Test Case 1");
        int[] case1 = new int[]{1, 5, 2, 6, 3, 7, 4};
		int[][] case1Commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

		//깊은 비교 필요
		int[] answer = new int[]{5, 6, 3};
        int[] returnArr = Solution.solution(case1, case1Commands);

        System.out.println("answer: " + Arrays.toString(answer));
        System.out.println("return value: " + Arrays.toString(returnArr));
        System.out.println("result of comparison: " + Arrays.equals(answer, returnArr));
	}
	public static int[] solution(int[] array, int[][] commands) {
		//commands의 길이 만큼 배열 만들어서 초기화
        int commandsLength = commands.length;
        int[] answer = new int[commandsLength];

        // i, j, k를 뽑아 냈다고 생각하자
        // 일반화 해보자.
		for(int n = 0; n < commandsLength; n++){
			int i = commands[n][0];
			int j = commands[n][1];
			int k = commands[n][2];
			int subIntArrLength = j - i + 1;
			int[] subIntArr = new int[subIntArrLength];
			
			for(int m = 0; m < subIntArrLength; m++){
				subIntArr[m] = array[i - 1];  // i - 1 부터 j - 1 까지 커져야 한다. 
				i++;
			}
    		Arrays.sort(subIntArr);
    		answer[n] = subIntArr[k-1];
		}
        return answer;
    }
    public static int[] solution2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
//정렬해야 함. 무슨 정렬 방법을 써야 하는지 아직 잘 모르겠다. 그냥 일단 내가 만들어 본다.
//오름차순 정렬하면 됨. 어디서부터 어디까지 정렬된지 모르는 상태. 맨 앞부터
// public static int[] sortArr(int[] subIntArr){
// }
/*
자르고, 정렬하고, 숫자 도출하고
명령 배열이 2차원으로 주어진다. 각각의 명령에 대한 값을 배열에 담아 출력하라.

유의점
인덱스할 때 순서 유의
배열 자체가 바뀌지 않아야 한다.

근데 빈 배열을 저렇게 줄 수도 있나?

substring하면 분명 효율성 문제가 발생할 거..
결국 새 배열을 만들어야 하나? 새 배열을 인덱스 길이에 맞춰서 만든 후에 하나씩 넣어줘야 하려나. 
정렬은? 정렬은 어떻게 할거야. 

일단 solution 안에 전부 만들어 보자
한 케이스만 해결해보고 확장하자.
*/