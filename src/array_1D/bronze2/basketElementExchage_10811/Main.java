package array_1D.bronze2.basketElementExchage_10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

/*
 * 처음 문제를 풀 때 문제 정의를 잘못했다.
 * 주어진 두 인덱스에 위치한 숫자를 바꿀 생각을 했다.
 * 하지만 문제를 다시 읽어보면, 주어진 두 인덱스 구간에 위치한 숫자의 순서를 뒤바꿔야 한다
 * 배열의 순서를 뒤집는 메서드는 없는 듯 하다. 그렇다면 하드코딩을 해야 하는데, 굳이 그렇게 해야 할까.
 * */
public class Main {
    private Main main = new Main();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt((st.nextToken()));
        List<Integer> integerList = IntStream.rangeClosed(1, n).boxed().collect(toList());
// what is immutablelist?
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
            Collections.reverse(integerList.subList(start - 1, end));
        }
        for (int i : integerList) {
            System.out.print(i + " ");
        }
    }
}


