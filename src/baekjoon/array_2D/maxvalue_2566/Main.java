package baekjoon.array_2D.maxvalue_2566;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st;
            StringBuilder sb = new StringBuilder();

            Integer[][] matrix = new Integer[9][9];

            int max = 0;
            int maxR = 0;
            int maxC = 0;

            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    int num = Integer.parseInt(st.nextToken());

                    matrix[i][j] = num;
                    if (num > max) {
                        max = num;
                        maxR = i;
                        maxC = j;
                    }
                }
            }
            sb.append(max).append("\n");
            sb.append(maxR + 1).append(" ").append(maxC + 1);

            System.out.println(sb);
        }
    }
}
