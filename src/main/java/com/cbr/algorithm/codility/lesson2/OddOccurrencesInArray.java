package com.cbr.algorithm.codility.lesson2;

public class OddOccurrencesInArray {

    public static int solution(int[] A) {
        for (int i = 0; i < A.length; i++) {
            boolean isOne = true;
            for (int j = 0; j < A.length; j++) {
                if (i == j) {
                    continue;
                }
                if (A[i] == A[j]) {
                    isOne = false;
                }
            }
            if (isOne) {
                return A[i];
            }
        }
        return -1;
    }
}