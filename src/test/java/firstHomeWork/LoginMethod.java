package firstHomeWork;

import org.openqa.selenium.WebDriver;
import utilsAndHelpers.ElementsForPages;
import utilsAndHelpers.HelpersMethod;

/**
 * Created by Мужик on 24.09.2017.
 */
public class LoginMethod extends ElementsForPages {

    private WebDriver driver;

    public LoginMethod(WebDriver driver) {
        this.driver = driver;
    }

    /**
     *
     * Method For Login in account
     */

    public  void LoginInTest() {

        HelpersMethod.getPage(driver, linkOfAdminLoginInPage);
        HelpersMethod.sendKeys(driver, emailFieldOnLoginPage, emailForLoginIn);
        HelpersMethod.sendKeys(driver, passwordFieldOnLoginField, passwordForLoginIn);
        HelpersMethod.cliclOnObject(driver, loginInButton);
        HelpersMethod.cliclOnObject(driver, pictureOfUserAccount);
        HelpersMethod.cliclOnObject(driver, logoutButton);
        HelpersMethod.quitTests(driver);
    }
}
