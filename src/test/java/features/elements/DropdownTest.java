package features.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.DropDownPage;

public class DropdownTest {
    WebDriver driver;
    DropDownPage dropDownPage;
    @BeforeClass
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @BeforeMethod
    void openBrowser(){
        dropDownPage = new DropDownPage(driver);
        dropDownPage.open();
    }

    @DataProvider
    Object[][] dropDownIndex(){
        return new Object[][]{
                {1},
                {2}
        };
    }

    @Test(dataProvider = "dropDownIndex")
    void dropdownVerify(int index){
        dropDownPage.selectDropDown(index);
        Assert.assertTrue(driver.findElement(By.cssSelector(String.format("option[value='%d']",index))).isSelected());

    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
