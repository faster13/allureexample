package org.sample.args;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestArg {

    @Parameterized.Parameter
    public String something;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
           {"YES"},
           {"NO"}
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
        test(something);
    }

    @Step("I do when {something}")
    public void test(String something) {
        Assert.assertTrue("YES".equals(something));
    }
}
