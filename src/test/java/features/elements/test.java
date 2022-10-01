package features.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.security.Key;

public class test {
//    @Test
//    void testDropdown(){
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/dropdown");
//        driver.manage().window().maximize();
//        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
//        dropdown.selectByVisibleText("Option 2");
//        Assert.assertTrue(driver.findElement(By.cssSelector("option[value='2']")).isSelected());
//
//    }

    @Test
    void testEditTodo(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://todomvc.com/examples/vanillajs/");
        driver.manage().window().maximize();

        driver.findElement(By.className("new-todo")).sendKeys("Do Homework", Keys.ENTER);
        WebElement todoEle = driver.findElement(By.xpath("//label[.='Do Homework']"));
        Actions action = new Actions(driver);
        action.doubleClick(todoEle).perform();


        driver.findElement(By.className("editing")).findElement(By.className("view"))
                .findElement(By.cssSelector("label")).clear();


    }
}
