package pageObject.Tests;

import org.testng.annotations.Test;
import pageObject.pages.LoginPAge;
import pageObject.utils.BaseTestClass;

public class LoginTest  extends BaseTestClass {

    @Test
    public void Login(){
        LoginPAge page = new LoginPAge(driver);
        page.login("takkaiscool","Kumar@123");
    }

}
