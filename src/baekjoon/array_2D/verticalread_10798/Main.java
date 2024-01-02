package baekjoon.array_2D.verticalread_10798;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int rowCount = 5;
        int colCount = 15;

        String[][] matrix = new String[rowCount][colCount];

        for (int i = 0; i < rowCount; i++) {
            String[] lineStrArr = br.readLine().split("");
            for (int j = 0; j < colCount; j++) {
                if (j < lineStrArr.length) {
                    matrix[i][j] = lineStrArr[j];
                } else {
                    matrix[i][j] = "*";
                }
            }
        }
        for (int i = 0; i < colCount; i++) {
            for (int j = 0; j < rowCount; j++) {
                sb.append(matrix[j][i]);
            }
        }
        System.out.println(sb.toString().replace("*", ""));
    }
}
