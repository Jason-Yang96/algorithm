package B2480;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        // 반복되는 항목을 어떻게 뽑아내지? map으로 만든 다음에 각각의 개수?

        List<Integer> list = Arrays.asList(a, b, c);

        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
            return;
        } else if (a != b && b != c && a!= c) {
            System.out.println(100 * arr[2]);
            return;
        } else {
            System.out.println(1000 + 100 * arr[1]);
        }
    }
}

