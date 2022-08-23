package elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.image.Kernel;

public class TodoTest {
    @Test
    void todoTest(){
        /**
         * 1. Open browser
         * 2. Navigate to https://todomvc.com/examples/vanillajs/
         * 3. Fill in new todo with Do Homework.
         * 4. Enter
         * 5. Verify new todo is appear All/Active View
         * Number item left + 1
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://todomvc.com/examples/vanillajs/");
        driver.manage().window().maximize();

        //Check size of current list
        int currentNumberOfList = 0;

        if(driver.findElement(By.className("todo-list")).isDisplayed() == false){
            currentNumberOfList = 0;
        }else{
            currentNumberOfList = driver.findElement(By.className("todo-list"))
                    .findElements(By.tagName("li")).size();
        }

        //Check current count number
        String currentCountNumber = driver.findElement(By.className("todo-count"))
                .findElement(By.tagName("strong")).getText();
        if (currentCountNumber.equalsIgnoreCase("")){
            currentCountNumber = "0";
        }

        //Fill in new todo with Do Homework.
        driver.findElement(By.className("new-todo")).sendKeys("Do Homework", Keys.ENTER);

        //Verify new todo is appear All View
        Assert.assertTrue(driver.findElement(By.xpath("//label[.='Do Homework']")).isDisplayed());

        //Verify new todo is appear Active View
        driver.findElement(By.xpath("//a[.='Active']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//label[.='Do Homework']")).isDisplayed());

        //Check size of the list after fill value
        int countList = driver.findElement(By.className("todo-list")).findElements(By.tagName("li")).size();
        Assert.assertEquals(countList,currentNumberOfList+1);

//      Check Count Number after fill value
        String countNumber = driver.findElement(By.className("todo-count"))
                .findElement(By.tagName("strong")).getText();
        Assert.assertEquals(Integer.parseInt(countNumber), Integer.parseInt(currentCountNumber)+ 1);

    }

}

