package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.util.Strings;

public class UnitCalculatorPage {
    WebDriver driver;
    private By clearButton = By.cssSelector("img[class='clearbtn']");
    private By ageTextBox = By.cssSelector("input#cage");
    private By maleRadioButton = By.xpath("//label[normalize-space()='Male']");
    private By femaleRadioButton = By.xpath("//label[normalize-space()='Female']");
    private By heightTextBox = By.cssSelector("input[id='cheightmeter']");
    private By weightTextBox = By.cssSelector("input[id='ckg']");
    private By calculatorButton = By.cssSelector("input[value='Calculate']");
    private By resultLabel = By.cssSelector("div[class='bigtext']");
    private By unitMetricButton = By.id("menuon");

    public UnitCalculatorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearForm() {
        driver.findElement(clearButton).click();
    }

    public void fillForm(String age, String gender, String height, String weight) {
        driver.findElement(ageTextBox).sendKeys(age);
        if (gender.equalsIgnoreCase("Male")) {
            driver.findElement(maleRadioButton).click();
        } else {
            driver.findElement(femaleRadioButton).click();
        }
        driver.findElement(heightTextBox).sendKeys(height);
        driver.findElement(weightTextBox).sendKeys(weight);
        driver.findElement(calculatorButton).click();
    }

    public String getResult() {
        return driver.findElement(resultLabel).getText();
    }

    public void selectUnitMetric() {
        driver.findElement(unitMetricButton).click();
    }
}
