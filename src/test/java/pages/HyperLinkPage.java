package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HyperLinkPage {

    WebDriver driver;

    public HyperLinkPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLink(String pageName) {
        driver.findElement(By.linkText(pageName)).click();
    }

    public void open(){
        driver.get("https://the-internet.herokuapp.com/status_codes");
    }
}
