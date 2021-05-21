package com.cbr.leetcode.arrays101;

public final class RemoveElement {

    private RemoveElement() {
    }

    public static int removeElement(int[] nums, int val) {
        int j = nums.length - 1;
        for (int i = 0; i <= j; i++) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                --j;
                --i;
            }
        }
        return j+1;
    }
}
