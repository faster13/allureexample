package org.sample.args;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.sample.steps.SomeSteps;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestArgAnother extends SomeSteps {

    @Parameterized.Parameter
    public String something;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
           {"B1"},
           {"B2"}
        });
    }


/*    @Test
    @DisplayName("Всегда успешно")
    @Description("Пробный тест, который выполняется без ошибок")
    public void test() {
        tt();
    }*/

/*    @Step("Only once")
    public void tt() {
        Assert.assertTrue(1 == 1);
    }*/

    @Test
    @Story("Good story")
    @DisplayName("Всегда провальный")
    @Description("Пробный тест, который всегда выполняется с ошибкой")
    public void failureTest() {
        System.out.println(">> TEST 2");
        step1(something + "<< TEST2");
        step2(something + "<< TEST2");
    }

    @Step("RUN STEP 3 {something}")
    public void step3(String something) {
        System.out.println("STEP 3 - " + something);
        Assert.assertTrue(true);
    }

    @Step("RUN STEP 4 {something}")
    public void step4(String something) {
        System.out.println("STEP 4 - " + something);
        Assert.assertTrue(true);
    }


}
