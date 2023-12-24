package string.constant_2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int i1 = Integer.parseInt(st.nextToken());
        int i2 = Integer.parseInt(st.nextToken());
        System.out.println(Math.max(converse(i1), converse(i2)));
    }

    private static int converse(int num) {
        String strNum = num + "";
        char[] charArr = strNum.toCharArray();
        char charF = charArr[0];
        charArr[0] = charArr[2];
        charArr[2] = charF;
        String conStr = new String(charArr);
        return Integer.parseInt(conStr);
    }
}
