package programmers.kit.dynamic_programming.expression_n;


import java.util.*;

public class Solution {
	public static void main(String[] args) {
		test(5, 12, 4);
		test(2, 11, 3);
		test(5, 31168, -1);
	}
	public static void test(int testN, int testNumber, int answer) {
        int testOutput = solution(testN, testNumber);
        System.out.printf("answer: %d | test output: %d%n", answer, testOutput);
        System.out.printf("test result: %b%n%n", answer == testOutput);
    }

	public static int solution(int N, int number){
		int answer = 0;

		
		return answer > 8? -1 : answer;
	}
}
/*
5 -> 12
[ |2, 3, 4, 5, 1|, |3, 4, 5, 6, 2|, |3, 4 ]
5 - > 1 = 5/5
5 - > 2 = (5 + 5)/5
5 - > 3 = (5 + 5 + 5)/5
5 - > 4 = (5 + 5 + 5 + 5)/5
5 - > 5 = 5
5 - > 6 = 5/5 + 5
5 - > 7 = (5 + 5)/5 + 5
5 - > 8 = (5 + 5 + 5)/5 + 5
5 - > 9 = (5 + 5 + 5 + 5)/5 + 5
5 - > 10 = 5 + 5
5 - > 11 = 55/5
5 - > 12 = (5 + 5)/5 + 5 + 5
*/