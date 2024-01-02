package baekjoon.advanced1.yourgrade_25206;

import java.io.*;
import java.util.StringTokenizer;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //전역 변수 설정
        double majorScore = 0;
        double totalMajorScore = 0;
        double sumOfGrade = 0;
        double scorelevel = 0;
        int numOfSubject = 20;

        for(int i = 0; i<numOfSubject; i++){
            st = new StringTokenizer(br.readLine());
            String subjectName = st.nextToken();

            String grade = st.nextToken();
            String level = st.nextToken();

            switch(level){
                case "A+" :
                    scorelevel = 4.5;
                    break;
                case "A0" :
                    scorelevel = 4.0;
                    break;
                case "B+" :
                    scorelevel = 3.5;
                    break;
                case "B0" :
                    scorelevel = 3.0;
                    break;
                case "C+" :
                    scorelevel = 2.5;
                    break;
                case "C0" :
                    scorelevel = 2.0;
                    break;
                case "D+" :
                    scorelevel = 1.5;
                    break;
                case "D0" :
                    scorelevel = 1.0;
                    break;
                case "F" :
                    scorelevel = 0.0;
                    break;
            }
            if(level.charAt(0) != 'P'){
                majorScore = (grade.charAt(0)-'0') * (scorelevel);
                totalMajorScore += majorScore;

                sumOfGrade += grade.charAt(0)-'0';
            }
        }
        br.close();
        double result = totalMajorScore/sumOfGrade;
        System.out.println("%.6f".formatted(result));

    }
}

