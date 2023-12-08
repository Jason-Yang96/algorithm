package notCategorized.B10869;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int a = inputValue.nextInt();
        int b = inputValue.nextInt();

        System.out.println("더하기: " + (a + b));
        System.out.println("빼기: " + (a - b));
        System.out.println("곱하기: " + (a * b));
        System.out.println("몫: " + (a / b));
        System.out.println("나누기: " + (a % b));
    }
}
