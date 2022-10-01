package features.bmi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.UnitCalculatorPage;
import supports.Browser;

public class UnitCalculatorTest {
    /**
     * Open browser
     * Navigate to https://www.calculator.net/bmi-calculator.html
     * Select metric unit tab
     * Fill calculator with age, gender, weight, height
     * Validate result is correct
     */

//    static WebDriver driver;
    UnitCalculatorPage UnitCalculatorPage;

    @Parameters({"browser","url"})
    @BeforeClass()
    public void setUp(String browser, String url) {
        Browser.openBrowser(browser);
        Browser.visit(url);
        UnitCalculatorPage = new UnitCalculatorPage();
        UnitCalculatorPage.selectUnitMetric();
    }

    @BeforeMethod
    public void selectUnit(){
        UnitCalculatorPage.clearForm();
    }

    @Test
    public void unitCalculator1() {

        UnitCalculatorPage.fillForm("27", "Female", "160", "54");
        String result = UnitCalculatorPage.getResult();

        Assert.assertEquals(result, "BMI = 21.1 kg/m2   (Normal)");

    }
    @Test
    public void unitCalculator2() {

        UnitCalculatorPage.fillForm("31", "male", "175", "62");
        String result = UnitCalculatorPage.getResult();

        Assert.assertEquals(result, "BMI = 20.2 kg/m2   (Normal)");

    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult iTestResult){
        if(!iTestResult.isSuccess()){
            Browser.captureScreenShot(iTestResult.getName());
        }
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        Browser.quit();
    }

}
