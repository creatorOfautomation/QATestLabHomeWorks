package utilsAndHelpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class EventHandler implements WebDriverEventListener{
    public void beforeAlertAccept(WebDriver webDriver) {

    }

    public void afterAlertAccept(WebDriver webDriver) {

    }

    public void afterAlertDismiss(WebDriver webDriver) {

    }

    public void beforeAlertDismiss(WebDriver webDriver) {

    }

    public void beforeNavigateTo(String s, WebDriver webDriver) {

    }

    public void afterNavigateTo(String s, WebDriver webDriver) {
        System.out.println("Navigated to page: " + webDriver.getCurrentUrl() + ";");
    }

    public void beforeNavigateBack(WebDriver webDriver) {

    }

    public void afterNavigateBack(WebDriver webDriver) {

    }

    public void beforeNavigateForward(WebDriver webDriver) {

    }

    public void afterNavigateForward(WebDriver webDriver) {

    }

    public void beforeNavigateRefresh(WebDriver webDriver) {

    }

    public void afterNavigateRefresh(WebDriver webDriver) {
        //System.out.println("Refreshed page " + ":" + webDriver.getCurrentUrl() + ";");
        try {
            System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("step.txt")), true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
       // System.out.println("Let's try and find element" + ":" + webElement + ";");
    }

    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        //System.out.println("Found element" + ":" + webElement + ";");
    }

    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("Trying to click on element " + ":" + webElement.toString() + ";");
    }

    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("Clicked on element " + ":" + webElement + ";");
    }

    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    public void beforeScript(String s, WebDriver webDriver) {

    }

    public void afterScript(String s, WebDriver webDriver) {

    }

    public void onException(Throwable throwable, WebDriver webDriver) {

    }
}
