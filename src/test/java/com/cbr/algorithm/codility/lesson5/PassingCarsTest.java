package com.cbr.algorithm.codility.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class PassingCarsTest {

    @Test
    public void test() {
        Assert.assertEquals(5, PassingCars.solution(new int[]{0, 1, 0, 1, 1}));
    }
}