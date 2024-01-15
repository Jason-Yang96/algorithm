package test_baekjoon.ioioi_5525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int lengthOfStr = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int count = 0;
        int currentState = 0; // State variable for pattern matching

        for (int i = 1; i < lengthOfStr; i++) { // Start from 1 since pattern requires at least 2 characters
            // Check for 'IO' pattern
            if (str.charAt(i - 1) == 'I' && str.charAt(i) == 'O') {
                currentState++;
                if (currentState == n) { // Complete pattern match
                    count++;
                    currentState--; // Adjust for overlapping patterns
                }
                i++; // Skip checking the next 'I' as it's part of the 'IO' pair just processed
            } else {
                currentState = (str.charAt(i) == 'I') ? 1 : 0; // Reset or set to 1 if 'I' is found
            }
        }

        br.close();
        System.out.println(count);
    }
}

