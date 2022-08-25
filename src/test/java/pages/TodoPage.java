package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TodoPage {
    static WebDriver driver;
    private static By todoCountClass = By.className("todo-count");
    private static By strongTag = By.tagName("strong");
    private static By todoListClass = By.className("todo-list");
    private static By liTag = By.tagName("li");
    private static By newTodoClass = By.className("new-todo");

    public TodoPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String checkCountNumber() {
        return driver.findElement(todoCountClass)
                .findElement(strongTag).getText();
    }

    public static int checkSizeList() {
        return driver.findElement(todoListClass).findElements(liTag).size();
    }

    public static void selectTab(String tabText) {
        driver.findElement(By.xpath(String.format("//a[.='%s']", tabText))).click();
    }

    public static String checkCurrentCountNumber() {
        String currentCountNumber = checkCountNumber();
        if (currentCountNumber.equalsIgnoreCase("")) {
            currentCountNumber = "0";
        }
        return currentCountNumber;
    }

    public static int checkSizeCurrentList() {
        int currentNumberOfList = 0;

        if (driver.findElement(todoListClass).isDisplayed() == false) {
            currentNumberOfList = 0;
        } else {
            currentNumberOfList = checkSizeList();
        }
        return currentNumberOfList;
    }

    public static void fillTodo(String todoText) {
        driver.findElement(newTodoClass).sendKeys(todoText, Keys.ENTER);
    }
}
