package test_baekjoon.hci_16139;

/*
* 중지나 검지(두번째세번째손가락)
* 문자열 S와 문자열의 구간 l,r이 주어졌을 때 l번째부터 r번째까지 특정 문자 a가 몇번 나타나는지 프로그램 작성
* closed range 같은 문자열을 가지고 질문을 여러번 함. 같은 문자열이 나올 수도 있음
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String str = br.readLine();
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());

            char letter = st.nextToken().charAt(0);
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int countOfChar = 0;

            for (int j = start; j <= end; j++) {
                if (str.charAt(j) == letter) {
                    countOfChar++;
                }
            }
//            String substr = str.substring(start, end + 1);
//            char[] charArray = substr.toCharArray();
//            for (char c : charArray) {
//                if (c == letter) {
//                    countOfChar ++;
//                }
//            }
//                    (int) substr.chars().filter(c->c==letter).count();
            sb.append(countOfChar).append("\n");
        }
        System.out.println(sb);
    }
}
