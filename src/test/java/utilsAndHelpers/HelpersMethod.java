package utilsAndHelpers;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.*;
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

    public static void getPage(EventFiringWebDriver driver, String linkOfPage) {
        driver.get(linkOfPage);
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

    public static String randomIntValue() {
        Random random = new Random();
        return String.valueOf(random.nextInt(100));
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

        assertThat(findElement(driver, locator).getText().toUpperCase(), containsString(value.toUpperCase()));
    }

    public static void assertEquals(EventFiringWebDriver driver, By locator, String expectedValue) {
       // expectedValue.toUpperCase();
        assertThat(getText(driver, locator).toUpperCase(), is(anyOf(equalTo(expectedValue), equalTo(expectedValue.toUpperCase()))));
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
        } catch (TimeoutException e) {
            return false;
        }
    }

    public static void clearInputFieldAndSendValue(EventFiringWebDriver driver, By locator, String dataForSending) {

        (new WebDriverWait(driver, 8).
                until(ExpectedConditions.visibilityOfElementLocated(locator))).
                sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        (new WebDriverWait(driver, 8).
                until(ExpectedConditions.visibilityOfElementLocated(locator))).
                sendKeys(dataForSending);
    }

    public static int getHighOfElement(EventFiringWebDriver driver, By locator) {

        return findElement(driver, locator).getSize().getHeight();
    }

    public static int getWidthOfElement(EventFiringWebDriver driver, By locator) {

        return findElement(driver, locator).getSize().getWidth();
    }

    public static void waitUntilJSWorks(EventFiringWebDriver driver) {
        final JavascriptExecutor executor = (JavascriptExecutor)driver;
        (new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(final WebDriver dirver) {
                return (Boolean) executor.executeScript("return jQuery.active == 0");
            }
        });
    }

    public static void waitUntilPresenceOfElement(EventFiringWebDriver driver, By locator) {

        new WebDriverWait(driver, 6).
                until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static void waitUntilTextPresenceInElement(EventFiringWebDriver driver, final By locator) {
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>()
        {
            public Boolean apply(WebDriver d) {
                d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                return d.findElement(locator).getText().length() != 0;
            }
        });
    }

    public static String randomEmail() {
        int length = 10;
        String name = "123456789qwertyuiopasdfghjklzxcvbnmm";
        String firstDomain = "qweryuiopasdfghjklzxcvbnm";
        String secondDomain = "qweryuiopasdfghjklzxcvbnm";

        String email = new String();
        Random random = new Random();

        //генерация первой части имейл
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i <= length; i++)
            sb.append(name.charAt(random.nextInt(name.length())));
        email += sb;

        //генерация второй части имейл
        sb = new StringBuilder(length);
        for (int i = 0; i <= length; i++)
            sb.append(firstDomain.charAt(random.nextInt(firstDomain.length())));
        email += "@" + sb;

        //генерация третей части имейл
        sb = new StringBuilder(length);
        for (int i = 0; i <= length; i++)
            sb.append(secondDomain.charAt(random.nextInt(secondDomain.length())));
        email += "." + sb;

        return email;
    }

    public static void sendEmail(EventFiringWebDriver driver, By by) {
        (new WebDriverWait(driver, 5).
                until(ExpectedConditions.visibilityOfElementLocated(by))).sendKeys(randomEmail());
    }

    public static String randomNumber(int length) {
        final String data = "1234567890";

        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i <= length-1; i++)
            sb.append(data.charAt(random.nextInt(data.length())));
        return sb.toString();
    }

    public static void sendNumberValue(WebDriver driver, By by, int length) {
        (new WebDriverWait(driver, 5).
                until(ExpectedConditions.visibilityOfElementLocated(by))).sendKeys(randomNumber(length));
    }

    public static String getURLOfPage(EventFiringWebDriver driver) {
        return driver.getCurrentUrl();
    }

}
