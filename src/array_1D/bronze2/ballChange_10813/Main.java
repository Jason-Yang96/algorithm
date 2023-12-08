package array_1D.bronze2.ballChange_10813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

import static java.util.EnumSet.range;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] basket = IntStream.rangeClosed(1, n).toArray(); // IntStream으로 배열 생성과 동시에 초기화.

        for (int round = 0; round < m; round++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            int first = basket[i - 1]; // 공바꾸기. 처음에 백업 필요.
            int last = basket[j - 1];
            basket[i-1] = last;
            basket[j-1] = first;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(basket[i]).append(" ");
        }
        System.out.println(sb);
    }
}
/**
 * 바구니 n개. 1부터 번호가 매겨짐. m 번 공을 바꿈. 공 바꿀 바구니 2개 선택. 공 교환
 * 첫째줄에 n과 m이 주어짐
 * 그 다음부터 몇번 바구니를 서로 바꿀 것인지 숫자가 주어짐
 */