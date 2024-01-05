package test_programmers.scoville;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static int solution(int[] scoville, int k) {
        int count = 0;


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < scoville.length; i++) {
            list.add((Integer) scoville[i]);
        }

        Arrays.sort(scoville);
        int sum = Arrays.stream(scoville).map(i -> 2 * i).sum() - scoville[0];
        if (sum < k) {
            return -1;
        }
        Collections.sort(list);
        while (list.get(0) < k) {
            Integer subInt = list.get(0) + list.get(1) * 2;
            list = list.subList(2, list.size() - 1);
            list.add(subInt);
            Collections.sort(list);
            count += 1;
        }


        return count;
    }
}
