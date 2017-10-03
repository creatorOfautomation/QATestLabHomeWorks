package firstHomeWork;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import utilsAndHelpers.ElementsForPages;
import utilsAndHelpers.HelpersMethod;
import java.util.concurrent.TimeUnit;

public class CheckingMainMenuMethod extends ElementsForPages {

    private EventFiringWebDriver driver;

    public CheckingMainMenuMethod(EventFiringWebDriver driver) {
        this.driver = driver;
    }

    public void checkMainMenuItems() {

        HelpersMethod.getPage(driver, linkOfAdminLoginInPage); //get LoginInPage
        HelpersMethod.sendKeys(driver, emailFieldOnLoginPage, emailForLoginIn); //Input Email
        HelpersMethod.sendKeys(driver, passwordFieldOnLoginField, passwordForLoginIn); //Input password
        HelpersMethod.clickOnObject(driver, loginInButton); // Click on button submit
        HelpersMethod.waitUntilElementsLocated(driver, mainMenuItems);
        //array of main menuItem
        By[] itemsOfMainMenu = {dashBoardMainMenuItem, orderMenuItem, catalogMainMenuItem, customerMainMenuItem,
                                supportMainMenuItem, statisticMainMenuItem, moduleMainMenuItem, designMainMenuItem,
                                shippingMainMenuItem, paymentMethodMainMenuItem, internationalMainMenuMethod,
                                shopParametersMainMenuItem, configurationsMainMenuItem};

        for (int i=0; i<itemsOfMainMenu.length; i++ )
        {
            HelpersMethod.clickOnObject(driver, itemsOfMainMenu[i]); //click on the element of array
            driver.manage().timeouts().implicitlyWait(2500, TimeUnit.MILLISECONDS);
            String titleOfPageBeforeRefreshing = HelpersMethod.getText(driver, titleOfPage); //title of page before refresh
            System.out.println("The page number" +" " + i + " " + "has tittle : " + " "+ titleOfPageBeforeRefreshing);
            driver.navigate().refresh();
            String titleOfPageAfterRefreshing = HelpersMethod.getText(driver, titleOfPage); //title of page after refresh
            Assert.assertTrue((titleOfPageBeforeRefreshing).equals(titleOfPageAfterRefreshing)); //verify title  of page before and after refresh
        }
    }
}



