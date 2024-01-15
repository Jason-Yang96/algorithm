package test_baekjoon.ioioi_5525;

import java.io.*;
import java.util.ArrayList;

public class Main4 {

    public static void main2(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        char[] strCharArr = br.readLine().toCharArray();

        int ioiCount = 0;
        int answer = 0;

        for (int i = 1; i < M - 1; i++) {
            if (strCharArr[i - 1] == 'I' && strCharArr[i] == 'O' && strCharArr[i + 1] == 'I') {
                ioiCount++;
                if (ioiCount == N) {
                    ioiCount--;
                    answer++;
                }
                i++;
            } else {
                ioiCount = 0;
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception{
        var oCount = 1; // IOI
        var target = "IOIOI";
        System.out.println(solve(1, target) == 2);
    }

    public static int solve(int oCount, String target){
        ArrayList<Integer> oCounts = new ArrayList<Integer>();
        var current = "";
        char[] charArray = target.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (current.length() == 0) {
                if (charArray[i] == 'I'){
                    current += charArray[i];
                }
            } else if (current.charAt(current.length()-1) != charArray[i]) {
                current += charArray[i];
            } else
            {
                var currentOCount = (current.length() - 1)/2;
                if (currentOCount > 0) {
                    oCounts.add(currentOCount);
                }
                if (charArray[i] == 'I'){
                    current = "I";
                } else {
                    current = "";
                }
            }
        }
        var currentOCount = (current.length() - 1)/2;
        if (currentOCount > 0) {
            oCounts.add(currentOCount);
        }

        var sum = 0;
        for (Integer i : oCounts) {
            var addend = i - oCount + 1;
            if (addend > 0){
                sum += addend;
            }
        }

        return sum;
    }
}
/*
 * 결국은 IOI가 반복되는 꼴이다.
 * 이전 값과 현재 인덱스 위치의 값 그리고 다음 값의 모양이 IOI가 되어야 한다.
 *
 * */