package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    WebDriver driver;

    private String xpathUserImage = "//div[@class='figure'][%d]";

    public HoverPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(){
        driver.get("https://the-internet.herokuapp.com/hovers");
        driver.manage().window().maximize();
    }
    public void hoverOnUser(int index) {
        Actions mouse = new Actions(driver);
        mouse.moveToElement(driver.findElement(By.xpath(String.format(xpathUserImage,index)))).perform();
    }
}
