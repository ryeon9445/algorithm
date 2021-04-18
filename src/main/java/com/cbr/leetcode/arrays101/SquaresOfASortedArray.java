package com.cbr.leetcode.arrays101;

import java.util.Arrays;

public final class SquaresOfASortedArray {

    private SquaresOfASortedArray() {
    }

    public static int[] solution(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = (int)Math.pow(Math.abs(nums[i]), 2);
        }
        Arrays.sort(result);
        return result;
    }
}
