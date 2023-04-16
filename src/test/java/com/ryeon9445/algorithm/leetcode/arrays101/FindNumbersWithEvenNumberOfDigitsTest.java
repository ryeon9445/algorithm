package com.ryeon9445.algorithm.leetcode.arrays101;

import org.junit.Assert;
import org.junit.Test;

public class FindNumbersWithEvenNumberOfDigitsTest {

    @Test
    public void testSolution() {
        Assert.assertEquals(1, FindNumbersWithEvenNumberOfDigits.solution(new int[]{555,901,482,1771}));
        Assert.assertEquals(2, FindNumbersWithEvenNumberOfDigits.solution(new int[]{12,345,2,6,7896}));
        Assert.assertEquals(2, FindNumbersWithEvenNumberOfDigits.solution(new int[]{1234,345,2,6,7896}));
        Assert.assertEquals(3, FindNumbersWithEvenNumberOfDigits.solution(new int[]{1234,345,2,6,7896, 99999999}));
    }
}
