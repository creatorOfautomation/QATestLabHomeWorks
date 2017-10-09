package secondHomeWork;

import utilsAndHelpers.OtherMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import utilsAndHelpers.ElementsForPages;
import utilsAndHelpers.HelpersMethod;

public class AddNewCategoryMethod extends ElementsForPages {

    private EventFiringWebDriver driver;
    private Actions builder;
    private OtherMethod otherMethod = new OtherMethod(driver);

    public AddNewCategoryMethod(EventFiringWebDriver driver, Actions builder) {
        this.driver = driver;
        this.builder = builder;
    }

    public void addNewCategory() {
        /**
         * Variables for quantity of categories and for
         * name of categories;
         */
        int numberOfCategoriesBeforeAdding;
        int numberOfCategoriesAfterAdding;
        String nameOfNewCategory = HelpersMethod.randomPureString(10);

        otherMethod.loginInAdmin(driver); //logging in account
        HelpersMethod.moveMouseToTarget(driver, builder, catalogMainMenuItem);
        HelpersMethod.clickOnObject(driver, categoryMenuItem); //open category page
        numberOfCategoriesBeforeAdding = HelpersMethod.getSize(driver, stringOfCategory); // how much do we have categories  before adding
        HelpersMethod.clickOnObject(driver, addNewCategoryButton);
        HelpersMethod.sendKeys(driver, nameOfNewCategoryField, nameOfNewCategory);
        HelpersMethod.clickOnObject(driver, saveNewCategoryButton); //saved new category
        HelpersMethod.assertTrue(HelpersMethod.isElementPresent(driver, alertAboutAddingCategory)); //verify alert appeared after adding category
        HelpersMethod.clickOnObject(driver, sortByNameButton);
        numberOfCategoriesAfterAdding = HelpersMethod.getSize(driver, stringOfCategory); // how much do we have categories  after adding new
        HelpersMethod.assertTrue(numberOfCategoriesAfterAdding > numberOfCategoriesBeforeAdding); //there must be  more categories then initially
        HelpersMethod.assertTrue
                (HelpersMethod.isElementPresent(driver, By.xpath(".//*[contains(text()," + "'"
                        + nameOfNewCategory + "'" + " )]"))); //verify  that our new category displayed in list of categories

    }

    public void verifyAddedProduct() {

        HelpersMethod.getPage(driver, linkOfMainPage);
        HelpersMethod.clickOnObject(driver, allProductsLink);


    }
}
