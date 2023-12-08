package notCategorized.B2525;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int duration = sc.nextInt();

        int minSum = min + duration;
        int minSumToHour = minSum / 60;

        if (minSum < 60) {
            System.out.printf("%d %d", hour, minSum);
            return;
        }
        if (minSum >= 60 && (hour + minSumToHour) >= 24)  {
            System.out.printf("%d %d", hour + minSumToHour - 24, minSum % 60);
            return;
        }
        if (minSum >= 60 && (hour + minSumToHour) < 24) {
            System.out.printf("%d %d", hour + minSumToHour , minSum % 60);
        }
    }
}
