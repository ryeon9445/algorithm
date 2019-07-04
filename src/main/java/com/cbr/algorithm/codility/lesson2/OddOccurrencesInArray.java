package com.cbr.algorithm.codility.lesson2;

import java.util.*;

public class OddOccurrencesInArray {

    /**
     * O(N) or O(N*log(N))
     */
    public static int solution(int[] A) {
        if (A.length == 0 || A.length > 1000000 || A.length % 2 == 0) {
            return 0;
        }

        Set<Integer> checkNumbers = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (checkNumbers.contains(A[i])) {
                checkNumbers.remove(A[i]);
            } else {
                checkNumbers.add(A[i]);
            }
        }

        return checkNumbers.stream().findFirst().orElse(0);
    }
}