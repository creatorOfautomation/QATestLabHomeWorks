package fourthHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.asserts.SoftAssert;
import utilsAndHelpers.*;
import java.util.ArrayList;

public class FourthHomeWorkMethod extends ElementsForPages {

    private EventFiringWebDriver driver;
    private SoftAssert softAssert = new SoftAssert();
    private ArrayList<WebElement> elements = new ArrayList<WebElement>();
    private String titleOfSelectedProduct;
    private String priceOfSelectedProduct;
    private String linkOfSelectedProduct;
    private int randomNumberOfProduct =  (int) ( Math.random() * 7 );
    private int quantityOfProductBeforePurchase;
    private int quantityOfProductAfterPurchase;
    private By fieldsForStringValue[] = {companyFieldOnProductPage, identNumberOnProductPage, addressFieldOnProductPage,
                                         additionalAddressOnProductPage, cityFieldOnProductPage};

    public FourthHomeWorkMethod(EventFiringWebDriver driver) {
        this.driver = driver;
    }

    public void checkMainPageWithMobileDevice() {

        softAssert.assertTrue(HelpersMethod.getHighOfElement(driver, bodyOfPage) > 2000,
                "The high of page is less 2000 px");
        softAssert.assertTrue(HelpersMethod.getWidthOfElement(driver, bodyOfPage) < 400,
                "The width of page is larger 400 px");
        softAssert.assertAll();

    }

    public void checkMainPageWithDesktopVersion() {

        softAssert.assertTrue(HelpersMethod.getHighOfElement(driver, bodyOfPage) < 1800,
                "The high of page is more 1800 px");
        softAssert.assertTrue(HelpersMethod.getWidthOfElement(driver, bodyOfPage) > 1300,
                "The width of page is less 1300 px");
        softAssert.assertAll();
    }

    public void makeAnOrder() {

        HelpersMethod.clickOnObject(driver, allProductsButton);
        HelpersMethod.waitUntilJSWorks(driver);
        elements.addAll(driver.findElements(titlesOfAllProducts));
        elements.get(randomNumberOfProduct).click();
        elements.clear();
        linkOfSelectedProduct = HelpersMethod.getURLOfPage(driver);
        titleOfSelectedProduct = HelpersMethod.getText(driver, titleOfProductOnProductPage);
        priceOfSelectedProduct = HelpersMethod.getText(driver, priceOfProductOnProductPage);
        HelpersMethod.clickOnObject(driver, additionallyTabOnProductPage);
        HelpersMethod.waitUntilTextPresenceInElement(driver, quantityOfProductOnProductPage);
        quantityOfProductBeforePurchase = Integer.parseInt(HelpersMethod.getText(driver, quantityOfProductOnProductPage).replaceAll("\\D+", " ").trim());
        HelpersMethod.clickOnObject(driver, addProductToCartButton);
        HelpersMethod.clickOnObject(driver, goToOrderButton);
        elements.addAll(driver.findElements(positionOfProductInCart));
        HelpersMethod.assertTrue(elements.size() < 2);
        elements.clear();
        HelpersMethod.assertEquals(driver, getTitleOfProductInCartInOrderStep, titleOfSelectedProduct);
        HelpersMethod.assertEquals(driver, priceOfProductInCartInOrderStep, priceOfSelectedProduct);
        HelpersMethod.clickOnObject(driver, orderingButton);
        HelpersMethod.sendPureValue(driver, firstNameFieldOnOrderPage, 10);
        HelpersMethod.sendPureValue(driver, lastNameFieldOnProductPage, 10);
        HelpersMethod.sendEmail(driver, emailFieldOnProductPage);
        HelpersMethod.clickOnObject(driver, continueButtonOnFirstStep);
        for (int i =0; i<fieldsForStringValue.length; i++)
        {
            HelpersMethod.sendPureValue(driver, fieldsForStringValue[i], 10);
        }
        HelpersMethod.sendNumberValue(driver, postcodeFieldOnProductPage, 5);
        HelpersMethod.sendNumberValue(driver, phoneFieldOnProductPage, 10);
        HelpersMethod.clickOnObject(driver, continueOrderingButton);
        HelpersMethod.clickOnObject(driver, continueButtonOnProductPageOnDeliveryStep);
        HelpersMethod.clickWithJS(driver, acceptRulesCheckBox);
        HelpersMethod.clickWithJS(driver, paymentMethodRadioButton);
        HelpersMethod.clickOnObject(driver, orderButtonOnLastStep);
        HelpersMethod.assertEquals(driver, messageOfSuccess, successMessageAboutOrder);
        elements.addAll(driver.findElements(orderLine));
        HelpersMethod.assertTrue(elements.size() < 2);
        elements.clear();
        HelpersMethod.assertContains(driver, titleOfProductInCart, titleOfSelectedProduct);
        HelpersMethod.assertEquals(driver, totalSumInCart, priceOfSelectedProduct);
        HelpersMethod.getPage(driver, linkOfSelectedProduct);
        HelpersMethod.clickOnObject(driver, additionallyTabOnProductPage);
        HelpersMethod.waitUntilTextPresenceInElement(driver, quantityOfProductOnProductPage);
        quantityOfProductAfterPurchase = Integer.parseInt(HelpersMethod.getText(driver, quantityOfProductOnProductPage).replaceAll("\\D+", " ").trim());
        HelpersMethod.assertTrue(quantityOfProductAfterPurchase == quantityOfProductBeforePurchase - 1);
        System.out.println(quantityOfProductAfterPurchase + "  " + quantityOfProductBeforePurchase);
    }

}
