package com.cbr.algorithm.codility.lesson4;

import java.util.HashSet;
import java.util.Set;

public final class MissingInteger {

    private MissingInteger() {
    }

    /**
     * O(N) or O(N * log(N))
     */
    public static int solution(int[] A) {
        Set<Integer> tempSet = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            tempSet.add(A[i]);
        }

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!tempSet.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}