package org.sample.suites;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Suite;
import org.sample.args.TestArg;
import org.sample.args.TestArgAnother;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestArg.class,
        TestArgAnother.class
})
public class AllSuites {

    @BeforeClass
    public static void startUp() {
        System.out.println("LOADING");
    }

    @AfterClass
    public static void shutdown() {
        System.out.println("SHUTDOWN");
    }
}
