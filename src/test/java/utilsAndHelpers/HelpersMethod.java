package utilsAndHelpers;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Random;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class HelpersMethod {

     private EventFiringWebDriver driver;
     private Actions builer;

    public HelpersMethod (EventFiringWebDriver driver) {
        this.driver = driver;
    }

    public static void clickOnObject(EventFiringWebDriver driver, By element) {

        (new WebDriverWait(driver,8).
                until(ExpectedConditions.elementToBeClickable(element))).click();
    }

    public static void sendKeys(EventFiringWebDriver driver, By element, String stringValue) {

        (new WebDriverWait(driver,50).
                until(ExpectedConditions.presenceOfElementLocated(element))).clear();
        (new WebDriverWait(driver,50).
                until(ExpectedConditions.presenceOfElementLocated(element))).sendKeys(stringValue);
    }

    public static void getPage(EventFiringWebDriver driver, String linkOfpage) {
        driver.get(linkOfpage);
    }

    public static WebElement findElement(EventFiringWebDriver driver, By element) {
        return (new WebDriverWait(driver, 5)
                .until(ExpectedConditions.presenceOfElementLocated(element)));
    }

    public static String getText(EventFiringWebDriver driver, By element) {

        return (findElement(driver, element).getText());
    }

    public static void waitUntilElementsLocated(EventFiringWebDriver driver, By elements) {

        new WebDriverWait(driver, 7)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(elements));

    }

    public static String randomPureString(int length) {
        final String data = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i <= length; i++)
            sb.append(data.charAt(random.nextInt(data.length())));
        return sb.toString();

    }

    public static void sendPureValue(EventFiringWebDriver driver, By by, int length) {
        (new WebDriverWait(driver, 5).
                until(ExpectedConditions.visibilityOfElementLocated(by))).sendKeys(randomPureString(length));
    }

    public static void clickWithJS(EventFiringWebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public static void moveMouseToTarget(EventFiringWebDriver driver, Actions builer, By locator) {
        builer.moveToElement(findElement(driver, locator)).build().perform();
    }

    public static int getSize(EventFiringWebDriver driver, By locator) {
        new WebDriverWait(driver, 5).
                until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
        return driver.findElements(locator).size();
    }

    public static void assertContains(EventFiringWebDriver driver, By locator, String value) {

        assertThat(findElement(driver, locator).getText(), containsString(value.toUpperCase()));
    }

    public static boolean assertTrue(Boolean condExpected) {
         Assert.assertTrue(condExpected);
                return true;
    }

    public static boolean isElementPresent(EventFiringWebDriver driver, By locator) {

        try {
            findElement(driver, locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
