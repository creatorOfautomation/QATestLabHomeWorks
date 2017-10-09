package thirdHomeWork;

import org.testng.annotations.Test;
import utilsAndHelpers.AbstractWebPage;

public class AddNewProductTest extends AbstractWebPage {

    private AddNewProductMethod addNewProduct = new AddNewProductMethod(driver, builder);

   /* @DataProvider
    public Object[][] getLogin() {
        return new String[][]{
                {"webinar.test@gmail.com", "Xcg7299bnSmMuRLp9ITw"}
        };
    }*/

    @Test//(dataProvider = "getLogin")
    public void addNewProduct() {
        addNewProduct.AddNewProduct();
    }

    @Test(dependsOnMethods = {"addNewProduct"})
    public void verifyPresenceOfNewProductOnPage() {
        addNewProduct.verifyNewProduct();
    }
}
