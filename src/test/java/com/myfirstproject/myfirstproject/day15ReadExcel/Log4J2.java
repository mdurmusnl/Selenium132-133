package com.myfirstproject.myfirstproject.day15ReadExcel;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Log4J2 {
    private static Logger logger = LogManager.getLogger(Log4J2.class.getName());
@Test
public void loggerTest1(){
    logger.fatal("Fatal log .... ");
    logger.error("Error log ... ");
    logger.warn("Warning log ... ");  //not yet
    logger.debug("Debug log ... "); //not yet
    logger.info("Info log ... "); //not yet
}

}
