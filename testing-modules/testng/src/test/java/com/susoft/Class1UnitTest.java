package com.susoft;

import org.testng.annotations.Test;

public class Class1UnitTest extends AbstractTestBase {
    @Test
    public void testClass1method1() throws InterruptedException{
        LOGGER.entry();
        Thread.sleep(10000);
    }
}
