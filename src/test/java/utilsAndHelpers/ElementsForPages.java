package utilsAndHelpers;

import org.openqa.selenium.By;

public class ElementsForPages extends Properties {

    /**
     * Elements for LoginPage
     */
    protected String linkOfAdminLoginInPage = linkOfAdminLoginPage;
    protected String emailForLoginIn = emailForLogging;
    protected String passwordForLoginIn = passwordForLogging;
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
    protected By customerMainMenuItem = By.xpath("//li[@data-submenu=\"23\"]");
    protected By supportMainMenuItem = By.id("subtab-AdminParentCustomerThreads");
    protected By statisticMainMenuItem = By.id("subtab-AdminStats");
    protected By moduleMainMenuItem = By.id("subtab-AdminParentModulesSf");
    protected By designMainMenuItem = By.xpath("//li[@data-submenu=\"46\"]");
    protected By shippingMainMenuItem = By.id("subtab-AdminParentShipping");
    protected By paymentMethodMainMenuItem = By.id("subtab-AdminParentPayment");
    protected By internationalMainMenuMethod = By.id("subtab-AdminInternational");
    protected By shopParametersMainMenuItem = By.id("subtab-ShopParameters");
    protected By configurationsMainMenuItem = By.id("subtab-AdminAdvancedParameters");

    /**
     * Elements for adding new category test
     */
    protected By categoryMenuItem = By.id("subtab-AdminCategories");
    protected By addNewCategoryButton = By.id("page-header-desc-category-new_category");
    protected By saveNewCategoryButton = By.id("category_form_submit_btn");
    protected By nameOfNewCategoryField = By.id("name_1");
    protected By alertAboutAddingCategory = By.xpath(".//div[@id='content']//div[@class=\"alert alert-success\"]");
    protected By sortByNameButton = By.xpath(".//*[@class=\"\"]//*[@class='icon-caret-down']");
    protected By stringOfCategory = By.xpath(".//tbody//tr");

    /**
     * Elements for adding new product test
     */
    protected String linkOfMainPage = "http://prestashop-automation.qatestlab.com.ua";
    protected String titleOfPageProduct = "товары";
    protected By productSubMenuItem = By.xpath("//li[@data-submenu=\"10\"]");
    protected By addNewProductButton = By.id("page-header-desc-configuration-add");
    protected By nameOfNewProductField = By.id("form_step1_name_1");
    protected By quantityOfNewProductField = By.id("form_step3_qty_0");
    protected By activateNewProductSwitch = By.cssSelector(".switch-input");
    protected By closeAlertButton = By.cssSelector(".growl-close");
    protected By saveNewProductButton = By.xpath("//button[@class=\"btn btn-primary js-btn-save\"]");
    protected By quantityOfNewProductTab = By.xpath(".//*[@id='tab_step3']/a");
    protected By priceOfNewProductTab = By.id("tab_step2");
    protected By priceOfNewProductField = By.id("form_step2_price");
    protected By allProductsLink = By.xpath(".//a[@class='all-product-link pull-xs-left pull-md-right h4']");
    protected By titleOfProductOnProductPage = By.xpath(".//*[@id='main']/div[1]//h1[@class='h1']");
    protected By priceOfProductOnProductPage = By.xpath("//span[@itemprop=\"price\"]");
    protected By quantityOfProductOnProductPage = By.xpath("//div[@class=\"product-quantities\"]//span");
    protected By nextPageButton = By.xpath(".//*[@id='js-product-list']//*[@rel=\"next\"]");
}
