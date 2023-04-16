package com.ryeon9445.algorithm.codility.lesson5;

public final class MinAvgTwoSlice {

    private MinAvgTwoSlice() {
    }

    /**
     * O(N ** 2)
     */
    public static int solution(int[] A) {
        int result = Integer.MAX_VALUE;
        double tempCalculate = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            int tempSum = 0;
            int plusCount = 0;
            for (int j = i; j < A.length; j++) {
                plusCount++;
                tempSum += A[j];
                if (j == i) {
                    continue;
                }
                double total = (double)tempSum / plusCount;
                if (tempCalculate > total) {
                    tempCalculate = total;
                    result = i;
                }
            }
        }
        return result;
    }
}