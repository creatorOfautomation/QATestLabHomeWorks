package utilsAndHelpers;

import org.openqa.selenium.By;

/**
 * Created by Мужик on 24.09.2017.
 */
public class ElementsForPages {

    /**
     * Elements for LoginPage
     */

    protected String linkOfAdminLoginInPage = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
    protected String emailForLoginIn = "webinar.test@gmail.com";
    protected String passwordForLoginIn = "Xcg7299bnSmMuRLp9ITw";
    protected By emailFieldOnLoginPage = By.id("email");
    protected By passwordFieldOnLoginField = By.id("passwd");
    protected By loginInButton = By.xpath("//div[@class=\"form-group row-padding-top\"]//button[@name=\"submitLogin\"]");
    protected By pictureOfUserAccount = By.id("employee_infos");
    protected By logoutButton = By.id("header_logout");
}
