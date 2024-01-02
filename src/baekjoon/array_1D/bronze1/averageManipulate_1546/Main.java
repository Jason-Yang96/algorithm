package baekjoon.array_1D.bronze1.averageManipulate_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //한 줄 읽어오기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 다음 한 줄 읽어서 정수 배열에 넣기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = Integer.parseInt(st.nextToken());
        }
        // 정수 배열에서 가장 큰 값 찾은 후 그 값으로 점수 조작 -> 총합 구하기
        int max = Main.findMax(intArray);
        double manipulatedSum = 0;
        for (int i : intArray) {
            double manipulatedScore = (double) i /max * 100;
            manipulatedSum += manipulatedScore;
        }
        // 총합을 전체 개수로 나눠 평균 구하기
        System.out.println(manipulatedSum / n);

    }
    // 가장 큰 값 찾는 메서드
    public static int findMax(int[] intArr) {
        int max = Integer.MIN_VALUE;
        for (int i : intArr) {
            if(max < i) max = i;
        }
        return max;
    }
}
