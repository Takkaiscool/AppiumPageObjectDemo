package pageObject.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import pageObject.Objects.PostDetailsObject;
import pageObject.utils.BaseTestClass;

public class PostDetailsPage extends BaseTestClass {
    AppiumDriver driver;
    PostDetailsObject postPage;

    public  PostDetailsPage(AppiumDriver driver){
        this.driver=driver;
        postPage=new PostDetailsObject();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),postPage);
    }

    public PostDetailsPage waitForPostPageToLoad(){
        waitForElement(this.driver,postPage.title);
        return  this;
    }

    public PostPage enterPostDetails(String title,String content){
        postPage.title.sendKeys(title);
        postPage.content.click();
        postPage.content.sendKeys(content);
        driver.hideKeyboard();
        postPage.publish.click();
        return new PostPage(driver);
    }

}
