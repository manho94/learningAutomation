package elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.TodoPage;

public class TodoTest {
    WebDriver driver;
    TodoPage todoPage;

    @BeforeClass()
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://todomvc.com/examples/vanillajs/");
        driver.manage().window().maximize();
        todoPage = new TodoPage(driver);
    }

    @Test
    void todoTest() {
        /**
         * 1. Open browser
         * 2. Navigate to https://todomvc.com/examples/vanillajs/
         * 3. Fill in new todo with Do Homework.
         * 4. Enter
         * 5. Verify new todo is appear All/Active View
         * Number item left + 1
         */
        //Check size of current list
        int currentNumberOfList = TodoPage.checkSizeCurrentList();
        //Check current count number
        String currentCountNumber = TodoPage.checkCurrentCountNumber();

        TodoPage.fillTodo("Do Homework");

        //Verify new todo is appear All View
        Assert.assertTrue(driver.findElement(By.xpath("//label[.='Do Homework']")).isDisplayed());

        //Verify new todo is appear Active View
        TodoPage.selectTab("Active");
        Assert.assertTrue(driver.findElement(By.xpath("//label[.='Do Homework']")).isDisplayed());

        //Check size of the list after fill value
        int countList = TodoPage.checkSizeList();
        Assert.assertEquals(countList, currentNumberOfList + 1);

//      Check Count Number after fill value
        String countNumber = TodoPage.checkCountNumber();
        Assert.assertEquals(Integer.parseInt(countNumber), Integer.parseInt(currentCountNumber) + 1);

    }

    @AfterClass(alwaysRun = true)
    void tearDown() {
        driver.quit();
    }

}
