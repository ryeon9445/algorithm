package com.ryeon9445.algorithm.codility.lesson3;

public final class TapeEquilibrium {

    private TapeEquilibrium() {}

    /**
     * O(N)
     */
    public static int solution(int[] A) {
        int minValue = Integer.MAX_VALUE;
        int leftValue = 0;
        int rightValue = 0;

        for (int i = 0; i < A.length; i++) {
            rightValue += A[i];
        }

        for (int i = 0; i < A.length - 1; i++) {
            leftValue += A[i];
            rightValue -= A[i];

            int calculatedValue = Math.abs(leftValue - rightValue);
            if (calculatedValue < minValue) {
                minValue = calculatedValue;
            }
        }
        return minValue;
    }
}