package com.cbr.algorithm.codility.lesson2;

public class OddOccurrencesInArray {

    public static int solution(int[] A) {
        if (A.length == 0 || A.length > 1000000 || A.length % 2 == 0) {
            return 0;
        }

        for (int i = 0; i < A.length; i++) {
            int sameNumberCount = 0;
            for (int j = 0; j < A.length; j++) {
                if (i == j) {
                    continue;
                }
                if (A[i] == A[j]) {
                    sameNumberCount++;
                }
            }
            if (sameNumberCount == 0 || sameNumberCount % 2 == 0) {
                return A[i];
            }
        }
        return 0;
    }
}