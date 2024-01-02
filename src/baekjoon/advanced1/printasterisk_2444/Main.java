package baekjoon.advanced1.printasterisk_2444;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int count = sc.nextInt();
        for (int i = 0; i < 2 * count - 1; i++) {
            if (i < count) {
                sb.append(" ".repeat(count - (i + 1)))
                        .append("*".repeat(2 * i + 1))
                        .append(" ".repeat(count - (i + 1)))
                        .append("\n");
            } else {
                sb.append(" ".repeat(i - count + 1))
                        .append("*".repeat(2 * count - 1 - (2 * i - 2 * (count - 1))))
                        .append(" ".repeat(i - count + 1))
                        .append("\n");
            }
        }
        System.out.println(sb);
    }
}
// 1, 3, 5, 7, 9, 7, 5, 3, 1
/**
 * 1: sp * 4 + "*" * 1 + sp * 4
 * 2: sp * 3 + "*" * 3 + sp * 3
 * 3: sp * 2 + "*" * 5 + sp * 2
 * 4: sp * 1 + "*" * 7 + sp * 1
 *
 * 5: sp * 0 + "*" * 9 + sp * 0
 *
 * 6: sp * 1 + "*" * 7 + sp * 1
 * 7: sp * 2 + "*" * 5 + sp * 2
 * 8: sp * 3 + "*" * 3 + sp * 3
 * 9: sp * 4 + "*" * 1 + sp * 4
 */