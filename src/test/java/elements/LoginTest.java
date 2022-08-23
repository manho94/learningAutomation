package elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    @Test
    void validCredentials(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        //Find element username
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        //Find element password
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
//        driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
//        driver.findElement(By.cssSelector("[type='password']")).sendKeys("SuperSecretPassword!");
//        driver.findElement(By.cssSelector("[name='password']")).sendKeys("SuperSecretPassword!");
//        driver.findElement(By.cssSelector("input#password")).sendKeys("SuperSecretPassword!");
//        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("SuperSecretPassword!");
//        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("SuperSecretPassword!");
//        driver.findElement(By.xpath("(//input)[2]")).sendKeys("SuperSecretPassword!");
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SuperSecretPassword!");
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");

//        Find element Button Login
        driver.findElement(By.cssSelector("[type='submit']")).click();
//        driver.findElement(By.className("radius")).click();
//        driver.findElement(By.cssSelector("button")).click();
//        driver.findElement(By.cssSelector("[class='radius']")).click();
//        driver.findElement(By.cssSelector("button[class='radius']")).click();
//        driver.findElement(By.cssSelector("button[type='submit']")).click();
//        driver.findElement(By.xpath("//button")).click();
//        driver.findElement(By.xpath("//button[@class='radius']")).click();
//        driver.findElement(By.xpath("//button[@type='submit']")).click();

//        Wait until
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2")));
//        Find Text Secure Area
//        String successText = driver.findElement(By.cssSelector("h2")).getText();
//        boolean result = successText.equalsIgnoreCase("Secure Area");
//        Assert.assertTrue(result);

        //Check change link to verify login successfully
//        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/secure");

        //Check flash-messages is disabled to verify login successfully
        boolean isSuccessMessageDisplayed = driver.findElement(By.className("success")).isDisplayed();
        Assert.assertTrue(isSuccessMessageDisplayed);

    }
}
