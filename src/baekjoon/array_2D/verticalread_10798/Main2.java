package baekjoon.array_2D.verticalread_10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int rowCount = 5;
        int colCount = 15;

        char[][] matrix = new char[rowCount][colCount];

        for (int i = 0; i < rowCount; i++) {
            char[] lineChars = br.readLine().toCharArray();
            for (int j = 0; j < colCount; j++) {
                matrix[i][j] = (j < lineChars.length) ? lineChars[j] : '*';
            }
        }

        for (int i = 0; i < colCount; i++) {
            for (int j = 0; j < rowCount; j++) {
                if (matrix[j][i] != '*') {
                    sb.append(matrix[j][i]);
                }
            }
        }

        System.out.println(sb.toString());
    }
}
