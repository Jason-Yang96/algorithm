package test_baekjoon.hci_16139;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int count = Integer.parseInt(br.readLine());

        int[][] cumulativeFreq = new int[str.length()][26];

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 26; j++) {
                cumulativeFreq[i][j] = (i > 0) ? cumulativeFreq[i - 1][j] : 0;
            }
            if (i > 0) cumulativeFreq[i][str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < count; i++) {
            String[] query = br.readLine().split(" ");

            char letter = query[0].charAt(0);
            int start = Integer.parseInt(query[1]);
            int end = Integer.parseInt(query[2]);

            int countOfChar = getCumulativeFreq(cumulativeFreq, end, letter) - getCumulativeFreq(cumulativeFreq, start - 1, letter);

            sb.append(countOfChar).append("\n");
        }

        System.out.println(sb);
    }

    private static int getCumulativeFreq(int[][] cumulativeFreq, int index, char letter) {
        return index >= 0 ? cumulativeFreq[index][letter - 'a'] : 0;
    }
}

