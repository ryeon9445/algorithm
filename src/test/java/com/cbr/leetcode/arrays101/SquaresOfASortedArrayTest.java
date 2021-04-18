package com.cbr.leetcode.arrays101;

import org.junit.Assert;
import org.junit.Test;

public class SquaresOfASortedArrayTest {

    @Test
    public void testSolution() {
        Assert.assertArrayEquals(new int[]{0,1,9,16,100}, SquaresOfASortedArray.solution(new int[]{-4,-1,0,3,10}));
        Assert.assertArrayEquals(new int[]{4,9,9,49,121}, SquaresOfASortedArray.solution(new int[]{-7,-3,2,3,11}));
    }
}
