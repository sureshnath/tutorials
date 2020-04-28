package com.baeldung.reports;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.testng.ISuite;
import org.testng.ITestClass;
import org.testng.ITestNGMethod;
import org.testng.reporters.XMLReporter;
import org.testng.xml.XmlSuite;

import java.util.List;

public class CustomForkXMLReporter extends XMLReporter {
    private static final XLogger LOGGER = XLoggerFactory.getXLogger( CustomForkXMLReporter.class );
    private String fileName;
    @Override
    public String fileName() {
        return this.fileName;
    }

    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        setFileName(suites);
        super.generateReport(xmlSuites, suites, outputDirectory);
    }

    public void setFileName(List<ISuite> suites){
        String className = suites.stream().flatMap(s->s.getAllMethods().stream().map(ITestNGMethod::getTestClass))
                .findFirst().map(ITestClass::getName).orElse("");
        this.fileName = super.fileName().replaceFirst("xml$", className + ".xml") ;
        LOGGER.info("File name is set to {} ", this.fileName);
    }
}
