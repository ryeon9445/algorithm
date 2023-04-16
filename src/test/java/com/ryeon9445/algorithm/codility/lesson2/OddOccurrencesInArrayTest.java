package com.ryeon9445.algorithm.codility.lesson2;

import org.junit.Assert;
import org.junit.Test;

public class OddOccurrencesInArrayTest {

    @Test
    public void test() {
        Assert.assertEquals(7, OddOccurrencesInArray.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
        Assert.assertEquals(5, OddOccurrencesInArray.solution(new int[]{9, 3, 9, 3, 9, 5, 9}));
        Assert.assertEquals(5, OddOccurrencesInArray.solution(new int[]{1, 3, 1, 3, 1, 5, 1}));
        Assert.assertEquals(3, OddOccurrencesInArray.solution(new int[]{9, 5, 9, 5, 9, 3, 9}));
        Assert.assertEquals(9, OddOccurrencesInArray.solution(new int[]{9, 5, 9, 5, 9, 9, 9}));
    }
}