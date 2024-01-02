package baekjoon.notCategorized.B2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();

        if (min >= 45) {
            System.out.printf("%d %d", hour, (min - 45) );
            return;
        }
        if (min < 45 && hour >= 1) {
            System.out.printf("%d %d", (hour - 1), (min + 15) );
            return;
        }
        if (min < 45 && hour == 0) {
            System.out.printf("%d %d", 23, (min + 15) );
            return;
        }
    }
}
