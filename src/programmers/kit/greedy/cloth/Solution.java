package programmers.kit.greedy.cloth;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {3};

        int resultValue = Solution.solution(n, lost, reserve);
        int answer = 4;

        System.out.println("resultValue = " + resultValue);
        System.out.println("answer = " + answer);;
        System.out.println(resultValue == answer);
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = Arrays.stream(lost)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> reserveNotStolen = new ArrayList<>(); // 체육복 도둑질 안 당한, 여분 있는 친구

        for (int r : reserve){
            if(lostList.contains(r)) continue;
            reserveNotStolen.add(r);
        }

        int[] students = new int[n]; // []
        int count = 0;

//        Collections.sort(lostList);
//        Collections.sort(reserveNotStolen);


        Arrays.fill(students, 1);
        for (int l : lostList) students[l-1] = 0;
        for (int i : reserveNotStolen) {
            if (i == 1) {
                if(students[i]==0) students[i] = 1;
            } else if (i == n) {
                students[i - 2] = 1;
            } else {
                if (students[i - 2] == 0 | students[i] == 0) {
                    if (students[i - 2] == 0) {
                        students[i - 2] = 1;
                    } else {
                        students[i] = 0;
                    }
                }
            }
        }
        for (int student : students)  if(student == 1) count++;
        return count;
    }
    public static int solution_wrong(int n, int[] lost, int[] reserve) {
        int answer = n;
//        int nWithoutLost = n - lost.length; // 참가 가능.
        // 발생한 문제 : 원시 타입의 정수 배열로 리스트를 만들 수 없다. (참조 자료형 제네릭)
        Integer[] students = new Integer[n];

        for (Integer l : lost) {
            students[l-1]--;
        }
        for (Integer r : reserve) {
            students[r-1]++;
        }
        // [0,0,0,0,0] => [0,-1,0,-1,0] => [1, -1, 1, -1, 1]
        // 여벌을 가져왔는데, 잃어버려서, 다른 친구들에게 주지 못하는 친구를 계속 생각해야 함.
        // 상황을 이분할 한다.
        for (int i = 0; i < students.length; i++) {
            if (students[i] == -1) {
                if (i - 1 >= 0 && students[i - 1] == 1) { // 0 요소를 둔다. 아예 기준을 잡아야 한다. 깔.
                    students[i]++;
                    students[i - 1]--;
                } else if (i + 1 < students.length && students[i+1]==1) {
                    students[i]++;
                    students[i+1]--;
                } else {
                    answer--;
                }
            }
        }
        return answer;
    }
}
//        for(int l : lost){
//            if (l == 1) {
//                if(reserveList.contains(l+1)){
//                    int reserveIndex = reserveList.indexOf(l+1);
//                    reserveList.set(reserveIndex, 0);
//                    answer++;
//                }
//            } else if(l == n) {
//                if(reserveList.contains(l-1)){
//                    int reserveIndex = reserveList.indexOf(l-1);
//                    reserveList.set(reserveIndex, 0);
//                    answer++;
//                }
//            } else {
//                if(reserveList.contains(l-1)){
//                    int reserveIndex = reserveList.indexOf(l-1);
//                    reserveList.set(reserveIndex, 0);
//                    answer++;
//                } else if(reserveList.contains(l+1)){
//                    int reserveIndex = reserveList.indexOf(l+1);
//                    reserveList.set(reserveIndex, 0);
//                    answer++;
//                } else {
//                    answer--;
//                }
//            }
//        }
/*
*******첫인상
일단은 전체 학생 수는 n이라고 생각.

바로 앞 번호 학생이나 바로 뒷 번호 학생에게만 빌려줄 수 있음. 
빌려줘서 체육 수업을 들을 수 있는 학생의 최댓값을 구해라

[2,4] 2번 학생과 4번 학생이 도난 당했고
[1,3,5] 1번,3번,5번 학생이 여분의 옷이 있었다. 

1번은 2번, 3번은 4번에게 빌려줘서 전체 5명이 체육 수업을 들었다. 
    


*******구현 위한 생각 정리
- lost 에서 요소를 뽑아서 +- 1을 해본다. 그리고 그 요소가 만약에 reserve에 있다면 이 요소를 복사된 reserve 에서 0으로 대체한다.


*******유의점
- 수업을 들을 수 있는 학생의 최댓값을 구해야 한다. 잘 생각해보라. 앞 뒤 친구에게 빌려주는 상황 때문에 최댓값이 안나올 수도 있다. 

*******첫번째 풀이 이후
- 반복되는 구문이 너무 많음.
- 전혀 그리디스럽지 못함.
- 추가적으로 그냥 틀림
- 풀이에 있어 추가적으로 생각해야 할 것: 여벌이 있는 학생도 도난 당할 수 있음. 정렬되어 있지 않음. 
*/
