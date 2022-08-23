package elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

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
    @Test
    void hyperLinkTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/status_codes");
        driver.manage().window().maximize();

        //Clicking on 200
        driver.findElement(By.linkText("200")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/status_codes/200");
        //Click on "go here"
        //driver.findElement(By.linkText("here")).click();
        driver.navigate().back();

        //Click on "301"
        driver.findElement(By.linkText("301")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/status_codes/301");
        //Click on "go here"
        driver.findElement(By.linkText("here")).click();

        //Click on "404"
        driver.findElement(By.linkText("404")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/status_codes/404");
        //Click on "go here"
        driver.findElement(By.linkText("here")).click();

        //Click on "500"
        driver.findElement(By.linkText("500")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/status_codes/500");
        //Click on "go here"
        driver.findElement(By.linkText("here")).click();

        driver.quit();

    }
}
