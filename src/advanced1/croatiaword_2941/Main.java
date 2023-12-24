package advanced1.croatiaword_2941;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] croatianAlphabet = new String[]{
                "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="
        };
        String croatianWord = br.readLine();
        //logic
        int croatianAlphabetCount = 0;
        String replacedCroatianWord = croatianWord;
        for (String s : croatianAlphabet) {
            replacedCroatianWord = replacedCroatianWord.replace(s, ".");
        }
        //then(print)
        System.out.println(replacedCroatianWord.length());
    }
}
