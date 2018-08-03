package pageObject.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.Objects.LoginPageObject;
import pageObject.utils.BaseTestClass;

public class LoginPAge extends BaseTestClass {

    AppiumDriver driver;
    LoginPageObject loginPageObject;

    public  LoginPAge(AppiumDriver driver){
        this.driver=driver;
        loginPageObject=new LoginPageObject();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),loginPageObject);
    }

    public  HomePage login(String username,String password){
        loginPageObject.userName.sendKeys(username);
        loginPageObject.passWord.sendKeys(password);
        loginPageObject.loginButton.click();
        return new HomePage(driver);
    }
}
