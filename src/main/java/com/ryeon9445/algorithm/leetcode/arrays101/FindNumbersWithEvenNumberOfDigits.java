package com.ryeon9445.algorithm.leetcode.arrays101;

public final class FindNumbersWithEvenNumberOfDigits {

    private FindNumbersWithEvenNumberOfDigits() {
    }

    public static int solution(int[] nums) {
        int evenCount = 0;
        for (int num : nums) {
            evenCount += String.valueOf(num).length() % 2 == 0 ? 1 : 0;
        }
        return evenCount;
    }
}
