package notCategorized.B10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main2 {
    // 메모리가 개 박살 나버리네
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < num; i++) {
            int input = Integer.parseInt(st.nextToken());
            max = Math.max(max, input);
            min = Math.min(min, input);
        }
        // 어 왜 메소드 호출이 안되는 거지? static 안에서는 인스턴스 메서드 못사용하나?

        System.out.println(min + " " + max);

    }
}
