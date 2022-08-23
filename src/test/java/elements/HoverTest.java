package elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HoverTest {
    static WebDriver driver;


    @BeforeClass
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");
        driver.manage().window().maximize();
    }
    @Test
    void user1(){
        Actions mouse = new Actions(driver);
        mouse.moveToElement(driver.findElement(By.xpath("//div[@class='figure'][1]"))).perform();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='figure'][1]/div[@class='figcaption']")).isDisplayed());
    }

    @Test
    void contextClick(){

    }

    @AfterClass(alwaysRun = true)
    void tearDown(){
        driver.quit();
    }
}
