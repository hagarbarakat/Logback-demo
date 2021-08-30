package com.logger.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import static com.logger.demo.MyMarker.*;

public class LogbackMarker {
    private static Logger LOGGER =
            LoggerFactory.getLogger(LogbackMarker.class);
    private static final Marker IMPORTANT =
            MarkerFactory.getMarker("IMPORTANT");

    public static void main(String[] args) {
        LOGGER.info("This is a log message that is not important!");
        LOGGER.warn(IMPORTANT, "This is a very important log message! added to SRE");
        LOGGER.warn(IMPORTANT, "test");
        LOGGER.error("add this error to SRE file!");
        LOGGER.info("END OF LogbackMarker FILE!");

    }
}