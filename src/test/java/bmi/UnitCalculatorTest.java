package bmi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.UnitCalculatorPage;

public class UnitCalculatorTest {
    /**
     * Open browser
     * Navigate to https://www.calculator.net/bmi-calculator.html
     * Select metric unit tab
     * Fill calculator with age, gender, weight, height
     * Validate result is correct
     */

    static WebDriver driver;
    UnitCalculatorPage UnitCalculatorPage;

    @BeforeClass()
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.calculator.net/bmi-calculator.html");
        driver.manage().window().maximize();
        UnitCalculatorPage = new UnitCalculatorPage(driver);
        UnitCalculatorPage.selectUnitMetric();

    }

    @BeforeMethod
    void selectUnit(){
        UnitCalculatorPage.clearForm();
    }

    @Test
    void unitCalculator1() {

        UnitCalculatorPage.fillForm("27", "Female", "160", "54");
        String result = UnitCalculatorPage.getResult();

        Assert.assertEquals(result, "BMI = 21.1 kg/m2   (Normal)");

    }
    @Test
    void unitCalculator2() {

        UnitCalculatorPage.fillForm("31", "male", "175", "62");
        String result = UnitCalculatorPage.getResult();

        Assert.assertEquals(result, "BMI = 20.2 kg/m2   (Normal)");

    }

    @AfterClass(alwaysRun = true)
    void tearDown() {
        driver.quit();
    }

}
