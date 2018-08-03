package pageObject.Objects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class PostDetailsObject {

    @AndroidFindBy(id = "org.wordpress.android:id/post_title")
    public WebElement title;

    @AndroidFindBy(id="org.wordpress.android:id/post_content")
    public  WebElement content;

    @AndroidFindBy(id = "org.wordpress.android:id/menu_save_post")
    public WebElement publish;

}
