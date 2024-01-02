package baekjoon.array_2D.verticalread_10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int r = 5, c = 15;
        char[][] m = new char[r][c];
        for (int i = 0; i < r; i++) {
            char[] l = br.readLine().toCharArray();
            for (int j = 0; j < c; j++) m[i][j] = (j < l.length) ? l[j] : '*';

        }
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                if (m[j][i] != '*') sb.append(m[j][i]);
            }
        }
        System.out.println(sb.toString());
    }
}
