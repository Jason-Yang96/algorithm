package baekjoon.advanced1.chess_3003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] chessRequiredNumArray = new int[]{1,1,2,2,2,8};

        for (int i : chessRequiredNumArray) {
            int i1 = Integer.parseInt(st.nextToken());
            sb.append(i - i1).append(" ");
        }
        System.out.println(sb);
    }
}
