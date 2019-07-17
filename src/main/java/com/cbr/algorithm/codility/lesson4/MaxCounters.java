package com.cbr.algorithm.codility.lesson4;

import java.util.Arrays;

public class MaxCounters {

    /**
     * O(N + M)
     */
    public static int[] solution(int N, int[] A) {
        int[] B = new int[N];
        int maxValue = 0;
        int tempMaxValue = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B.length + 1) {
                maxValue = tempMaxValue;
            } else {
                if (B[A[i]-1] < maxValue) {
                    B[A[i]-1] = maxValue;
                }

                B[A[i]-1] += 1;
                if (B[A[i]-1] > tempMaxValue) {
                    tempMaxValue = B[A[i]-1];
                }
            }
        }

        if (maxValue > 0) {
            for (int i = 0; i < B.length; i++) {
                if (B[i] < maxValue) {
                    B[i] = maxValue;
                }
            }
        }

        return B;
    }
}