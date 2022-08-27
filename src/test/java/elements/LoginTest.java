package elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeClass()
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @BeforeMethod
    void openBrowser() {
        loginPage = new LoginPage(driver);
        loginPage.open();
    }

    @Test
    void withValidCredential() {
        loginPage.submitCredential("tomsmith", "SuperSecretPassword");
        boolean isSuccessMessageDisplayed = loginPage.isFlashMessageDisplayed();
        Assert.assertTrue(isSuccessMessageDisplayed);
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }

}
