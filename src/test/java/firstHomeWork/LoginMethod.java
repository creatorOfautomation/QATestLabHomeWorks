package firstHomeWork;

import org.openqa.selenium.WebDriver;
import utilsAndHelpers.ElementsForPages;
import utilsAndHelpers.HelpersMethod;

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

        HelpersMethod.getPage(driver, linkOfAdminLoginInPage); //get LoginInPage
        HelpersMethod.sendKeys(driver, emailFieldOnLoginPage, emailForLoginIn); //Input Email
        HelpersMethod.sendKeys(driver, passwordFieldOnLoginField, passwordForLoginIn); //Input password
        HelpersMethod.clickOnObject(driver, loginInButton); // Click on button submit
        HelpersMethod.clickOnObject(driver, pictureOfUserAccount); //Click on button userProfile
        HelpersMethod.clickOnObject(driver, logoutButton); //Click on button logout

    }
}
