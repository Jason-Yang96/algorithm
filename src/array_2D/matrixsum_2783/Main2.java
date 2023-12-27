package array_2D.matrixsum_2783;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb = new StringBuilder();

            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());

            int[][] matrix = new int[row][col];

            for (int i = 0; i < row; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < col; j++) {
                    matrix[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < row; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < col; j++) {
                    matrix[i][j] += Integer.parseInt(st.nextToken());
                    sb.append(matrix[i][j]).append(" ");
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}


