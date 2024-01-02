package baekjoon.advanced1.studyword_1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputUppercaseWord = br.readLine().toUpperCase();
        char[] inputCharArray = inputUppercaseWord.toCharArray();
        Map<Character, Integer> charCountMap = new HashMap<>();
        //
        for (char c : inputCharArray) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1); //
        }

        List<Character> mostFrequentChars = new ArrayList<>();
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentChars.clear();
                mostFrequentChars.add(entry.getKey());
                maxCount = entry.getValue();
            } else if (entry.getValue() == maxCount) {
                mostFrequentChars.add(entry.getKey());
            }
        }
        br.close();
        System.out.println(mostFrequentChars.size() >= 2 ? "?" : mostFrequentChars.get(0));
    }
}


