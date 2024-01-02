package baekjoon.advanced1.yourgrade_25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// TODO 해시맵 사용하지 않고 gradeArray 사용하기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int subjectCount = 20;
        Map<String, Double> gradeScoreHM = new HashMap<>();
        String[] gradeArray = new String[]{"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        double score  = 4.5;
        for (int i = 0; i < gradeArray.length; i++) {
            gradeScoreHM.put(gradeArray[i], score);
            if(gradeArray[i].equals("D0")) {
                score = 0;
            } else score -= 0.5;
        }
        double sumOfScoreCreditMultiple = 0.0;
        double sumOfCreditDBArray = 0.0;

        for (int i = 0; i < subjectCount; i++) {
            String[] subjectCreditGradeArray = br.readLine().trim().split(" ");
            String grade = subjectCreditGradeArray[2];
            if (!grade.equals("P")) {
                String creditStr = subjectCreditGradeArray[1];
                double credit = Double.valueOf(creditStr);
                double subjectScore = gradeScoreHM.get(grade);
                sumOfScoreCreditMultiple += credit * subjectScore;
                sumOfCreditDBArray += credit;
            }
            ;
        }
        double result = sumOfScoreCreditMultiple / sumOfCreditDBArray;
        System.out.println("%.6f".formatted(result));
    }
}
