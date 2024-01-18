package programmers.kit.heap.더맵게;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] scoville = new int[]{1, 2, 3, 9, 10, 12};
        int k = 7;
        int returnValue = Solution.solution(scoville, k);
        int answer = 2;
        System.out.println(returnValue);
        System.out.println(returnValue == answer );
    }
    public static int solution(int[] scoville, int k) {
        int count = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i : scoville) {
            minHeap.offer(i);
        }
        // 모든 요소의 값이 k 이상이 될 때 까지 반복한다.
        // k 모든 요소가 k 이상이 된다는 것은 어떻게 확인하지?
        // 가장 맨 앞의 값이 k 보다 작은 경우만 실행하면 된다.
        // 합의 값의 경우는 맨 마지막에 확인해야 하는가?
        //
        int sum = 0;
        while (minHeap.peek() < k) {
            if (minHeap.size() == 1) {
                return -1;
            }
            int firstInt = minHeap.poll();
            int secondInt = minHeap.poll();
            minHeap.offer(firstInt + 2 * secondInt);
            count++;
        }

        return count;
    }
}
/*PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(5);
        minHeap.offer(2);
        minHeap.offer(8);
        minHeap.offer(1);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        maxHeap.offer(900);
        maxHeap.offer(800);
        maxHeap.offer(700);
        maxHeap.offer(600);


        System.out.println("min: " + minHeap.poll());
        System.out.println("min: " + minHeap.poll());
        System.out.println("min: " + minHeap.poll());
        System.out.println("min: " + minHeap.poll());
        System.out.println("-------------------------");
        System.out.println("max: " + maxHeap.poll());
        System.out.println("max: " + maxHeap.poll());
        System.out.println("max: " + maxHeap.poll());
        System.out.println("max: " + maxHeap.poll());*/
