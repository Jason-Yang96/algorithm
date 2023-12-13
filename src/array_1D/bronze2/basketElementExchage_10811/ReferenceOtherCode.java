package array_1D.bronze2.basketElementExchage_10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class ReferenceOtherCode {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken()), num2 = Integer.parseInt(st.nextToken());

        int[] arr = new int[num1+1]; // 왜 하나 더 크게 만드는 거지?

        // 기본 셋팅
        for(int i=1; i<=num1; i++) { // 0번째에는 숫자를 넣지 않고 있음
            arr[i] = i;
        }

        while(num2 > 0) {

            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int tempNum;

            // 같으면 변동 없으므로 제외
            if(start != end) {
                for(int i=start; i<=end; i++) {
                    tempNum = arr[i];
                    arr[i] = arr[end];
                    arr[end] = tempNum;

                    end--;
                }
            }

            num2--;
        }
//하 로직을 모르겠단 말이지. 거참.
        for(int i=1; i<arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}