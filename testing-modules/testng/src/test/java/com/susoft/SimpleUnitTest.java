package com.susoft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.testng.annotations.Test;

public class SimpleUnitTest {

    private static final XLogger LOGGER = XLoggerFactory.getXLogger( SimpleUnitTest.class );

    @Test
    public void testMe(){
        LOGGER.entry();
    }
}
