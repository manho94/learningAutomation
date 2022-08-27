package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    private By userName = By.id("username");
    private By passWord = By.id("password");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isFlashMessageDisplayed() {
        return driver.findElement(By.className("success")).isDisplayed();
    }

    public void submitCredential(String user_Name, String pass_Word) {
        //Find element username
        driver.findElement(userName).sendKeys(user_Name);
        //Find element password
        driver.findElement(passWord).sendKeys(pass_Word);
//        Find element Button Login
        driver.findElement(By.cssSelector("[type='submit']")).click();
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();
    }

}
