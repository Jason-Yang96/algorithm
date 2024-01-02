package baekjoon.array_1D.bronze5.assignmetCheck_5597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

/**
 * 배열을 배열답게 단순하게 바라보자
 * 마치 학생들에게 인덱스를 부여한 것처럼 문제를 바라본다.
 * 그리고 각자 지정된 자리에 앉히고 비어 있으면 그 친구의 숫자를 뽑아낼 수 있도록
 * 조건문을 통해 걸러낸다.
 *
 * 그냥 멋진 코드만이 그리고 화려한 것만이 좋은 결과와 좋은 성능을 내는 것이 아니구나
 * 문제를 단순하게 바라보고, 본질을 바라봐야지만 심플하지만 같은 결과를 가져올 수 있구나
 * 결국은 기본기가 탄탄해야 한다.
 */
public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] num = IntStream.rangeClosed(1, 30).toArray();

        for (int i = 0; i < 28; i++) {
            num[Integer.parseInt(br.readLine())-1] = 0;
        }
        for (int i = 1; i <= 30; i++) {
            if (num[i-1] != 0) {
                System.out.println(num[i-1]);
            }
        }
    }
}
