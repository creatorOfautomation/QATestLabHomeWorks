package utilsAndHelpers;

import org.openqa.selenium.By;

public class ElementsForPages extends Properties {

    /**
     * Elements for LoginPage
     */
    protected String linkOfAdminLoginInPage = linkOfAdminLoginPage;
    protected String emailForLoginIn = emailForLogging;
    protected String passwordForLoginIn = passwordForLogging;
    protected String allProductsLink = "http://prestashop-automation.qatestlab.com.ua/ru/2-home";
    protected By emailFieldOnLoginPage = By.id("email");
    protected By passwordFieldOnLoginField = By.id("passwd");
    protected By loginInButton = By.xpath("//div[@class=\"form-group row-padding-top\"]//button[@name=\"submitLogin\"]");
    protected By pictureOfUserAccount = By.id("employee_infos");
    protected By logoutButton = By.id("header_logout");
    protected By errorMessageInvalidPasswordOrLogin = By.cssSelector("#error ol");

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
    protected By allProductsButton = By.xpath(".//a[@class='all-product-link pull-xs-left pull-md-right h4']");
    protected By titleOfProductOnProductPage = By.xpath(".//*[@id='main']/div[1]//h1[@class='h1']");
    protected By priceOfProductOnProductPage = By.xpath("//span[@itemprop=\"price\"]");
    protected By quantityOfProductOnProductPage = By.xpath("//div[@class=\"product-quantities\"]//span");
    protected By nextPageButton = By.xpath(".//*[@id='js-product-list']//*[@rel=\"next\"]");
    protected By closeAllertMessage = By.className("growl-message");

    /**
     * Elements for fourth homeWork
     * There are elements for order of product
     */
    protected String successMessageAboutOrder = "\uE876ВАШ ЗАКАЗ ПОДТВЕРЖДЁН";
    protected By bodyOfPage = By.id("wrapper");
    protected By titlesOfAllProducts = By.xpath("//*[@class=\"h3 product-title\"]");
    protected By addProductToCartButton = By.xpath("//*[@class=\"btn btn-primary add-to-cart\"]");
    protected By goToOrderButton = By.xpath("//a[@class=\"btn btn-primary\"]");
    protected By positionOfProductInCart = By.xpath("//div[@class=\"product-line-grid\"]//*[@class=\"clearfix\"]");
    protected By priceOfProductInCartInOrderStep = By.className("product-price");
    protected By getTitleOfProductInCartInOrderStep = By.xpath("//div[@class=\"product-line-grid-body col-md-4 col-xs-8\"]//a[@class=\"label\"]");
    protected By orderingButton = By.xpath("//a[@class=\"btn btn-primary\"]");
    protected By firstNameFieldOnOrderPage = By.xpath("//input[@name=\"firstname\"]");
    protected By lastNameFieldOnProductPage = By.xpath("//input[@name=\"lastname\"]");
    protected By emailFieldOnProductPage = By.xpath("//div[@class=\"form-group row \"][4]//input[@name=\"email\"]");
    protected By continueButtonOnFirstStep = By.xpath("//button[@name=\"continue\"][@data-link-action=\"register-new-customer\"]");
    protected By companyFieldOnProductPage = By.xpath("//input[@name=\"company\"]");
    protected By identNumberOnProductPage = By.xpath("//input[@name=\"vat_number\"]");
    protected By addressFieldOnProductPage = By.xpath("//input[@name=\"address1\"]");
    protected By additionalAddressOnProductPage = By.xpath("//input[@name=\"address2\"]");
    protected By postcodeFieldOnProductPage = By.xpath("//input[@name=\"postcode\"]");
    protected By cityFieldOnProductPage = By.xpath("//input[@name=\"city\"]");
    protected By phoneFieldOnProductPage = By.xpath("//input[@name=\"phone\"]");
    protected By continueOrderingButton = By.xpath("//*[@class=\"js-address-form\"]//button[@class=\"continue btn btn-primary pull-xs-right\"]");
    protected By continueButtonOnProductPageOnDeliveryStep = By.xpath("//*[@class=\"delivery-options-list\"]//button[@class=\"continue btn btn-primary pull-xs-right\"]");
    protected By acceptRulesCheckBox = By.xpath("//*[@id=\"conditions_to_approve[terms-and-conditions]\"]");
    protected By paymentMethodRadioButton = By.xpath("//*[@id=\"payment-option-1\"]");
    protected By orderButtonOnLastStep = By.xpath("//*[@class=\"btn btn-primary center-block\"]");
    protected By messageOfSuccess = By.xpath("//*[@class=\"h1 card-title\"]");
    protected By orderLine = By.xpath("//div[@class=\"order-line row\"]");
    protected By titleOfProductInCart = By.xpath("//div[@class=\"col-sm-4 col-xs-9 details\"]");
    protected By totalSumInCart = By.xpath("//*[@class=\"font-weight-bold\"]//td[2]");
    protected By additionallyTabOnProductPage = By.xpath("//a[@class=\"nav-link\"]");




//button[@name="continue"]
}
