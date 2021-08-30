package com.logger.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import static com.logger.demo.MyMarker.*;

public class LoggerDemo {
    private static final Marker IMPORTANT =
            MarkerFactory.getMarker("IMPORTANT");
        private static final Logger LOGGER = LoggerFactory.getLogger(LoggerDemo.class);
        public static void main(String[] args) {
            LOGGER.info("This is an INFO level log message!");
            LOGGER.error("This is an ERROR level log message!");
            LOGGER.info("END OF LoggerDemo FILE!");
            LOGGER.warn(IMPORTANT, "test loggerDemo");

        }
    }


