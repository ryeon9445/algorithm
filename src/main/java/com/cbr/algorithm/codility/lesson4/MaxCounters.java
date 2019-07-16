package com.cbr.algorithm.codility.lesson4;

import java.util.Arrays;

public class MaxCounters {

    public static int[] solution(int N, int[] A) {
        int[] B = new int[N];
        int maxValue = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B.length + 1) {
                Arrays.fill(B, maxValue);
            } else {
                B[A[i]-1] += 1;
                if (B[A[i]-1] > maxValue) {
                    maxValue = B[A[i]-1];
                }
            }
        }
        return B;
    }
}