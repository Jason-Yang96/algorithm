package baekjoon.notCategorized.B2439;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i = 1; i <=a; i++){
            System.out.println(" ".repeat(a-i) + "*".repeat(i));
        }
    }
}
