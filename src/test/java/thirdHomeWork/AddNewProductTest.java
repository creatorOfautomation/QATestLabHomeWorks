package thirdHomeWork;

import org.testng.annotations.*;
import utilsAndHelpers.AbstractWebPage;
import utilsAndHelpers.HelpersMethod;

public class AddNewProductTest extends AbstractWebPage {

    private AddNewProductMethod addNewProduct = new AddNewProductMethod(driver, builder);

    @DataProvider
    public Object[][] getLogin() {
        return new String[][]{
                {"webinar.test@gmail.com", "Xcg7299bnSmMuRLp9ITw"}
        };
    }

    @Test(dataProvider = "getLogin")
    public void addNewProduct(String login, String password) {

        HelpersMethod.getPage(driver, addNewProduct.linkOfAdminLoginPage); //get LoginInPage
        HelpersMethod.sendKeys(driver, addNewProduct.emailFieldOnLoginPage, login); //Input Email
        HelpersMethod.sendKeys(driver, addNewProduct.passwordFieldOnLoginField, password); //Input password
        HelpersMethod.clickOnObject(driver, addNewProduct.loginInButton); // Click on button submit
        addNewProduct.AddNewProduct();
    }

    @Test(dependsOnMethods = {"addNewProduct"})
    public void verifyPresenceOfNewProductOnPage() {
        addNewProduct.verifyNewProduct();
    }
}
