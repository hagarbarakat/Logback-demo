package com.logger.testing;

import com.logger.demo.LoggerDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class LogbackTest {

    private static final Logger LOGGER
            = LoggerFactory.getLogger(LogbackTest.class);
    private static final Marker IMPORTANT =
            MarkerFactory.getMarker("IMPORTANT");
    public static void main(String[] args) {
        //TODO: all logs are written in one file, from this file append errors, "errors and markers from loggerDemo" in another file
        LOGGER.info(IMPORTANT, "This is an INFO level log message!");
        LOGGER.error("This is an ERROR level log message! added to SRE file !!");
        LOGGER.info("END OF LogbackTest FILE!");
    }
}
