package pageObject.Objects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObject {


    @AndroidFindBy(id = "org.wordpress.android:id/switch_site")
    @iOSFindBy( id = "org.wordpress.android:id/switch_site")
    @FindBy( id = "org.wordpress.android:id/switch_site")
    public WebElement switchSite;

    @AndroidFindBy(id = "org.wordpress.android:id/my_site_view_site_text_view")
    public WebElement viewSite;

    @AndroidFindBy(id = "org.wordpress.android:id/my_site_stats_text_view")
    public WebElement stats;

    @AndroidFindBy(id="org.wordpress.android:id/my_site_blog_posts_text_view")
    public  WebElement blogPosts;
}
