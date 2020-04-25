package com.susoft.executionorder;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.testng.annotations.Test;

public class Class1 {
    private static final XLogger LOGGER = XLoggerFactory.getXLogger( Class1.class );
    @Test
    public void test3(){
        LOGGER.entry();
    }
    @Test
    public void test1(){
        LOGGER.entry();
    }
}
