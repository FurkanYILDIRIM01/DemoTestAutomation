package Test;

import Base.BaseTest;
import Pages.SignInPage;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {

    @Test
    public void TC001() {
        SignInPage signInPage = new SignInPage(webDriver);
        signInPage.cerezButon();
        signInPage.ProductSearch("telefon");
        signInPage.clickButton();

    }

    @Test
    public void TC002() {
        SignInPage signInPage = new SignInPage(webDriver);
        signInPage.clickButton();
    }
}