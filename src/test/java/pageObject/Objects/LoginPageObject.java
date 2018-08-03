package pageObject.Objects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPageObject {


    @AndroidFindBy(id = "org.wordpress.android:id/nux_username")
    public WebElement userName;

    @AndroidFindBy(id = "org.wordpress.android:id/nux_password")
    public WebElement passWord;

    @AndroidFindBy(id = "org.wordpress.android:id/nux_sign_in_button")
    public WebElement loginButton;
}
