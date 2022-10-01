package features.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

//        driver.findElement(By.tagName("input")).sendKeys("selenium webdriver");
//        driver.findElement(By.className("gLFyf")).sendKeys("selenium webdriver");
//        driver.findElement(By.name("q")).sendKeys("selenium webdriver");

        //By cssSelector
//        driver.findElement(By.cssSelector("input")).sendKeys("selenium webdriver");
//        driver.findElement(By.cssSelector("input.gLFyf")).sendKeys("selenium webdriver");
//        driver.findElement(By.cssSelector("input[title='Tìm kiếm']")).sendKeys("selenium webdriver");
         driver.findElement(By.cssSelector("input[name='q']")).sendKeys("selenium webdriver");
//        driver.quit();

    }
}
