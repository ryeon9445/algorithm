package com.ryeon9445.algorithm.codility.lesson4;

import org.junit.Assert;
import org.junit.Test;

public class MissingIntegerTest {

    @Test
    public void test() {
        Assert.assertEquals(5, MissingInteger.solution(new int[]{1, 3, 6, 4, 1, 2}));
    }
}