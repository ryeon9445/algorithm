package com.ryeon9445.algorithm.leetcode.arrays101;

import org.junit.Assert;
import org.junit.Test;

public class MaxConsecutiveOnesTest {

    @Test
    public void testSolution() {
        Assert.assertEquals(3, MaxConsecutiveOnes.solution(new int[]{1,1,0,1,1,1}));
        Assert.assertEquals(6, MaxConsecutiveOnes.solution(new int[]{1,1,0,1,1,1,1,1,1}));
        Assert.assertEquals(2, MaxConsecutiveOnes.solution(new int[]{1,0,0,0,0,1,1,0,0,0,1}));
    }
}
