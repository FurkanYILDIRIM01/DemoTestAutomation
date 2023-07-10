package Test;

import Base.BaseTest;
import Pages.SignInPage;
import org.junit.Test;

public class SignInTest extends BaseTest {

    @Test
    public void TC001(){
        SignInPage signInPage=new SignInPage(webDriver);
        signInPage.ProductSearch("telefon");






    }
}
