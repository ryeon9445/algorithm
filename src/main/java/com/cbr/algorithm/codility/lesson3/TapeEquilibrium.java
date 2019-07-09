package com.cbr.algorithm.codility.lesson3;

public class TapeEquilibrium {

    /**
     * O(N * N)
     */
    public static int solution(int[] A) {
        int min = Integer.MAX_VALUE;
        for (int n = 0; n < A.length; n++) {
            int leftValue = 0;
            int rightValue = 0;
            for (int p = 0; p < A.length; p++) {
                if (n >= p) {
                    leftValue += A[p];
                } else {
                    rightValue += A[p];
                }
            }
            int calculationValue = Math.abs(leftValue - rightValue);
            if (calculationValue < min) {
                min = calculationValue;
            }
        }
        return min;
    }
}