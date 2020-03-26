package org.sample.config;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class UnitInit {

    @BeforeClass
    public static void startUp() {
        System.out.println("LOADING");
    }

    @AfterClass
    public static void shutdown() {
        System.out.println("SHUTDOWN");
    }
}
