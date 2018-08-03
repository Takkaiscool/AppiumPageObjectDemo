package pageObject.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageObject.Objects.PostPageObject;
import pageObject.utils.BaseTestClass;

public class PostPage extends BaseTestClass {

    AppiumDriver driver;
    PostPageObject postPage;

    public  PostPage(AppiumDriver driver){
        this.driver=driver;
        postPage=new PostPageObject();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),postPage);
    }

    public  PostPage waitForPostPageToLoad(){
        waitForElement(driver,postPage.addPost);
        return this;
    }
    public  PostDetailsPage addPost(){
        postPage.addPost.click();
        return  new PostDetailsPage(driver);
    }

    public  void VerifyAddedPost(String title){
        Assert.assertEquals(postPage.firstPostTitle.getText(),title);
    }
}
