package advanced1.palindromenumber_10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();
        Main.compareString(inputString);
        br.close();
    }

    public static void compareString(String string) {
        int strLength = string.length();
        boolean isPalindrome = true;
            for (int i = 0, j = strLength -1; i < strLength / 2; i++, j--) {
                if (string.charAt(i) == string.charAt(j)) {
                    continue;
                }
                isPalindrome = false;
                break;
            }
        System.out.println(isPalindrome? 1 : 0);
    }
}
