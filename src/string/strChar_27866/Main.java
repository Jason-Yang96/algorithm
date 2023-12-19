package string.strChar_27866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        int int1 = Integer.parseInt(br.readLine());

        System.out.println(str1.charAt(int1 - 1));

    }
}
