package features.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FramePage;

public class FrameTest {
    WebDriver driver;
    FramePage framePage;
    @BeforeClass
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @BeforeMethod
    void openBrowser(){
        framePage = new FramePage(driver);
        framePage.open();
    }

    @Test
    void verifyTopMiddleFrame(){
        framePage.switchFrame("frame-top");
        framePage.switchFrame("frame-middle");
        String content = framePage.getTextById();
        Assert.assertEquals(content,"MIDDLE");
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
