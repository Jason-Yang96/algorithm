package test_baekjoon.candidatekey_42890;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String[][] relation) {
        int rowCount = relation.length;
        int colCount = relation[0].length;
        Set<String> candidateKeys = new HashSet<>();
        for (int i = 1; i < (1 << colCount); i++) {
            Set<String> set = new HashSet<>();
            boolean isMinimal = true;
            for (int j = 0; j < rowCount; j++) {
                StringBuilder key = new StringBuilder();
                for (int k = 0; k < colCount; k++) {
                    if ((i & (1 << k)) > 0) {
                        key.append(relation[j][k]).append(" ");
                    }
                }
                if (!set.add(key.toString())) {
                    // If there's a duplicate, it violates uniqueness
                    isMinimal = false;
                    break;
                }
            }
            if (isMinimal) {
                // Check if the candidate key is minimal
                boolean isSuperkey = true;
                for (String existingKey : candidateKeys) {
                    if ((i & getKeyBitmask(existingKey)) == getKeyBitmask(existingKey)) {
                        // If it is a superkey of an existing candidate key, it's not minimal
                        isSuperkey = false;
                        break;
                    }
                }
                if (isSuperkey) {
                    // If it is minimal, add it to the candidate keys
                    candidateKeys.add(getKeyString(i, colCount));
                }
            }
        }
        return candidateKeys.size();
    }

    private int getKeyBitmask(String key) {
        String[] keyElements = key.trim().split(" ");
        int bitmask = 0;
        for (String element : keyElements) {
            int index = Integer.parseInt(element);
            bitmask |= (1 << index);
        }
        return bitmask;
    }

    private String getKeyString(int bitmask, int colCount) {
        StringBuilder key = new StringBuilder();
        for (int i = 0; i < colCount; i++) {
            if ((bitmask & (1 << i)) > 0) {
                key.append(i).append(" ");
            }
        }
        return key.toString();
    }
}

