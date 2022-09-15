package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {

    WebDriver driver;
    private By dropDown = By.id("dropdown");

    public DropDownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(){
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }
    public void selectDropDown(int index) {
        Select dropdown1 = new Select(driver.findElement(dropDown));
        dropdown1.selectByIndex(index);
    }
}
