package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {
    WebDriver driver;
    private By contentById = By.id("content");
    public FramePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(){
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();
    }
    public void switchFrame(String frameName) {
        driver.switchTo().frame(frameName);
    }
    public String getTextById() {
        return driver.findElement(contentById).getText();
    }
}
