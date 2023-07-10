package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public static WebDriver webDriver;
    @Before
    public void setUp(){

        System.setProperty("webdriver.geck.driver","drivers/geckdrive");
        webDriver=new FirefoxDriver();
        webDriver.get("https://www.amazon.com.tr/");
        webDriver.manage().window().maximize();

    }
    @After
    public void close(){
        webDriver.quit();
    }


}
