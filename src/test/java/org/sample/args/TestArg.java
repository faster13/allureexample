package org.sample.args;

import org.junit.Assert;
import org.junit.Test;

public class TestArg {

    @Test
    public void test() {
        System.out.println("Test Done!");
    }

    @Test
    public void failureTest() {
        Assert.assertTrue(1 == 2);
    }
}
