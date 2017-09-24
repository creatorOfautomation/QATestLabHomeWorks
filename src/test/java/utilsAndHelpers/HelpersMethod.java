package utilsAndHelpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by Мужик on 24.09.2017.
 */
public class HelpersMethod {

     private WebDriver driver;

    public HelpersMethod (WebDriver driver) {
        this.driver = driver;
    }

    public static void cliclOnObject(WebDriver driver, By element) {

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


}
