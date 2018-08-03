package pageObject.Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.pages.HomePage;
import pageObject.pages.LoginPAge;
import pageObject.pages.PostDetailsPage;
import pageObject.pages.PostPage;
import pageObject.utils.BaseTestClass;

public class BlogTest extends BaseTestClass {

    @Test
    public void AddBlog(){
        LoginPAge page = new LoginPAge(driver);
        HomePage home=page.login("takkaiscool","Kumar@123").waitTillHomePageLoads();
        PostPage post=home.navigateToBlogPosts();
        PostDetailsPage postDetails=post.waitForPostPageToLoad().addPost().waitForPostPageToLoad();
        post=postDetails.enterPostDetails("test1234","Test contents").waitForPostPageToLoad();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@text='test1234']")).getText(),"test1234");
    }
}
