package com.cbr.algorithm.codility.lesson5;

public class PassingCars {

    /**
     * O(N)
     */
    public static int solution(int[] A) {
        int sumValue = 0;
        int minusValue = 1;

        if (A.length < 1 || A.length > 100000) {
            return 0;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                sumValue += A.length - (i + 1);
                if (i != 0 && sumValue > 0) {
                    sumValue -= minusValue;
                    minusValue ++;
                }
            }
        }

        if (Math.abs(sumValue) > 1000000000 ) {
            return -1;
        }

        return sumValue;
    }
}