package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.geck.driver","drivers/geckdrive");
        WebDriver webDriver=new FirefoxDriver();
        webDriver.get("https://www.amazon.com.tr/");

        WebElement cookie_button = webDriver.findElement(By.id("sp-cc-accept"));
        cookie_button.click();

        WebElement search = webDriver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("telefon");

        WebElement search_button = webDriver.findElement(By.id("nav-search-submit-button"));
        search_button.click();


    }
}