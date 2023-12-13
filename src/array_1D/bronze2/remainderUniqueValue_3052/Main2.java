package array_1D.bronze2.remainderUniqueValue_3052;

import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> intHS = new HashSet<>();
        for (int i = 0; i < 10; i++) intHS.add(Integer.parseInt(br.readLine())%42);
        System.out.println(intHS.size());
    }
}

/**
 * 자료 구조를 제대로 사용하면 코드가 아름다워진다.... 비유티풀
 */