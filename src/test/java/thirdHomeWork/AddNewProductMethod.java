package thirdHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import utilsAndHelpers.ElementsForPages;
import utilsAndHelpers.HelpersMethod;
import utilsAndHelpers.OtherMethod;
import utilsAndHelpers.Properties;

public class AddNewProductMethod extends ElementsForPages {

    private EventFiringWebDriver driver;
    private Actions builder;
    private OtherMethod otherMethod = new OtherMethod(driver);
    private String nameOfNewProduct = HelpersMethod.randomPureString(10);
    private String quantityOfNewProduct = HelpersMethod.randomIntValue();
    private String priceOfNewProduct = String.valueOf(Math.random()*100).substring(0,4);
    private By newProduct = By.xpath(".//*[contains(text()," + "'"
            + nameOfNewProduct + "'" + " )]");
    private Properties properties = new Properties();
    public By emailFieldOnLoginPage = By.id("email");
    public By passwordFieldOnLoginField = By.id("passwd");
    public By loginInButton = By.xpath("//div[@class=\"form-group row-padding-top\"]//button[@name=\"submitLogin\"]");
    public String linkOfAdminLoginPage = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";

    public AddNewProductMethod(EventFiringWebDriver driver, Actions builder) {
        this.driver = driver;
        this.builder = builder;
    }

    public void AddNewProduct() {

        HelpersMethod.clickOnObject(driver, catalogMainMenuItem);
        HelpersMethod.assertEquals(driver, titleOfPage, titleOfPageProduct);
        HelpersMethod.clickOnObject(driver, addNewProductButton);
        HelpersMethod.sendKeys(driver, nameOfNewProductField, nameOfNewProduct);
        HelpersMethod.clickWithJS(driver, quantityOfNewProductTab);
        HelpersMethod.clearInputFieldAndSendValue(driver, quantityOfNewProductField, quantityOfNewProduct);
        HelpersMethod.clickOnObject(driver, priceOfNewProductTab);
        HelpersMethod.clearInputFieldAndSendValue(driver, priceOfNewProductField, priceOfNewProduct);
        HelpersMethod.clickOnObject(driver, activateNewProductSwitch);
        HelpersMethod.waitUntilPresenceOfElement(driver, closeAllertMessage);
        HelpersMethod.clickOnObject(driver, closeAlertButton);
        HelpersMethod.clickOnObject(driver, saveNewProductButton);
        HelpersMethod.waitUntilPresenceOfElement(driver, closeAllertMessage);
        HelpersMethod.clickOnObject(driver, closeAlertButton);

    }

    public void verifyNewProduct() {
        HelpersMethod.getPage(driver, linkOfMainPage);
        HelpersMethod.clickOnObject(driver, allProductsButton);

        boolean finished = false;
        for (int i=0; i<4; i++)
        {
            if (HelpersMethod.isElementPresent(driver, newProduct) == false)
            {
                HelpersMethod.clickOnObject(driver, nextPageButton);
            }
            if(!finished) break;
        }

        HelpersMethod.clickOnObject(driver, newProduct);
        HelpersMethod.assertEquals(driver, titleOfProductOnProductPage, nameOfNewProduct);
        HelpersMethod.assertContains(driver, priceOfProductOnProductPage, priceOfNewProduct.replace('.',','));
        HelpersMethod.assertContains(driver, quantityOfProductOnProductPage, quantityOfNewProduct);
    }
}
