package features.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;


public class TableTest {
    /**
     * Open browser
     * Navigate to https://the-internet.herokuapp.com/tables
     * Focus on table 1
     * The person who has the largest due is "Doe Jacson"
     */
    WebDriver driver;
    List<Double> dueLists;

    @BeforeClass
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        driver.manage().window().maximize();

        /**
         * Find List of Due, compare and Find maximum due
         * Get index of maximum due
         * get Last Name First Name
         * Verify
         */

        dueLists = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[4]"))
                        .stream().map(WebElement::getText).toList()
                        .stream().map(s -> s.replace("$","")).toList()
                        .stream().map(Double::valueOf).toList();

        System.out.println(dueLists);
    }

    @Test
    void verifyLargestDuePersonInTable1() {

        Double maxDue = Collections.max(dueLists);

        int indexOfMax = dueLists.indexOf(maxDue);

        Assert.assertEquals(getFullNameByIndex(indexOfMax+1), "Jason Doe");

    }

    @Test
    void verifySmallestDuePersonInTable1(){
        Double smallDue = Collections.min(dueLists);
        System.out.println(smallDue);
        //find index of smallDue
        List<String> listSmallestDuePerson = new ArrayList<>();
        for (int i = 0; i < dueLists.size(); i++){
            if(Objects.equals(dueLists.get(i), smallDue)){
                listSmallestDuePerson.add(getFullNameByIndex(i+1));
            }
        }
        System.out.println(listSmallestDuePerson);
        Assert.assertEquals(listSmallestDuePerson, Arrays.asList("John Smith","Tim Conway"));

    }

    String getFullNameByIndex(int index){
        String firstName = driver.findElement(By.xpath(String.format("//table[@id='table1']/tbody/tr[%d]/td[2]", index))).getText();
        String lastname = driver.findElement(By.xpath(String.format("//table[@id='table1']/tbody/tr[%d]/td[1]", index))).getText();
        return String.format("%s %s", firstName, lastname);
    }

    @AfterClass(alwaysRun = true)
    void tearDown() {
        driver.quit();
    }
}
