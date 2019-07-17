package com.cbr.algorithm.codility.lesson4;

public class MissingInteger {

    /**
     * O(N**2)
     */
    public static int solution(int[] A) {
        int answerValue = 1;
        while (true) {
            boolean isSameValue = false;
            for (int i = 0; i < A.length; i++) {
                if (A[i] == answerValue) {
                    isSameValue = true;
                }
            }
            if (isSameValue) {
                answerValue++;
            } else {
                return answerValue;
            }
        }
    }
}