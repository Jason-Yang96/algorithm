package programmers.kit.hashmap.완주하지못한자;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        String answer = Solution.solution(
                new String[]{"leo", "kiki", "eden"},
                new String[]{"eden", "kiki"}
        );
        System.out.println(answer);
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> participantHM = new HashMap<>();
        for (String p : participant) {
            participantHM.put(p, participantHM.getOrDefault(p, 0) + 1);
        }
        for (String c : completion) {
            if (participantHM.containsKey(c)) participantHM.put(c, participantHM.get(c) - 1);
            if (participantHM.get(c) == 0) participantHM.remove(c);
        }

//        Set<Map.Entry<String, Integer>> entryMap
        Set<String> keys = participantHM.keySet();
        for (String key : keys) {
            if (participantHM.get(key) == 1) {
                answer = key;
            }
        }
        return answer;
    }

    public static String solution2nd(String[] participant, String[] completion) {
        String answer = "";
        List<String> participantAsList = Arrays.asList(participant);
        ArrayList<String> participantArrayList = new ArrayList<>(participantAsList);
        for (String s : completion) {
            participantArrayList.remove(s);
        }
        answer = participantArrayList.get(0);
        return answer;
    }

    public static String solution1st(String[] participant, String[] completion) {
        String answer = null;
        for (String person : participant) {
            boolean didParticipantFinish = Arrays.asList(completion).contains(person);
            if (didParticipantFinish) continue;
            answer = person;
            break;
        }
        return answer;
    }
}

