package string.findAlphabet_10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        //b는 몇번째 글자지? 두번째 글자. 배열의 두번째로 이동해서 string에서 b가 몇번째 이동했는지 확인. char에서 숫자를 빼면 가능함.

        int[] baseArray = new int[26];
        Arrays.fill(baseArray, -1);

        for (int i = 0; i < str.length(); i++) {
            int orderIndex = str.charAt(i) - '0' -49;
            baseArray[orderIndex] = str.indexOf(str.charAt(i));
        }
        for (int i : baseArray) {
            sb.append(i + " ");
        }
        System.out.println(sb);
    }
}
