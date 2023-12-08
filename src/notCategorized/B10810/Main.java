package notCategorized.B10810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int basketCount = Integer.parseInt(st.nextToken());
        int iterationCount = Integer.parseInt(st.nextToken());
        Map<Integer, Integer> ballInputHM = new HashMap<>();

        for (int i = 1; i <= basketCount; i++) {
            ballInputHM.put(i, 0);
        }
        for (int i = 1; i <= iterationCount; i++) {
            String[] strArrLine = br.readLine().split(" ");
            int start = Integer.parseInt(strArrLine[0]);
            int end = Integer.parseInt((strArrLine[1]));
            int inputInt = Integer.parseInt(strArrLine[2]);
            for (int j = start; j <= end; j++) {
                ballInputHM.put(j, inputInt);
            }
        }
        for (int value : ballInputHM.values()) {
            System.out.print(value + " ");
        }

    }
}
