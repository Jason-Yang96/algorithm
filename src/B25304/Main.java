package B25304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalCost = Integer.parseInt(br.readLine());
        int productTypeNum = Integer.parseInt(br.readLine());

        int totalCompareCost = 0;

        for (int i = 0; i < productTypeNum; i++) {
            String[] arr = br.readLine().split(" ");
            totalCompareCost += Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);
        }

        if (totalCost == totalCompareCost) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
