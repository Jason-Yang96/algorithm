package array_1D.bronze2.basketSubsetArrayReversed_10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

/**
 * psvm
 * 문자 배열이 들어온다는 말인가 좀 신기하네.
 * 메인 메서드. 실행이된다는 말.
 *
 * 1차 시도 결과
 * 문제를 잘못 이해함. 각 인덱스에 있는 숫자끼리 바꾼다고 이해함.
 * 하지만 첫 인덱스와 두번째 인덱스 구간에 있는 숫자의 순서를 역순으로 바꾸는 로직임.
 *
 */
public class WrongProblemDefinition {
    public static void exChangeElement(int[] intArr, int replacedIndex, int replacingIndex) {
        int replacedValue = intArr[replacedIndex - 1 ];
        intArr[replacedIndex - 1] = intArr[replacingIndex - 1];
        intArr[replacingIndex - 1] = replacedValue;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt((st.nextToken()));
        int[] intArr = IntStream.rangeClosed(1, n).toArray();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int replacedIndex = Integer.parseInt(st.nextToken()), replacingIndex = Integer.parseInt(st.nextToken());
            WrongProblemDefinition.exChangeElement(intArr, replacedIndex, replacingIndex);
        }
        for (int i : intArr) {
            System.out.print(i + " ");
        }
    }
}
