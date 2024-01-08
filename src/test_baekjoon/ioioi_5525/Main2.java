package test_baekjoon.ioioi_5525;

import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int lengthOfStr = scanner.nextInt();
        String str = scanner.next();
        int lengthOfPn = 2 * n + 1;
        int count = 0;
        String pN = "IO".repeat(n) + "I";

        char[] strChars = str.toCharArray();
        char[] pNChars = pN.toCharArray();

        for (int i = 0; i < (lengthOfStr - lengthOfPn + 1); i++) {
            if (strChars[i] != 'O') {
                boolean match = true;
                for (int j = 0; j < lengthOfPn; j++) {
                    if (strChars[i + j] != pNChars[j]) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    count += 1;
                }
            }
        }
        scanner.close();
        System.out.println(count);
    }
}
