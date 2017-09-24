package firstHomeWork;

import org.junit.Test;
import utilsAndHelpers.AbstractWebPage;

public class CheckMainMenuTest extends AbstractWebPage {

    private CheckingMainMenuMethod ob = new CheckingMainMenuMethod(driver);
    private LoginMethod loginMethod = new LoginMethod(driver);

    @Test
    public void main() {
            ob.checkMainMenuItems();
    }

}
