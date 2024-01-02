package baekjoon.array_1D.bronze5.assignmetCheck_5597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 28; i++) {
            sb.append(br.readLine()).append(" ");
        }
        String[] strArr = sb.toString().split(" ");
        int[] integerArr = Stream.of(strArr).mapToInt(Integer::parseInt).toArray();





        int[] presenceSheet = IntStream.rangeClosed(1, 30).toArray();
        int[] filteredArr = Arrays.stream(presenceSheet)
                .filter(value -> Arrays.stream(integerArr).noneMatch(value1 -> value1 == value))
                .toArray();

        System.out.println(filteredArr[0]);
        System.out.println(filteredArr[1]);

    }
}
//anyMatch(presenceValue -> presenceValue != value)