package test_programmers.queueing;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        test(3, 5, new int[]{3, 1, 2});
        test(3, 5, new int[]{3, 1, 2});
    }

    public static void test(int testInputN, int testInputK, int[] answer) {
        int[] testOutput = solution(testInputN, testInputK);
        System.out.printf("answer: %s | test output: %s%n", Arrays.toString(answer), Arrays.toString(testOutput));
        System.out.printf("test result: %b%n%n", Arrays.equals(answer, testOutput));
    }

    public static int[] solution(int n, int k) {
        int[] answer = new int[n];
        List<Integer> unusedNum = new ArrayList<>();
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            unusedNum.add(i);
        }

        k--;

        for (int i = 0; i < n; i++) {
            factorial /= (n - i);
            int index = (int) (k / factorial);
            answer[i] = unusedNum.remove(index);
            k %= factorial;
        }
        return answer;
    }

    public static long createFactorialLong(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * createFactorialLong(n - 1);
        }
    }

    public static long createFactorialShort(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
