package com.cbr.algorithm.codility.lesson5;

public class PassingCars {

    /**
     * O(N)
     */
    public static int solution(int[] A) {
        int result = 0;
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0)
                sum++;
            else
                result += sum;
        }

        if (result > 1000000000 || result < 0) return -1;

        return result;
    }
}