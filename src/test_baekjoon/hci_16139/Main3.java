package test_baekjoon.hci_16139;

import java.io.*;
import java.util.*;
public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder output = new StringBuilder();

        String  S = br.readLine();
        int N = Integer.parseInt(br.readLine());
        int[][] sumCount = new int[26][S.length() + 1];

        for (int i = 0; i < S.length(); i++) {
            int idx = asciiChange(S.charAt(i));
            sumCount[idx][i + 1]++;
        }

        for (int i = 1; i <= S.length(); i++) {
            for (int j = 0; j < 26; j++) {
                sumCount[j][i] = sumCount[j][i-1] +  sumCount[j][i] ;
            }
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            char targetChar = st.nextToken().charAt(0);
            int idx = asciiChange(targetChar);
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            output.append(sumCount[idx][end + 1] - sumCount[idx][start]).append("\n");
        }
        System.out.println(output);
    }
    private static int asciiChange(char c) {
        return c - 'a';
    }
}
