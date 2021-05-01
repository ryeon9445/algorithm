package com.cbr.leetcode.arrays101;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArrayTest {

    @Test
    public void testSolution() {
        int[] list1 = new int[]{1,2,3,0,0,0};
        MergeSortedArray.solution(list1, 3, new int[]{2,5,6}, 3);
        Assert.assertArrayEquals(new int[]{1,2,2,3,5,6}, list1);

        int[] list2 = new int[]{2,1,3};
        MergeSortedArray.solution(list2, 3, new int[]{}, 0);
        Assert.assertArrayEquals(new int[]{1,2,3}, list2);

        int[] list3 = new int[]{0};
        MergeSortedArray.solution(list3, 0, new int[]{1}, 1);
        Assert.assertArrayEquals(new int[]{1}, list3);

        int[] list4 = new int[]{4,0,0,0,0,0};
        MergeSortedArray.solution(list4, 1, new int[]{1,2,3,5,6}, 5);
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6}, list4);
    }
}
