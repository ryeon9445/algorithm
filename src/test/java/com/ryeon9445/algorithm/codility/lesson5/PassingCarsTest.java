package com.ryeon9445.algorithm.codility.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class PassingCarsTest {

    @Test
    public void test() {
        Assert.assertEquals(6, PassingCars.solution(new int[]{0, 1, 0, 1, 0, 1}));
        Assert.assertEquals(5, PassingCars.solution(new int[]{0, 1, 0, 1, 1}));
        Assert.assertEquals(0, PassingCars.solution(new int[]{1, 0}));
        Assert.assertEquals(0, PassingCars.solution(new int[]{0, 0}));
    }
}