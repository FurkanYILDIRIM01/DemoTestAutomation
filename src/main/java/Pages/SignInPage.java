package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SignInPage{
    public String text;
    public WebDriver webDriver;
    public SignInPage(WebDriver driver){
        this.webDriver=driver;
    }

    @Step("Search A Product By ASIN")
    public SignInPage ProductSearch(String text){
        WebElement search = webDriver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys(text);

        return this;
    }
    @Step("Navigates To HomePage")
    public SignInPage NavigateHomePage(){
        webDriver.navigate().to("https://www.amazon.com.tr/");

        return this;
    }
}
