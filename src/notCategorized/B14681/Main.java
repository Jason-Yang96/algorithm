package notCategorized.B14681;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x * y < 0 && x < 0) {
            System.out.println(2);
            return;
        }
        if (x * y < 0 && x > 0) {
            System.out.println(4);
            return;
        }
        if (x * y > 0 && x > 0) {
            System.out.println(1);
            return;

        }
        if (x * y > 0 && x < 0) {
            System.out.println(3);
            return;
        }
    }
}