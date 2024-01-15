package programmers.kit.stack_queue.같은숫자는싫어;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(Solution.solution(arr)));
    }
    public static int[] solution(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        int before = -1;
        for (int i : arr) {
            if(i != before) queue.add(i);
            before = i;
        }
        int[] nonRepeatedNumArr = new int[queue.size()];
        int queueSize = queue.size();
        for (int i = 0; i < queueSize; i++) nonRepeatedNumArr[i] = queue.poll();
        return nonRepeatedNumArr;
    }
}
/*
* 연속된 숫자는 하나만 남기고 나머지는 전부 제거
*
* */