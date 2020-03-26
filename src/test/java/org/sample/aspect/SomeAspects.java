package org.sample.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.junit.BeforeClass;

@Aspect
public class SomeAspects {

    @Pointcut("@annotation(before)")
    public void callAt(BeforeClass before) {
    }

    @Before("callAt(before)")
    public void doing() {
        System.out.println("DDDDD");
    }

    @Before("execution(* *())")
    public void goahead() {
        System.out.println("=========================");
    }
}
