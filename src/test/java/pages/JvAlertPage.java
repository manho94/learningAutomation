package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class JvAlertPage {
    WebDriver driver;

    public JvAlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
    }
    public String getResult() {
        Assert.assertTrue(driver.findElement(By.id("result")).isDisplayed());
        return driver.findElement(By.id("result")).getText();
    }
    public void acceptPopup() {
        driver.switchTo().alert().accept();
    }
    public void dismissPopup() {
        driver.switchTo().alert().dismiss();
    }
    public void sendKeyToPopUp(String keyWord) {
        driver.switchTo().alert().sendKeys("Hello");
    }
    public void clickButton(By xpath) {
        driver.findElement(xpath).click();
    }
}
