package programmers.kit.dynamic_programming.expression_n;


import java.util.*;

public class Solution {
	public static void main(String[] args) {
		test(5, 12, 4);
		test(2, 11, 3);
		test(5, 31168, -1);
	}
	public static void test(int testN, int testNumber, int answer) {
		Solution solution = new Solution();
		int testOutput = solution.solution(testN, testNumber);
        System.out.printf("answer: %d | test output: %d%n", answer, testOutput);
        System.out.printf("test result: %b%n%n", answer == testOutput);
    }

    // 각 집합 요소의 사칙연산 조합
	public void unionSet(Set<Integer> union, Set<Integer> a, Set<Integer> b){
		for (int n1 : a) {
		 	for (int n2 : b ) {
		 		union.add(n1 + n2);
		 		union.add(n1 - n2);
		 		union.add(n1 * n2);
		 		if (n2 != 0) union.add(n1 / n2);
		 	}
		 } 
	}

	public int solution(int N, int number){
		List<Set<Integer>> setList = new ArrayList<>();

		for (int i = 0; i < 9; i++ ) {
			setList.add(new HashSet<>());
		}
		setList.get(1).add(N);
		if (number == N) return 1;
		for (int i = 2; i < 9; i++) {
			for (int j = 1; j <= i/2; j++) {
				unionSet(setList.get(i), setList.get(i - j), setList.get(j));
				unionSet(setList.get(i), setList.get(j), setList.get(i-j));
			}
			String n = Integer.toString(N);
			setList.get(i).add(Integer.parseInt(n.repeat(i)));
			for ( int num : setList.get(i)) {
				if (num == number) return i;
			}
		}
		return -1;
	}
}

/* 두 번째 해석(다른 이의 풀이를 참고)
n = 5, k = 12


0. 5가 0번 사용 될 때, 만들어 낼 수 있는 값의 집합
-> 아무것도 없음
1. 5가 1번 사용 될 때, 만들어 낼 수 있는 값의 집합
-> 5밖에 표현 못함
2. 5가 2번 사용 될 때, 만들어 낼 수 있는 값의 집합

5+5, 5-5, 5/5, 5*5, 55 => set(0, 1, 10, 25, 55)

3. 5가 1번 사용 될 때, 만들어 낼 수 있는 값의 집합
1 + 2, 2 + 1
5 + (5+5), 5 + (5-5), 5 + (5*5), 5 + (5/5), 555 => set(5, 6, 15, 30, 555)



(5+5)/5, (5-5)/5, (5*5)/5, (5/5)/5, 55/5  => set(0, 2, 5)
 

4. 5가 4번 사용 될 때, 만들어 낼 수 있는 값의 집합
5. 5가 1번 사용 될 때, 만들어 낼 수 있는 값의 집합
6. 5가 1번 사용 될 때, 만들어 낼 수 있는 값의 집합
7. 5가 1번 사용 될 때, 만들어 낼 수 있는 값의 집합
8. 5가 1번 사용 될 때, 만들어 낼 수 있는 값의 집합


_________________해석
_________________논리
_________________구현
_________________테스트
*/



/* 첫 번째 해석
피보나치 수열 사용할 때의 f(x)
f(1) = 1
f(2) = 2
f(3) = 3 = f(1) + f(2)
f(4) = 5 = f(2) + f(3)

n = 5, k = 12

memoizationArray = [ |2, 3, 4, 5, 1|, |3, 4, 5, 6, 2|, |3, 4 ]

f(k) = k를 5로 표현했을 때, 사용된 5의 개수

f(0) = 0

f(1) = 2 = f(0) + 2 ---- 5 / 5
f(2) = 3 = f(0) + 3 ---- ( 5 + 5 ) / 5
f(3) = 4 = f(0) + 4 ---- ( 5 + 5 + 5 ) / 5 = 5 - ( 5 + 5)/5
f(4) = 3 = f(0) + 5 ---- 5 - 5 / 5 
f(5) = 1 = f(0) + 1 ---- 5

f(6) = 3 = f(5) + f(1)  ----  5 / 5 + 5
f(7) = 4 = f(5) + f(2)  ---- ( 5 + 5 ) / 5 + 5
f(8) = 5 = f(5) + f(3)  ---- ( 5 + 5 + 5 ) / 5 + 5 = 5 + 5 - ( 5 + 5 ) / 5
f(9) = 4 = f(10) + f(1)  ---- 5 + 5 - 5/5
f(10)= 2 = f(5) + f(5)  ---- 5 + 5

f(11)= 3 = f(11) ---- 55/5
f(12)= 4 = f(12) ---- (55+5)/5
f(13)= 5 = f(13) ---- (55+5+5)/5
f(14)= 5 = f(14) ---- (55+5+5+5)/5
f(15)= 3 = f(5) + f(5) + f(5) --- 5+5+5

f(16)= 5 = f(15) + f(1) = 5 + 5 + 5 + 5 / 5
f(17)= 6 = f(15) + f(2) = 5 + 5 + 5 + ( 5 + 5 ) / 5
f(18)= 7 = f(15) + f(3) = 5 + 5 + 5 + ( 5 + 5 + 5 ) / 5
f(19)= 8 = f(15) + f(4) = 5 + 5 + 5 + ( 5 + 5 + 5 + 5 ) / 5
f(20)= 4 = 

f(19) = 6 =  5 + 5 + 5 + 5 - 5/5

7 = (5 + 5)/5 + 5
8 = (5 + 5 + 5)/5 + 5
9 = (5 + 5 + 5 + 5)/5 + 5
10 = 5 + 5
11 = 55/5
12 = (5 + 5)/5 + 5 + 5
*/