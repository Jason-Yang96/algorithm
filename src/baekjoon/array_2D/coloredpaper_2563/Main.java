package baekjoon.array_2D.coloredpaper_2563;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count = Integer.parseInt(br.readLine());
        int[][] matrix = new int[100][100];

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());

            for (int j = row; j < row + 10; j++) {
                for (int k = col; k < col + 10; k++) {
                    matrix[j][k] = 1;
                }
            }
        }
        br.close();
        int area = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                area += matrix[i][j];
            }
        }
        System.out.println(area);
    }
}
/*
 * 색종이 100개 이하
 * 색종이 한변의 길이 10
 * 주어지는 위치 = 색종이 왼쪽 하단 좌표 => 다른 좌표 값 구할 수 있음
 * 영역 최대 크기 100 * 100
 * */