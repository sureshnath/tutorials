package com.susoft;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.testng.annotations.BeforeSuite;

public abstract class AbstractTestBase {
    protected static final XLogger LOGGER = XLoggerFactory.getXLogger( AbstractTestBase.class );
    @BeforeSuite
    public void suiteSetup(){
        LOGGER.entry();
    }
}
