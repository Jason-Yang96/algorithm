package baekjoon.advanced1.studyword_1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputWord = br.readLine();
        br.close();

        int[] charCount = new int[26]; // Assuming only English alphabet characters are present

        int maxCount = 0;
        char mostFrequentChar = ' ';

        for (char c : inputWord.toCharArray()) {
            int index = Character.toUpperCase(c) - 'A';
            int newCount = ++charCount[index];

            if (newCount > maxCount) {
                mostFrequentChar = c;
                maxCount = newCount;
            } else if (newCount == maxCount) {
                mostFrequentChar = '?';
            }
        }

        System.out.println(mostFrequentChar);
    }
}
