package utilsAndHelpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelpersMethod {

     private WebDriver driver;

    public HelpersMethod (WebDriver driver) {
        this.driver = driver;
    }

    public static void clickOnObject(WebDriver driver, By element) {

        (new WebDriverWait(driver,5).
                until(ExpectedConditions.elementToBeClickable(element))).click();

    }

    public static void sendKeys(WebDriver driver, By element, String stringValue) {

        (new WebDriverWait(driver,50).
                until(ExpectedConditions.presenceOfElementLocated(element))).clear();
        (new WebDriverWait(driver,50).
                until(ExpectedConditions.presenceOfElementLocated(element))).sendKeys(stringValue);
    }

    public static void getPage(WebDriver driver, String linkOfpage) {
        driver.get(linkOfpage);
    }

    public static void quitTests(WebDriver driver) {
        driver.quit();
    }

    public static WebElement findElement(WebDriver driver, By element) {
        return (new WebDriverWait(driver, 5)
                .until(ExpectedConditions.presenceOfElementLocated(element)));
    }

    public static String getText(WebDriver driver, By element) {

        return (findElement(driver, element).getText());
    }

    public static void waitUntilElementsLocated(WebDriver driver, By elements) {

        new WebDriverWait(driver, 7)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(elements));

    }
}
