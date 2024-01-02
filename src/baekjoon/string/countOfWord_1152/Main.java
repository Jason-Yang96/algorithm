package baekjoon.string.countOfWord_1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 아예 인지하지 못한 문제. 공백이 들어간다면 1개의 단어로 인식된다.
// 개행 문자도  1개의 단어로 인식된다.
// 이걸 인식해주는 방법이 필요하다.
// 결국 걸러내야 한다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(st.nextToken());


//        String[] strArray = br.readLine()
//                .split(" ");
//        if (strArray[0].charAt(0) == ' ') {
//            System.out.println(0);
//            return;
//        } else if (strArray[0].charAt(0) == '\n') {
//            System.out.println(0);
//            return;
//        }
//        System.out.println(strArray.length);
    }
}
