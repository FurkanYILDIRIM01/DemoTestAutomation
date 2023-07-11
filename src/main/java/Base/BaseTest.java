package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class BaseTest extends BaseLibrary {
    public static WebDriver webDriver;

    @BeforeSuite
    public void setUp() {

        String browser = System.getProperty("Browser");
        if(browser==null)
        {browser="Chrome";}
        if (browser.equals("Firefox")) {
            webDriver = new FirefoxDriver();
        } else if (browser.equals("Safari")) {
            webDriver = new SafariDriver();
        } else if (browser.equals("Edge")) {
            webDriver = new EdgeDriver();
        } else {
            webDriver = new ChromeDriver();
        }



        webDriver.get(BaseURL);
        webDriver.manage().window().maximize();

    }
    @AfterSuite
     public void close(){

       webDriver.quit();
    }


}
