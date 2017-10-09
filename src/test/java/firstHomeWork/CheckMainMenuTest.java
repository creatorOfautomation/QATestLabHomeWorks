package firstHomeWork;


import org.testng.annotations.Test;
import utilsAndHelpers.AbstractWebPage;

public class CheckMainMenuTest extends AbstractWebPage {

    private CheckingMainMenuMethod ob = new CheckingMainMenuMethod(driver);
    private LoginMethod loginMethod = new LoginMethod(driver);

    @Test
    public void main() {
            ob.checkMainMenuItems();
    }

}
