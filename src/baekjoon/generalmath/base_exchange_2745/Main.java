package baekjoon.generalmath.base_exchange_2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int base = Integer.parseInt(st.nextToken());

        int length = str.length();
        int decimal = 0;

        for (int i = 0  ; i < length; i++) {
            decimal += transformEachCharToDecimal(str.charAt(i), length - 1 - i, base);
        }
        br.close();
        System.out.println(decimal);
    }

/*
* 만약에 각 자리가 숫자로 주어지면, 이걸 처리를 해줘야 한다.
* 현재 아래 메서드의 경우 문자로 주어지는 경우만 처리하고 있다.
* 순서는 맨 오른쪽에서 먼저. 근데 내가 했던 것은 맨 왼쪽에서 먼저 시작되도록 코드를 짬.
*
* */
    public static int transformEachCharToDecimal(char chr, int index, int base) {
        int transformedDigit = (chr < 'A')? chr - '0' : chr - 55;
        double digitMultiply = Math.pow((double) base, (double) index);
        return (int) (transformedDigit * digitMultiply);
    }
}
