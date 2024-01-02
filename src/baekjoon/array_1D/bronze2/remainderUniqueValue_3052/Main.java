package baekjoon.array_1D.bronze2.remainderUniqueValue_3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] intArr = new int[10];
        for (int i = 0; i < 10; i++) {
            intArr[i] = Integer.parseInt(br.readLine());
        }

        long a = Arrays.stream(intArr)
                .map(i -> i % 42)
                .distinct()
                .count();
        System.out.println(a);

    }
}
