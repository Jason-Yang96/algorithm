package notCategorized.B10952;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String[] lineArr = br.readLine().split(" ");
            int b = Integer.parseInt(lineArr[0]);
            int c = Integer.parseInt(lineArr[1]);
            if (b + c == 0) {
                break;
            }
            sb.append(b + c).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}
