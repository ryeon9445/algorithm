package com.ryeon9445.algorithm.leetcode.arrays101;

public final class MaxConsecutiveOnes {

    private MaxConsecutiveOnes() {
    }

    public static int solution(int[] nums) {
        int increaseOne = 0;
        int maxOne = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                increaseOne = increaseOne + 1;
            } else {
                if (increaseOne > maxOne ) {
                    maxOne = increaseOne;
                }
                increaseOne = 0;
            }
        }

        return Math.max(increaseOne, maxOne);
    }
}
