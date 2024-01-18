package programmers.kit.greedy.cloth;
import java.util.*;

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
        int answer = 0;
        int nWithoutLost = n - lost.length;
        // 발생한 문제 : 원시 타입의 정수 배열로 리스트를 만들 수 없다. (참조 자료형 제네릭)
        Integer[] integerReserve = new Integer[reserve.length];

        for (int i = 0; i < reserve.length; i++) {
            integerReserve[i] = Integer.valueOf(reserve[i]);
        }
        List<Integer> reserveList = new ArrayList<>(Arrays.asList(integerReserve));

        for(int l : lost){
            if (l == 1) {
                if(reserveList.contains(l+1)){
                    int reserveIndex = reserveList.indexOf(l+1);
                    reserveList.set(reserveIndex, 0);
                    nWithoutLost++;
                }
            } else if(l == n) {
                if(reserveList.contains(l-1)){
                    int reserveIndex = reserveList.indexOf(l-1);
                    reserveList.set(reserveIndex, 0);
                    nWithoutLost++;
                }
            } else { 
                if(reserveList.contains(l-1)){
                    int reserveIndex = reserveList.indexOf(l-1);
                    reserveList.set(reserveIndex, 0);
                    nWithoutLost++;           
                } else if(reserveList.contains(l+1)){
                    int reserveIndex = reserveList.indexOf(l+1);
                    reserveList.set(reserveIndex, 0);
                    nWithoutLost++;
                }
            }
        }
        answer = nWithoutLost;
        return answer;
    }
}
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
*/
