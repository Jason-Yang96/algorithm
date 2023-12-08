package notCategorized.B10810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); //string tokenizer is initialized.
        int basketCount = Integer.parseInt(st.nextToken());
        int iterationCount = Integer.parseInt(st.nextToken());
        int[] intArr = new int[basketCount];
        for (int iter = 1; iter <= iterationCount; iter++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for (int index = i; index <= j; index++) { // for loop can start with int which is not 0 or 1
                intArr[index-1] = k; // How about writing down the test code?
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < basketCount; i++) {
            sb.append(intArr[i]).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
//IndexOutOfBoundsException
//    ArrayIndexOutOfBoundsException
}

