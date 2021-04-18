package com.cbr.leetcode.arrays101;

public final class DuplicateZeros {

    private DuplicateZeros() {
    }

    public static void solution(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int j = i+1;
            if (arr[i] == 0) {
                for (int k = arr.length-1; k > j; k--) {
                    arr[k] = arr[k-1];
                }
                arr[j] = 0;
                i = i+1;
            }
        }
    }
}
