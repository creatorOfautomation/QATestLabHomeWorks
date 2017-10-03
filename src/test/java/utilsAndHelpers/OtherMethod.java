package utilsAndHelpers;

import org.openqa.selenium.support.events.EventFiringWebDriver;

public class OtherMethod extends ElementsForPages {

    private EventFiringWebDriver driver;

    public OtherMethod(EventFiringWebDriver driver) {
        this.driver = driver;
    }

    public  OtherMethod loginInAdmin(EventFiringWebDriver driver) {
        HelpersMethod.getPage(driver, linkOfAdminLoginInPage); //get LoginInPage
        HelpersMethod.sendKeys(driver, emailFieldOnLoginPage, emailForLoginIn); //Input Email
        HelpersMethod.sendKeys(driver, passwordFieldOnLoginField, passwordForLoginIn); //Input password
        HelpersMethod.clickOnObject(driver, loginInButton); // Click on button submit
        return new OtherMethod(driver);
    }
}
