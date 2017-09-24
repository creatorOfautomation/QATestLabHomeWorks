package utilsAndHelpers;

import org.openqa.selenium.By;

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

    /**
     * Elements for mainMenuTest
     */
    protected By mainMenuItems = By.cssSelector(".title>span");
    protected By titleOfPage = By.xpath("//h2");
    protected By dashBoardMainMenuItem = By.id("tab-AdminDashboard");
    protected By orderMenuItem = By.id("subtab-AdminParentOrders");
    protected By catalogMainMenuItem = By.id("subtab-AdminCatalog");
    protected By customerMainMenuItem = By.xpath("//li[@data-submenu=\"23\"]");//"subtab-AdminParentCustomer");
    protected By supportMainMenuItem = By.id("subtab-AdminParentCustomerThreads");
    protected By statisticMainMenuItem = By.id("subtab-AdminStats");
    protected By moduleMainMenuItem = By.id("subtab-AdminParentModulesSf");
    protected By designMainMenuItem = By.xpath("//li[@data-submenu=\"46\"]");
    protected By shippingMainMenuItem = By.id("subtab-AdminParentShipping");
    protected By paymentMethodMainMenuItem = By.id("subtab-AdminParentPayment");
    protected By internationalMainMenuMethod = By.id("subtab-AdminInternational");
    protected By shopParametersMainMenuItem = By.id("subtab-ShopParameters");
    protected By configurationsMainMenuItem = By.id("subtab-AdminAdvancedParameters");

}
