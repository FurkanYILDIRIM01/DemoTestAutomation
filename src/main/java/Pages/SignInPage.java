package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage{
    public WebDriver webDriver;
    public SignInPage(WebDriver driver){
        this.webDriver=driver;
    }

    public SignInPage ProductSearch(String text){
        WebElement search = webDriver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys(text);

        return this;
    }
}
