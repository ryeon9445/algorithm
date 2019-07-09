package com.cbr.algorithm.codility.lesson3;

public class TapeEquilibrium {

    /**
     * O(N * N)
     */
    public static int solution(int[] A) {
        if (A.length <= 1 || A.length > 100000) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        for (int n = 0; n < A.length; n++) {
            if (A[n] < -1000 || A[n] > 1000) {
                return 0;
            }

            int leftValue = 0;
            int rightValue = 0;
            for (int p = 0; p < A.length; p++) {
                if (n >= p) {
                    leftValue += Math.abs(A[p]);
                } else {
                    rightValue += Math.abs(A[p]);
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