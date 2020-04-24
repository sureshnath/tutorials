package com.skipsuite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DynamicSkipSuiteLongRunningUnitTest {
    @BeforeSuite
    public void skip(){
        throw new SkipException("Do not run anything");
    }
    private static final Logger LOGGER = LoggerFactory.getLogger(DynamicSkipSuiteLongRunningUnitTest.class);

    @Test
    public void whenCalledFromSuite_thanOK() {
        LOGGER.info("Registration successful");
    }
}
