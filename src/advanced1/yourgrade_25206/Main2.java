package advanced1.yourgrade_25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int subjectCount = 20;
        List<String> gradeArrayList = new ArrayList<>(Arrays.asList("A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"));
        List<Double> scoreArrayList = new ArrayList<>(Arrays.asList(4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0));

        double sumOfScoreCreditMultiple = 0.0;
        double sumOfCreditDBArray = 0.0;

        for (int i = 0; i < subjectCount; i++) {
            String[] subjectCreditGradeArray =  br.readLine().trim().split(" "); // subjectName(string), credit(look double but string), grade(string)
            String grade = subjectCreditGradeArray[2];
            if (!grade.equals("P")) {
                double credit = Double.valueOf(subjectCreditGradeArray[1]);
                double subjectScore = scoreArrayList.get(gradeArrayList.indexOf(grade));
                sumOfScoreCreditMultiple += credit * subjectScore;
                sumOfCreditDBArray += credit;
            }
        }
//        else {
//                System.out.println("end");
//            }
        double result = sumOfScoreCreditMultiple / sumOfCreditDBArray;
        System.out.println("%.6f".formatted(result));
    }
}
