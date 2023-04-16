package com.ryeon9445.algorithm.codility.lesson4;

import java.util.HashSet;
import java.util.Set;

public final class PermCheck {

    private PermCheck() {
    }

    /**
     * O(N) or O(N * log(N))
     */
    public static int solution(int[] A) {
        int maxValue = 0;
        Set<Integer> values = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            values.add(A[i]);
            if (A[i] > maxValue) {
                maxValue = A[i];
            }
        }

        if (maxValue == A.length && values.size() == A.length) {
            return 1;
        } else {
            return 0;
        }
    }
}