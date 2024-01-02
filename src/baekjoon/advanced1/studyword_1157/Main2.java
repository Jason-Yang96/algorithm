package baekjoon.advanced1.studyword_1157;

import java.io.*;

public class Main2{
    public static void main(String[] z) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] a = new int[123];
        int b = 0,c = 0, d = 0;

        while(true){
            b = System.in.read(); //바이트로 숫자를 읽는다
            if(b == 10){
                break;
            }
            a[b]++;
        }

        for(int i = 65; i < 91; i++){
            b = a[i]+a[i+32];
            if(b > c){
                c = b;
                d = i;
            }else if(b == c){
                d = 63;
            }
        }

        bw.write(String.valueOf((char)d));

        bw.flush();
        bw.close();
    }
}
