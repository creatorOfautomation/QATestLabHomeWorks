package secondHomeWork;


import org.testng.annotations.Test;
import utilsAndHelpers.AbstractWebPage;

public class AddNewCategoryTest extends AbstractWebPage {

    private  AddNewCategoryMethod newCategory = new AddNewCategoryMethod(driver, builder);

    @Test
    public void addNewCategory() {
        newCategory.addNewCategory();
    }




}
