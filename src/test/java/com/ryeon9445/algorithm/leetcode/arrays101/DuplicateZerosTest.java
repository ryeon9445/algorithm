package com.ryeon9445.algorithm.leetcode.arrays101;

import org.junit.Assert;
import org.junit.Test;

public class DuplicateZerosTest {

    @Test
    public void testSolution() {
        int[] ints = new int[]{1,0,2,3,0,4,5,0};
        DuplicateZeros.solution(ints);
        Assert.assertArrayEquals(new int[]{1,0,0,2,3,0,0,4}, ints);

        int[] ints2 = new int[]{0,4,1,0,0,8,0,0,3};
        DuplicateZeros.solution(ints2);
        Assert.assertArrayEquals(new int[]{0,0,4,1,0,0,0,0,8}, ints2);
    }
}
