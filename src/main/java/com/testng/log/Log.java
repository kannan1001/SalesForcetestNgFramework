package com.testng.log;

import org.apache.log4j.Logger;

public class Log {

    // Create a static Logger instance for this class
    private static final Logger logger = Logger.getLogger(Log.class);

    // Log INFO level messages
    public static void info(String message) {
        logger.info(message);
    }

    // Log DEBUG level messages
    public static void debug(String message) {
        logger.debug(message);
    }

    // Log ERROR level messages
    public static void error(String message) {
        logger.error(message);
    }

    // Log WARN level messages
    public static void warn(String message) {
        logger.warn(message);
    }

    // Log FATAL level messages
    public static void fatal(String message) {
        logger.fatal(message);
    }

    // Method to log the start of a test case
    public static void startTestCase(String testCaseName) {
        logger.info("=====================================================================");
        logger.info("Starting Test Case: " + testCaseName);
        logger.info("=====================================================================");
    }

    // Method to log the end of a test case
    public static void endTestCase(String testCaseName) {
        logger.info("=====================================================================");
        logger.info("Ending Test Case: " + testCaseName);
        logger.info("=====================================================================");
    }

}

