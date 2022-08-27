package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage {
    private WebDriver driver;
    private By checkBox_1 = By.xpath("(//input[@type='checkbox'])[1]");
    private By checkBox_2 = By.xpath("(//input[@type='checkbox'])[2]");


    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement selectCheckbox1() {
        WebElement checkBox1 = driver.findElement(checkBox_1);
        if (checkBox1.isSelected() != true){
            checkBox1.click();
        }
        return checkBox1;
    }

    public WebElement selectCheckbox2() {
        WebElement checkBox2 = driver.findElement(checkBox_2);
        if (checkBox2.isSelected() != true){
            checkBox2.click();
        }
        return checkBox2;
    }

    public void open(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

}
