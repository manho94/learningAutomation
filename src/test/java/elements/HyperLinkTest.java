package elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HyperLinkPage;

public class HyperLinkTest {
    /**
     * Hyperlink - link text
     * Open browser
     * Navigate to https://the-internet.herokuapp.com/status_codes
     * Click on "200"
     * Then "200 status code" page appear
     * Click on "go here"
     * Click on "301"
     * Then "301 status code" page appear
     * Click on "go here"
     * Click on "404"
     * Then "404 status code" page appear
     * Click on "go here"
     * Click on "500"
     * Then "500 status code" page appear
     * Click on "go here"
     */
    //Test  = [(action + verification)...]
    static WebDriver driver;
    HyperLinkPage hyperLinkPage;
    @BeforeClass
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @BeforeMethod
    void openBrowser(){
        hyperLinkPage = new HyperLinkPage(driver);
        hyperLinkPage.open();
    }

    @DataProvider
    Object[][] statusCode(){
        return new Object[][]{
                {"200"},
                {"301"},
                {"404"},
                {"500"}
        };
    }

    @Test(dataProvider = "statusCode")
    void verifyLink(String status){
        hyperLinkPage.clickLink(status);
        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/status_codes/" + status);
    }

    @AfterMethod
    void backToStatusPage(){
        driver.navigate().back();
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }


}
