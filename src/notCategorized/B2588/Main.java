package notCategorized.B2588;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstNumStr = sc.nextLine();
        String secondNumStr = sc.nextLine();

        int firstNumInt = Integer.parseInt(firstNumStr);
        int secondNumInt = Integer.parseInt(secondNumStr);
        String secondNumFirstDigit = secondNumStr.substring(2,3);
        String secondNumSecondDigit = secondNumStr.substring(1,2);
        String secondNumThirdDigit = secondNumStr.substring(0,1);

        System.out.println(firstNumInt * Integer.parseInt(secondNumFirstDigit));
        System.out.println(firstNumInt * Integer.parseInt(secondNumSecondDigit));
        System.out.println(firstNumInt * Integer.parseInt(secondNumThirdDigit));
        System.out.println(firstNumInt * secondNumInt);
    }
}
// 분명 더 간단하게 짤 수 있는 방법이 있다. 직관적인 방법. 그 방법이 있다고 생각하자.