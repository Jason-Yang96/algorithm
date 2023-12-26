package advanced1.studyword_1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputUppercaseWord = br.readLine().toUpperCase();
        char[] inputCharArray = inputUppercaseWord.toCharArray();
        Map<Character, Integer> charCountMap = new HashMap<>();

        char mostFrequentChar = ' ';
        int maxCount = 0;

        for (char c : inputCharArray) {
            int newCount = charCountMap.getOrDefault(c, 0) + 1;
            charCountMap.put(c, newCount);

            if (newCount > maxCount) {
                mostFrequentChar = c;
                maxCount = newCount;
            } else if (newCount == maxCount) {
                mostFrequentChar = '?';
            }
        }

        br.close();
        System.out.println(mostFrequentChar);
    }
}
