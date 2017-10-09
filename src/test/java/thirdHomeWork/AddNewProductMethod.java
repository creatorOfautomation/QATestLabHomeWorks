package thirdHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import utilsAndHelpers.ElementsForPages;
import utilsAndHelpers.HelpersMethod;
import utilsAndHelpers.OtherMethod;

public class AddNewProductMethod extends ElementsForPages {

    private EventFiringWebDriver driver;
    private Actions builder;
    private OtherMethod otherMethod = new OtherMethod(driver);
    private String nameOfNewProduct = HelpersMethod.randomPureString(10);
    private String quantityOfNewProduct = HelpersMethod.randomIntValue();
    private String priceOfNewProduct = String.valueOf(Math.random()*100).substring(0,4);
    private By newProduct = By.xpath(".//*[contains(text()," + "'"
            + nameOfNewProduct + "'" + " )]");

    public AddNewProductMethod(EventFiringWebDriver driver, Actions builder) {
        this.driver = driver;
        this.builder = builder;
    }

    public void AddNewProduct() {
        otherMethod.loginInAdmin(driver);
        HelpersMethod.clickOnObject(driver, catalogMainMenuItem);
        HelpersMethod.assertEquals(driver, titleOfPage, titleOfPageProduct);
        HelpersMethod.clickOnObject(driver, addNewProductButton);
        HelpersMethod.sendKeys(driver, nameOfNewProductField, nameOfNewProduct);
        HelpersMethod.clickWithJS(driver, quantityOfNewProductTab);
        HelpersMethod.clearInputFieldAndSendValue(driver, quantityOfNewProductField, quantityOfNewProduct);
        HelpersMethod.clickOnObject(driver, priceOfNewProductTab);
        HelpersMethod.clearInputFieldAndSendValue(driver, priceOfNewProductField, priceOfNewProduct);
        HelpersMethod.clickOnObject(driver, activateNewProductSwitch);
        try {
            HelpersMethod.clickOnObject(driver, closeAlertButton);
        }catch (TimeoutException e){
            HelpersMethod.clickOnObject(driver, saveNewProductButton);
        }
        try {
            HelpersMethod.clickOnObject(driver, closeAlertButton);
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void verifyNewProduct() {
        HelpersMethod.getPage(driver, linkOfMainPage);
        HelpersMethod.clickOnObject(driver, allProductsLink);
        if (HelpersMethod.isElementPresent(driver, newProduct) == false)
        {
            HelpersMethod.clickOnObject(driver, nextPageButton);
        }
        HelpersMethod.clickOnObject(driver, newProduct);
        HelpersMethod.assertEquals(driver, titleOfProductOnProductPage, nameOfNewProduct);
        HelpersMethod.assertContains(driver, priceOfProductOnProductPage, priceOfNewProduct.replace('.',','));
        HelpersMethod.assertContains(driver, quantityOfProductOnProductPage, quantityOfNewProduct);
    }
}
