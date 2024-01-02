package baekjoon.Printer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");
        int[] intArr = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        int area = Arrays.stream(intArr).sum() * 4 + 2 * a;

        for (int i = 1; i < a  ; i++) {
            if (intArr[i - 1] >= intArr[i]) {
                area -= intArr[i] * 2;
            } else {
                area -= intArr[i - 1] * 2;
            }
        }
        System.out.println(area);
    }
}
