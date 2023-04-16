package com.ryeon9445.algorithm.leetcode.arrays101;

import java.util.ArrayList;

public final class RemoveDuplicatesfromSortedArray {

    private RemoveDuplicatesfromSortedArray() {
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 0) {
            return 0;
        }

        ArrayList<Integer> tempNums = new ArrayList<>();
        tempNums.add(nums[0]);
        int numSize = 1;
        for (int i = 1; i < nums.length; i++) {
            boolean isSame = false;
            for (int j = 0; j < tempNums.size(); j++) {
                if (tempNums.get(j) == nums[i]) {
                    isSame = true;
                    break;
                }
            }

            if (!isSame) {
                numSize = numSize + 1;
                tempNums.add(nums[i]);
            }
        }

        for (int i = 0; i < tempNums.size(); i++) {
            nums[i] = tempNums.get(i);
        }

        return numSize;
    }
}
