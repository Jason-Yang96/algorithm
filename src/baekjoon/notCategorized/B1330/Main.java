package baekjoon.notCategorized.B1330;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        if (firstNum > secondNum) {
            System.out.println(">");
            return;
        }
        if (firstNum < secondNum) {
            System.out.println("<");
            return;
        }
        if (firstNum == secondNum) {
            System.out.println("==");
            return;
        }
    }
}
