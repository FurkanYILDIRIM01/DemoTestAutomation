package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.geck.driver","drivers/geckdrive");
        WebDriver webDriver=new FirefoxDriver();
        webDriver.get("https://www.amazon.com.tr/");
    }
}