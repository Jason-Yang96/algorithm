package string.constant_2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstInt = Integer.parseInt(st.nextToken());
        int secondInt = Integer.parseInt(st.nextToken());
        int conversedFirstInt = converse(firstInt);
        int conversedSecondInt = converse(secondInt);
        System.out.println(Math.max(conversedFirstInt, conversedSecondInt));
    }

    private static int converse(int num) {
        String strNum = num + "";
        char[] charArray = strNum.toCharArray();
        char firstChar = charArray[0];
        charArray[0] = charArray[2];
        charArray[2] = firstChar;
        String conversedStrNum = new String(charArray);
        return Integer.parseInt(conversedStrNum);
    }
}
