package features.browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class ChromeBrowserTest {
    @Test
    void openNormal(){
        WebDriverManager.chromedriver().setup();
        new ChromeDriver();
    }
    @Test
    void openHeadlessMode(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        new ChromeDriver(options);
    }
//Open Chrome with Emulator mode
    @Test
    void openMobileViewPort(){
        WebDriverManager.chromedriver().setup();
        Map<String, Object> deviceMetrics = new HashMap<>();
        deviceMetrics.put("width", 390);
        deviceMetrics.put("height", 844);
        deviceMetrics.put("pixelRatio", 1.0);
        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceMetrics", deviceMetrics);
        mobileEmulation.put("userAgent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_3_1 like Mac OS X) AppleWebKit/603.1.30 (KHTML, like Gecko) Version/10.0 Mobile/14E304 Safari/602.1");

        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.google.com.vn");
    }
}
