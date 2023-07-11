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
    public SignInPage clickOnProductDescription(){
        webDriver.findElement(By.cssSelector(".widgetId\\=search-results_1 > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > h2:nth-child(1) > a:nth-child(1) > span:nth-child(1)")).click();

        return this;
    }

    public SignInPage checkProductDescriptionText(String actualText){
        String expectedText= webDriver.findElement(By.id("productTitle")).getText();
        Assert.assertEquals(actualText,expectedText);
        System.out.println(expectedText);

        return this;
    }

    public SignInPage addProductToCart(){
        webDriver.findElement(By.id("add-to-cart-button")).click();

        return this;
    }

    public SignInPage checkProductAddedText(String actualText){

        String expectedText=webDriver.findElement(By.cssSelector("[class^='a-size-medium-plus']")).getText();
        Assert.assertEquals(actualText,expectedText);
        System.out.println(expectedText);

        return this;
    }

    public SignInPage navigateToCart(){
        webDriver.findElement(By.id("sw-gtc")).click();
        return this;
    }
    public SignInPage checkProductInCart(String actualText){
        String expectedText= webDriver.findElement(By.cssSelector("[class='a-truncate-cut']")).getText();
        Assert.assertEquals(actualText,expectedText);
        System.out.println(expectedText);

        return this;
    }

}
