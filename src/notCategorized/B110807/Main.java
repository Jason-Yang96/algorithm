package notCategorized.B110807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] intArrString = br.readLine().split(" ");
        List<Integer> intArr = new ArrayList<>();

        //

        for (String num : intArrString) {
            intArr.add(Integer.parseInt(num));
        }
        int b = Integer.parseInt(br.readLine());

        int count = Collections.frequency(intArr, b);
        System.out.println(count);
    }
}
