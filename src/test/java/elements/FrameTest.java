package elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTest {
    @Test
    void tc01(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        String content = driver.findElement(By.id("content")).getText();
        Assert.assertEquals(content,"MIDDLE");
        driver.quit();
    }
}
