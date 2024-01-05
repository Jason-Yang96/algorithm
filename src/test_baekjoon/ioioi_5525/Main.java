package test_baekjoon.ioioi_5525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // n의 값
        int lengthOfStr = Integer.parseInt(br.readLine()); // 문자열의 길이
        String str = br.readLine();
        int lengthOfPn = 2 * n + 1; // Pn의 길이
        int count = 0;
        String pN = "IO".repeat(n) + "I";

        for (int i = 0; i < (lengthOfStr - lengthOfPn + 1); i++) {
            if (str.charAt(i) != 'O') {
                String subStr = str.substring(i, i + lengthOfPn); // 여기서 시간이 많이 걸린다.
                if (subStr.equals(pN)) { // 비교는 해야지...
                    count += 1;
                }
            }
        }
        br.close();
        System.out.println(count);
    }
}


