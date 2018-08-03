package pageObject.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.net.URL;
public class BaseTestClass {

    public AppiumDriver driver;
    DesiredCapabilities cap;

    @BeforeClass
    public void setup() throws  Exception{
        cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"6.0");
        cap.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/wordpress.apk");
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"org.wordpress.android");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"org.wordpress.android.ui.WPLaunchActivity");
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
    }

    @AfterClass
    public void tearDown(){
        //driver.quit();
    }

    public void waitForElement(AppiumDriver driver, WebElement ele){
        WebDriverWait wait=new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.elementToBeClickable(ele));
    }
}
