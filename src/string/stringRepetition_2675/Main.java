package string.stringRepetition_2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] lineArray = br.readLine().split(" ");
            int repetitionNum = Integer.parseInt(lineArray[0]);
            String repetitionObject = lineArray[1];
            char[] chars = repetitionObject.toCharArray();
            for (char s : chars) {
                for (int j = 0; j < repetitionNum; j++) {
                    sb.append(s);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
