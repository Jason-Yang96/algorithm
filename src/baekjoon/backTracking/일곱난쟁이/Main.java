package baekjoon.backTracking.일곱난쟁이;

import java.util.Scanner;

public class Main {
    static final int wholeN = 9;
    static final int realN = 7;

    public static void main(String[] args) {
        int[] wholeArr = new int[wholeN];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < wholeN; i++) {
            wholeArr[i] = Integer.parseInt(sc.next());
        }

        combine(wholeArr, new int[realN], 0, 0);
    }

    static int[] combine(int[] arr, int[] data, int start, int index) {
        if (index == realN) {
            int sumOfArr = sum(arr, data);
            if (sumOfArr == 100) {
               return data;
            }
        }

        for (int i = start; i < wholeN && wholeN - i >= realN - index; i++) {
            data[index] = i;
            combine(arr, data, i + 1, index + 1);
        }
        return data;
    }

    static int sum(int[] arr, int[] indices) {
        int sum = 0;
        for (int i = 0; i < realN; i++) {
            sum += arr[indices[i]];
        }
        return sum;
    }
}
