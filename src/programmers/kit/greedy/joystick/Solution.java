package programmers.kit.greedy.joystick;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        test("JAN", 23);
        test("JAZ", 11);
        test("JEROEN", 56);
    }

    public static void test(String testInput, int answer) {
        int testOutput = solution(testInput);
        System.out.printf("answer: %d | test output: %d%n", answer, testOutput);
        System.out.printf("test result: %b%n%n", answer == testOutput);
    }

    public static int solution(String name) {
        int answer = 0;
        int length = name.length();
        int move = name.length() - 1;
        for (int i = 0; i < length; i++) {
            answer += Math.min(name.charAt(i) - 'A', 26 - (name.charAt(i) - 'A'));
        }
        int endA;
        for (int i = 0; i < length; i++) {
            endA = i + 1;
            while (endA < length && name.charAt(endA) == 'A') endA++;
            move = Math.min(move, 2 * i + length-endA);
            move = Math.min(move,  2 *(length-endA) + i);

        }
        answer += move;
        return answer;
    }

    public static int solution_correct_but_not_good(String name) {
        int answer = 0;
        int[] diff = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (char c : name.toCharArray())
            answer += diff[c - 'A'];

        int length = name.length();
        int min = length - 1;

        for (int i = 0; i < length; i++) {
            int next = i + 1;
            while (next < length && name.charAt(next) == 'A') {
                next++;
            }
            int aaa = length - next; //
            min = Math.min(min, i + aaa + Math.min(i, aaa)); // XYZAAAZ     |    XAAAZYX
        }

        return answer + min;
    }

    public static int solution_wrong(String name) {
        int answer = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) - 'A' > 13) {
                answer += 'Z' - name.charAt(i) + 1;
            } else {
                answer += name.charAt(i) - 'A';
            }
        }

        int minMove = name.length() - 1;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != 'A') {
                int next = i + 1;
                while (next < name.length() && name.charAt(next) == 'A') next++;
                int move = 2 * i + name.length() - next;
                // JAAAAJJJJJJJ => 공식.
                minMove = Math.min(move, minMove);
            }
        }
        return answer + minMove;
    }

    public static int solution_dirty(String name) {
        int answer = 0;
        int nameLength = name.length();
        char[] nameCharArr = name.toCharArray();
        char[] baseCharArr = "A".repeat(nameLength).toCharArray();
        int[] hasA = new int[nameLength];
        for (int i = 0; i < nameLength; i++) {
            hasA[i] = nameCharArr[i] == 'A' ? 0 : 1;
        }

        int uD = 0;
        int r = 0;
        int l = 0;
        // 오른쪽
        for (int i = 0; i < nameLength; i++) {
            int asciiGap = nameCharArr[i] - baseCharArr[i];
            int sum = Arrays.stream(Arrays.copyOfRange(hasA, i + 1, nameLength - 1)).sum();
            if (sum == 0) {
                break;
            } else {
                r++;
            }
            if (asciiGap >= 13) {
                uD += 26 - asciiGap;
            } else {
                uD += asciiGap;
            }
        }
        // 왼쪽 JAAAANAAA  JAAANAAAA
        for (int i = 0; i < nameLength - 2; i++) {
            int sum = Arrays.stream(Arrays.copyOfRange(hasA, i + 1, nameLength - 1)).sum();
            if (sum == 0) {
                break;
            } else {
                r++;
            }
        }
        answer = uD + r;
        return answer;
    }
}
/*

AAAAAAAAAAAAAAAA
JAAAAANAAAANAAAJ

이것의 최소 횟수를 구해라.


### 상황 분석
조이스틱으로 알파벳 이름을 완성해야 한다?
처음엔 A로만 주어진다?
ABCDEFGHIJKLMNOPQRSTUVWXYZ...ABCD
Z 다음은 A
A 이전은 Z
|AAAAA
수정할 문자의 커서는 그 문자의 왼쪽에 위치한다고 가정(insert 키가 눌러진 상)
현 상황에서 커서를 왼쪽으로 움직이면
AAAA|A 로 바뀌게 된다.

입력값
원하는 이름이 주어짐
출력값
AAA...에서 원하는 이름을 만들기 위한 조이스틱 움직임 최솟값 도출


### 현재 생각나는 것
아스키 코드로 접근
앞에서부터 차례대로 값을 바꿔 나간다.
A를 기준으로 양의 방향으로 알파벳을 움직여야 가까운지
음의 방향으로 알파벳을 움직x야 가까운지 확인해야

조이스틱 움직임은 좌우 움직이는 것도 포함해야 한다.


### 테스트 코드 돌린 뒤에 고민해주어야 할 것
좌우 움직임의 최적화도 해주어야 하나? 무조건 앞에서 부터만 움직여야 하나?

### 코드 추상화 전 구체적 사례를 통한 구현 수도
입력값: JAN

입력값 길이에 맞도록 A로 구성된 chararray 생성
입력값을 chararray로 만듦

위 아래 움직임 값, 좌우 움직임 값 초기화

N이 중간값이라고 생각해야 함.


반복문 돌림(입력값의 길이 만큼 움직임)

A에서 J 까지의 최단 거리 구하기
왼쪽으로 움질일까? 오른쪽으로 움직일까?
-> 이 기준은 어떻게 잡아야 하지?
J(74)에서 A(65)를 뺐을 때, A에서 J를 뺐을 때 절댓값을 가지고 비교하는 건 어때?
근데 이건 위 아래 얼마나 움직여야 하는지를 나타냄.


BCDEFGHIJKLMNOPQRSTUVWXYZ|A|BCDEFGHIJKLMNOPQRSTUVWXYZ


ABCDEFGHIJKLM
NOPQRSTUVWXYZ

각각의 배열에서 현 인덱스의 값을 가져와서 뺐을 때
그 값이 13이면, 와로 움직이든, 우로 움직이든 움직여야 하는 거리는 같음
하지만 그 값이 13보다 크다면? 왼쪽으로 움직여야 하고

그 값이 13보다 작다면? 오른쪽으로 움직여야 한다.
- 그냥 뺀 그 값을 사용하면 됨.

만약 S라고 했으면? 아스키 빼면 오른쪽으로 18번 움직여야 한다.
하지만 왼쪽으로 움직인다면? 8번 움지직이면 된다.

분기점: 13 >= 아스키 뺀 값? 26 - 아스키 뺀값 : 아스키 뺀값.


### 창호님의 해석
관점의 차이. 결국 특정 문자열을 만들기 위해서 움직여야 하는 값을 고민하는 것은
특정 문자열에서 기본 문자열로 변하는 것과 비슷한 메커니즘이다. 움직임의 최소값은 동일하다.

*/

