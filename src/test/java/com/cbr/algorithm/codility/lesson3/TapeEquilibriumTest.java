package com.cbr.algorithm.codility.lesson3;

import org.junit.Assert;
import org.junit.Test;

public class TapeEquilibriumTest {

    @Test
    public void test() {
        Assert.assertEquals(1, TapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3}));
    }
}