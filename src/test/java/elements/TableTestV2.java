package elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TableTestV2 {
    /**
     * Open browser
     * Navigate to https://the-internet.herokuapp.com/tables
     * Focus on table 1
     * The person who has the largest due is "Doe Jacson"
     */
    WebDriver driver;
    @BeforeClass
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        driver.manage().window().maximize();
    }

    @Test
    void verifyLargestDuePersonInTable1V2(){


        //Find the person has the Largest Due
        //Get First Name and Last name of this person

        List<WebElement> listRow = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        List<Person> listPerson = listRow.stream().map(s->personInfo(s)).collect(Collectors.toList());

        for (Person p:listPerson){
            System.out.println(p);
        }

        Person largestDuePerson = listPerson
                .stream()
                .max(Comparator.comparing(Person::getDUE))
                .orElseThrow(NoClassDefFoundError::new);

        Assert.assertEquals(String.format("%s %s", largestDuePerson.getFIRSTNAME(), largestDuePerson.getLASTNAME()), "Jason Doe");


    }

    @AfterClass(alwaysRun = true)
    void tearDown(){
        driver.quit();
    }

    public Person personInfo(WebElement element){
        String lastName = element.findElements(By.tagName("td")).get(0).getText();
        String firstName = element.findElements(By.tagName("td")).get(1).getText();
        String email = element.findElements(By.tagName("td")).get(2).getText();
        float due = Float.parseFloat(element.findElements(By.tagName("td")).get(3).getText().trim().replace("$",""));
        String webSite = element.findElements(By.tagName("td")).get(4).getText();
        return new Person(lastName,firstName,email,due,webSite);

    }
}
