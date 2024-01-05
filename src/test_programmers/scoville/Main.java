package test_programmers.scoville;

public class Main {
    public static void main(String[] args) {
        int[] scoville = new int[]{1, 2, 3, 9, 10, 12};
        int k = 7;
        int answer = Solution.solution(scoville, 7);

        System.out.println(answer);
    }
}
