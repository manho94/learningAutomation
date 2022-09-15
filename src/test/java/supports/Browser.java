package supports;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Locale;

public class Browser {
    public static WebDriver openBrowser(String name){
        switch (name.toLowerCase()){
            case "firefox":{
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            }
            case "safari":
                return new SafariDriver();

            default: {
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            }
        }

    }
}
