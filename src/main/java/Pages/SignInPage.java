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

    public SignInPage ProductSearch(String text){
        WebElement search = webDriver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys(text);

        return this;
    }
    public SignInPage clickButton(){
        WebElement aramaButon = webDriver.findElement(By.id("nav-search-submit-button"));
        aramaButon.click();
        return this;
    }
    public SignInPage cerezButon(){
        WebElement cerezKabulEt = webDriver.findElement(By.id("sp-cc-accept"));

        if(cerezKabulEt.isDisplayed()== true){
            cerezKabulEt.click();
        }
        return this;
    }
}
