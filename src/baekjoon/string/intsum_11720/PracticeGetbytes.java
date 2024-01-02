package baekjoon.string.intsum_11720;

public class PracticeGetbytes {
    public static void main(String[] args) {
        String str = "1234565";
        System.out.println("getbytes = " + str.getBytes().getClass());
        for (byte i : str.getBytes()) {
            System.out.println("i = " + (i - '0') );
        }
        for (byte i : str.getBytes()) {
            System.out.println("i = " +  i );
        }
    }
}
