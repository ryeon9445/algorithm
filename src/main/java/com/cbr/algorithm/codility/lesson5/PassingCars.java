package com.cbr.algorithm.codility.lesson5;

public class PassingCars {

    /**
     * O(N ** 2)
     */
    public static int solution(int[] A) {
        int sumValue = 0;

        if (A.length > 1000000000) {
            return -1;
        }

        for (int i = 0; i < A.length; i++) {
            if ((A[i]) != 0) {
                continue;
            }

            for (int j = i + 1; j < A.length; j++) {
                if (A[j] == 1) {
                    sumValue++;
                }
            }
        }
        return sumValue;
    }
}