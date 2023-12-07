package B10810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;

public class Main {
// 메모리가 개 박살 나버리네
    public void getMaxAndMin (Integer[] nums) {

        int max = nums[0];
        int min = nums[0];
        for (int num : nums) { // for each 구문으로 이렇게 구현할 수도 있구나
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        System.out.println(min + " " + max);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        Integer[] intArr = new Integer[a];

        for (int i = 0; i < a; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        // 어 왜 메소드 호출이 안되는 거지? static 안에서는 인스턴스 메서드 못사용하나?

        Main instance = new Main();
        instance.getMaxAndMin(intArr);

    }
}
