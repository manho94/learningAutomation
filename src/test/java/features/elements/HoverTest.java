package features.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HoverPage;

public class HoverTest {
    static WebDriver driver;
    HoverPage hoverPage;

    @BeforeClass
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    @BeforeMethod
    void openChrome(){
        hoverPage = new HoverPage(driver);
        hoverPage.open();
    }
    @DataProvider
    Object[][] userIndex(){
        return new Object[][]{
                {1},
                {2},
                {3}
        };
    }
    @Test(dataProvider = "userIndex")
    void checkHoverOnUser(int index){
        hoverPage.hoverOnUser(index);
        Assert.assertTrue(driver.findElement(By.xpath(String.format("//div[@class='figure'][%d]/div[@class='figcaption']",index))).isDisplayed());
    }


    @AfterClass(alwaysRun = true)
    void tearDown(){
        driver.quit();
    }
}
