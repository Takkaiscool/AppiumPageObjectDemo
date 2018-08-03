package pageObject.Objects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class PostPageObject {
    @AndroidFindBy(id = "org.wordpress.android:id/fab_button")
    public WebElement addPost;

    @AndroidFindBy(xpath = "android.widget.LinearLayout")
    public  WebElement firstPostTitle;

}
