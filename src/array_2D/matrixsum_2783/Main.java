package array_2D.matrixsum_2783;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        int[][] matrixA = new int[row][col];
        int[][] matrixB = new int[row][col];

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col; j++) {
                matrixA[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col; j++) {
                matrixB[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int elementSum = matrixA[i][j] + matrixB[i][j];
                sb.append(elementSum).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
