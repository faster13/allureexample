package org.sample.steps;

import io.qameta.allure.Step;
import org.junit.Assert;

public class SomeSteps {

    @Step("RUN STEP 1 {something}")
    public void step1(String something) {
        System.out.println("STEP 1 - " + something);
        Assert.assertTrue(true);
    }

    @Step("RUN STEP 2 {something}")
    public void step2(String something) {
        System.out.println("STEP 2 - " + something);
        Assert.assertTrue(true);
    }
}
