package org.example;

import java.util.logging.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        new ChromeDriver();
        try {
            Thread.sleep(10000);
        } catch (Exception e) {}
        System.out.println("Hello, World!");
    }

    @Test
    public void main1() {
        logger.info("Hello, GitHub Actions! This is a test log.");
        new ChromeDriver();
        logger.info("Hello, GitHub Actions! Chromedriver is started");
        try {
            logger.info("Hello, GitHub Actions! We are waiting for 10 seconds...");
            Thread.sleep(10000);
            logger.info("Hello, GitHub Actions! 10 seconds are completed");
        } catch (Exception ignored) {}
        logger.info("Hello, GitHub Actions! Process is completed");
    }
}