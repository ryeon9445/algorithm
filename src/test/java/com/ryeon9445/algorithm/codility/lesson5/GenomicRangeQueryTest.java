package com.ryeon9445.algorithm.codility.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class GenomicRangeQueryTest {

    @Test
    public void test() {
        Assert.assertArrayEquals(new int[]{2, 4, 1}, GenomicRangeQuery.solution("CAGCCTA", new int[]{2, 5, 0}, new int[] {4, 5, 6}));
    }
}