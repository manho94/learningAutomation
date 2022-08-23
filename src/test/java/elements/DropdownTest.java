package elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest {
    @Test
    void dropdownVerify(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        //Find Element Dropdown
        Select dropdown1 = new Select(driver.findElement(By.id("dropdown")));
//        dropdown1.selectByVisibleText("Option 1");
//        dropdown1.selectByValue("1");
        dropdown1.selectByIndex(1);
        Assert.assertTrue(driver.findElement(By.cssSelector("option[value='1']")).isSelected());

//        Assert.assertTrue(driver.findElement(By.id("dropdown"))
//                .findElement(By.cssSelector("option[value='1']")).isSelected());
//        Assert.assertTrue(driver.findElement(By.xpath("//select[@id='dropdown']/option[2]")).isSelected());
//        Assert.assertTrue(driver.findElements(By.cssSelector("select#dropdown>option")).get(1).isSelected());
    }
}
