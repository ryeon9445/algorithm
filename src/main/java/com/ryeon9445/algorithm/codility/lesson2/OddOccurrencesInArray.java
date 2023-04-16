package com.ryeon9445.algorithm.codility.lesson2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class OddOccurrencesInArray {

    private OddOccurrencesInArray() {}

    /**
     * O(N) or O(N*log(N))
     */
    public static int solution(int[] A) {
        if (A.length == 0 || A.length > 1000000 || A.length % 2 == 0) {
            return 0;
        }

        Set<Integer> checkNumbers = new HashSet<>();
        Arrays.stream(A).forEach(number -> {
            if (checkNumbers.contains(number)) {
                checkNumbers.remove(number);
            } else {
                checkNumbers.add(number);
            }
        });

        return checkNumbers.stream().findFirst().orElse(0);
    }
}