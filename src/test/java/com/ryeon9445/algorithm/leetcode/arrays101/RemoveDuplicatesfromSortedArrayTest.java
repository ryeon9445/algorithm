package com.ryeon9445.algorithm.leetcode.arrays101;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesfromSortedArrayTest {

    @Test
    public void testRemoveDuplicates() {
        int[] ints = {1, 1, 2};
        Assert.assertEquals(2, RemoveDuplicatesfromSortedArray.removeDuplicates(ints));

        int[] ints2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Assert.assertEquals(5, RemoveDuplicatesfromSortedArray.removeDuplicates(ints2));
    }
}
