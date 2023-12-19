package string.intsum_11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArry = br.readLine().split("");
        int sum = 0;
        for (String s : strArry) {
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
