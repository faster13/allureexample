package org.sample.args;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class TestArg {

    @Test
    @DisplayName("Всегда успешно")
    @Description("Пробный тест, который выполняется без ошибок")
    public void test() {
        System.out.println("Test Done!");
    }

    @Test
    @DisplayName("Всегда провальный")
    @Description("Пробный тест, который всегда выполняется с ошибкой")
    public void failureTest() {
        Assert.assertTrue(1 == 2);
    }
}
