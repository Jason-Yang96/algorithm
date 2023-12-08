package notCategorized.B10871;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] strArr = br.readLine().split(" ");
        int n = Integer.parseInt(strArr[0]);
        int x = Integer.parseInt(strArr[1]);

        String[] strArr1 = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(strArr1[i]) < x) {
                sb.append(strArr1[i] + " ");
            } else {
                continue;
            }
        }
        System.out.println(sb);

    }
}
