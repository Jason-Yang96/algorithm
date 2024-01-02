package baekjoon.notCategorized.B25314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int repeatNum = a/4;
        System.out.println("long ".repeat(repeatNum) + "int");
    }
}
