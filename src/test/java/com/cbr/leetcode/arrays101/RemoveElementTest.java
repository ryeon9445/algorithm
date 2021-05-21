package com.cbr.leetcode.arrays101;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RemoveElementTest {

    @Test
    public void testRemoveElement() {
        int[] ints = {3, 2, 2, 3};
        Assert.assertEquals(2, RemoveElement.removeElement(ints, 3));
        Assert.assertArrayEquals(new int[]{2,2}, Arrays.stream(ints).limit(2).toArray());

        int[] ints2 = {0, 1, 2, 2, 3, 0, 4, 2};
        Assert.assertEquals(5, RemoveElement.removeElement(ints2, 2));
        Assert.assertArrayEquals(new int[]{0,1,4,0,3}, Arrays.stream(ints2).limit(5).toArray());
    }
}
