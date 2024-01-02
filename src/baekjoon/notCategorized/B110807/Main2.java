package baekjoon.notCategorized.B110807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String[] arr = br.readLine().split(" ");
        List<String> strList = Arrays.asList(arr);

        String b = br.readLine();

        int count = Collections.frequency(strList, b);

        System.out.println(count);
    }
}
