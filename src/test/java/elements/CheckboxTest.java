package elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest {
    @Test
    void verifyCheckbox(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        //Find Element checkbox 1
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        if (checkbox1.isSelected() != true){
            checkbox1.click();
        }
        Assert.assertTrue(checkbox1.isSelected());

        //Find Element checkbox 2
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        if (checkbox2.isSelected() != true){
            checkbox2.click();
        }
        Assert.assertTrue(checkbox2.isSelected());
    }
}
