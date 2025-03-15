package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Main {
    public static void main(String[] args) {
        new ChromeDriver();
        try {
            Thread.sleep(10000);
        } catch (Exception e) {}
        System.out.println("Hello, World!");
    }

    @Test
    public void main1() {
        new ChromeDriver();
        try {
            Thread.sleep(10000);
        } catch (Exception ignored) {}
        System.out.println("Hello, World!");
    }
}