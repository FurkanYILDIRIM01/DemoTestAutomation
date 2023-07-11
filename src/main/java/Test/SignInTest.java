package Test;

import Base.BaseTest;
import Pages.SignInPage;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {

    @Test(description = "Success- Search a Product By Entering a ASIN Value")
    public void TC001(){
        SignInPage signInPage=new SignInPage(webDriver);
        signInPage.ProductSearch("B09T3CKHH9");
    }
    @Test(description = "Success- Navigate To HomePage")
    public void TC002(){
        SignInPage signInPage=new SignInPage(webDriver);
        signInPage.NavigateHomePage();

    }


}
