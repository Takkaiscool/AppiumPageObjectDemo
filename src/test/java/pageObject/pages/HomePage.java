package pageObject.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import pageObject.Objects.HomePageObject;
import pageObject.utils.BaseTestClass;

public class HomePage extends BaseTestClass {

    AppiumDriver driver;
    HomePageObject homePage;

    public  HomePage(AppiumDriver driver){
        this.driver=driver;
        homePage=new HomePageObject();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),homePage);
    }
    public  HomePage waitTillHomePageLoads(){

        waitForElement(driver,homePage.viewSite);
        return  this;
    }

    public  PostPage navigateToBlogPosts(){
        homePage.blogPosts.click();
        return new PostPage(driver);
    }

}
