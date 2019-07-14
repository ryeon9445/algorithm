package com.cbr.algorithm.codility.lesson4;

import org.junit.Assert;
import org.junit.Test;

public class PermCheckTest {

    @Test
    public void test() {
        Assert.assertEquals(1, PermCheck.solution(new int[]{1,2}));
        Assert.assertEquals(0, PermCheck.solution(new int[]{1, 2, 3, 4, 6}));
    }
}