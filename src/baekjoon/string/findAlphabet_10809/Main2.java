package baekjoon.string.findAlphabet_10809;

import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        String word = reader.readLine();

        int N = 26;
        int[] array = new int[N];

        Arrays.fill(array, -1);

        for (int i = 0; i < N; i++) {
            array[i] = word.indexOf((char) i + 97);
            result.append(array[i]).append(" ");
        }

        System.out.println(result);
    }
}
