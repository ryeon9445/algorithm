package com.cbr.algorithm.codility.lesson4;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class MissingInteger {

    /**
     * O(N) or O(N * log(N))
     */
    public static int solution(int[] A) {
        Set<Integer> tempSet = Arrays.stream(A).boxed().collect(Collectors.toSet());
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!tempSet.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}