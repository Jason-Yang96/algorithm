package programmers.kit.dfs_bfs.target_number;


import java.util.*;
class Solution {
    public static void main(String[] args) {
        test(new int[]{1,1,1,1,1}, 3, 5);
    }
    public static void test(int[] nums, int target, int answer) {
        Solution solution = new Solution();
        int testOutput = solution.solution(nums, target);
        System.out.printf("answer: %d | test output: %d%n", answer, testOutput);
        System.out.printf("test result: %b%n%n", answer == testOutput);
    }
    public int solution(int[] nums, int target) {
        int answer = 0;

        Map<Integer, Integer> targetCountHM = new HashMap<>();

        calculate(nums, 0, 0, targetCountHM);

        return answer;

    }

    private void calculate(int[] nums, int currentSum, int index, Map<Integer, Integer> HM) {
        if (index == nums.length) {
            HM.put(currentSum, HM.getOrDefault(currentSum, 0) + 1);
            return;
        }

        // Add the current number
        calculate(nums, currentSum + nums[index], index + 1, HM);

        // Subtract the current number
        calculate(nums, currentSum - nums[index], index + 1, HM);
    }
}
/*
{1,1,1,1,1}

currentsum = 
*/ 




/*
------해석
배열로 주어진 숫자만을 가지고 더하고 빼서 특정 수를 만들어 낸다. 
특정 수를 만들어 낼 수 있는 모든 경우의 수를 알아내야 한다. 
--주의 
타겟 숫자를 못만드는 경우도 있을 것. 
--규칙을 찾아낸다.  

+1+1+1+1+1 = 5
+1-1+1-1+1 = 1
+1+1+1+1-1 = 3
-1+1-1+1+1 = 1

=> {3: 1, 1:2, }

이렇게 하면 끝까지 가야 하니 터짐? 안터질지도...헣
배열의 길이가 20이다 => 전체 경우의 수 2^20 ~ 1,000,000

------논리
배열에 주어진 수를 가지고 덧셈, 뺄셈 연산을 실행해서 모든 값을 해시맵에 넣어준다. 
해시맵에 넣어줄 때, 이미 존재하는 키값을 넣을 때 그 키를 가져와서 카운트를 올려준 뒤에 덮어쓴다. 
연산이 마무리 되면, 해시맵에서 키값을 통해 카운트 값을 가져온다. 
------구현
1. hash map 만들기

2. 어떻게 모든 숫자들을 다 계산하는 경우의 수를 구하는가? 

가장 작은 값은 다 마이너스
- stream으로 만든 뒤에 filter 씌우고 맵에 넣음
가장 큰 값은 다 플러스 
- stream으로 만든 뒤에 다 더한 값을 그대로 해시맵에 넣음
- 재귀를 사용해서 값을 계속 넣어준다. 


3. 어떻게 해시맵에 다 넣어 주는가? 
- 

4. 해시맵에서 특정 키를 가진 값을 정답에 할당해주기

------테스트
------리뷰
*/

/*

public class Main {
    public static List<Integer> calculateValues(int[] nums) {
        List<Integer> results = new ArrayList<>();
        calculate(nums, 0, 0, results);
        return results;
    }

    private static void calculate(int[] nums, int index, int currentSum, List<Integer> results) {
        if (index == nums.length) {
            results.add(currentSum);
            return;
        }

        // Add the current number
        calculate(nums, index + 1, currentSum + nums[index], results);

        // Subtract the current number
        calculate(nums, index + 1, currentSum - nums[index], results);
    }
}
*/