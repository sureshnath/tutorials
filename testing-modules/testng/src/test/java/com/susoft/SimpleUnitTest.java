package com.susoft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class SimpleUnitTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleUnitTest.class);

    @Test
    public void testMe(){
        LOGGER.info("testMe");
    }
}
