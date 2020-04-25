package com.susoft.executionorder;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.testng.annotations.Test;

public class Class2 {
    private static final XLogger LOGGER = XLoggerFactory.getXLogger( Class2.class );
    @Test
    public void test2() {
        LOGGER.entry();
    }
}
