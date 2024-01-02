package baekjoon.notCategorized.B15552;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            String[] lineArr = br.readLine().split(" ");
            sb.append(Integer.parseInt(lineArr[0]) + Integer.parseInt(lineArr[1])).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}
