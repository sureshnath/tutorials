package com.susoft.executionorder;

import com.susoft.AbstractTestBase;
import org.testng.annotations.Test;

public class Class2UnitTest extends AbstractTestBase {
    @Test
    public void testClass2method1() throws InterruptedException {
        LOGGER.entry();
        Thread.sleep(10000);
    }
}
