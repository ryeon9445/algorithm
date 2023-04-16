package com.ryeon9445.algorithm.leetcode.arrays101;

import java.util.Arrays;

public final class MergeSortedArray {

    private MergeSortedArray() {
    }

    public static void solution(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
        } else if (n > 0){
            int index = 0;
            for (int i = m; i < m+n; i++) {
                nums1[i] = nums2[index];
                index++;
            }
        }
        Arrays.sort(nums1);
    }
}
