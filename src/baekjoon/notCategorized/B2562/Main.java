package baekjoon.notCategorized.B2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rep = 9;
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < rep; i++) {
            int input = Integer.parseInt(br.readLine());
            if (max < input) {
                max = input;
                index = i;
            } else continue;
        }
        System.out.printf("%d%n%d", max, (index+1));

    }
}
