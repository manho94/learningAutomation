package features.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CheckBoxPage;

public class CheckBoxTest {

    static WebDriver driver;
    CheckBoxPage checkBoxPage;
    @BeforeClass
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
    }
    @BeforeClass
    void openBrowser(){
        checkBoxPage.open();
    }

    @Test
    void verifyCheckbox(){
        checkBoxPage = new CheckBoxPage(driver);
        WebElement checkBox1 = checkBoxPage.selectCheckbox1();
        Assert.assertTrue(checkBox1.isSelected());

        WebElement checkBox2 = checkBoxPage.selectCheckbox2();
        Assert.assertTrue(checkBox2.isSelected());
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }



}
