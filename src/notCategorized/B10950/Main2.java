package notCategorized.B10950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a; i++) {
            String[] arr = br.readLine().split(" ");
            int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
            sb.append(sum + "\n");
        }
        System.out.println(sb);
    }
}
