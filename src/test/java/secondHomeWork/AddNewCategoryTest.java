package secondHomeWork;

import org.junit.Test;
import utilsAndHelpers.AbstractWebPage;

public class AddNewCategoryTest extends AbstractWebPage {

    private static AddNewCategoryMethod newCategory = new AddNewCategoryMethod(driver, builder);

    @Test
    public void addNewCategory() {
        newCategory.addNewCategory();
    }




}
