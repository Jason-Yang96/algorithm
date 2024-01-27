package test_baekjoon.meetingroom_1931;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] timeLine = new int[Integer.MAX_VALUE - 1];
        int maxMeetingCount = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            if (i == 0) {
                for (int j = start; j <= end; j++) {
                    timeLine[j] = i + 1;
                }
                maxMeetingCount++;
            } else {
                if (timeLine[start] == 0 && timeLine[end] == 0) {
                    for (int j = start; j < end; j++) {
                        timeLine[j] = i + 1;
                    }
                    maxMeetingCount++;
                }
            }
        }
        System.out.println(maxMeetingCount);
    }
}
