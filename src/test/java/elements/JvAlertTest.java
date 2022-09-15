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
import pages.JvAlertPage;

public class JvAlertTest {

    WebDriver driver;
    JvAlertPage jvAlertPage;
    @BeforeClass()
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    @BeforeMethod
    public void openChrome(){
        jvAlertPage = new JvAlertPage(driver);
        jvAlertPage.open();
    }

    @Test
    void JvAlertTest(){

    }

    @Test
    void JsConfirmOK(){

        jvAlertPage.clickButton(By.xpath("//button[.='Click for JS Confirm']"));
        jvAlertPage.acceptPopup();
        String result = jvAlertPage.getResult();
        Assert.assertEquals(result,"You clicked: Ok");

    }



    @Test
    void jsConfirmCancel(){
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        jvAlertPage.dismissPopup();
        String result = jvAlertPage.getResult();
        Assert.assertEquals(result,"You clicked: Cancel");
    }


    @Test
    void jsPrompt(){
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        jvAlertPage.sendKeyToPopUp("Hello");
        jvAlertPage.acceptPopup();
        String result = jvAlertPage.getResult();
        Assert.assertEquals(result,"You entered: Hello");
    }


    @AfterClass(alwaysRun = true)
    void tearDown(){
        driver.quit();
    }


}

