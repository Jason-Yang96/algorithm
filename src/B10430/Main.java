package B10430;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int firstLine = (a+b)%c;
        int secondLine = ((a%c) + (b%c))%c;
        int thirdLine = (a*b)%c ;
        int fourthLine = ((a%c) * (b%c))%c;

        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(thirdLine);
        System.out.println(fourthLine);
    }
}