package pageObject.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import pageObject.Objects.LoginPageObject;

public class LoginPAge {

    AppiumDriver driver;
    LoginPageObject loginPageObject;

    public  LoginPAge(AppiumDriver driver){
        this.driver=driver;
        loginPageObject=new LoginPageObject();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),loginPageObject);
    }

    public  void login(String username,String password){
        loginPageObject.userName.sendKeys(username);
        loginPageObject.passWord.sendKeys(password);
        loginPageObject.loginButton.click();
    }
}
