package com.cbr.algorithm.codility.lesson4;

public class PermCheck {

    /**
     * O(N) or O(N * log(N))
     */
    public static int solution(int[] A) {
        int maxValue = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > maxValue) {
                maxValue = A[i];
            }
        }

        return maxValue == A.length ? 1 : 0;
    }
}