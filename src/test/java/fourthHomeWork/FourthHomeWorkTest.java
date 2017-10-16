package fourthHomeWork;

import org.testng.annotations.Test;
import utilsAndHelpers.AbstractWebPage;
import utilsAndHelpers.Properties;
import utilsAndHelpers.SetWebDriver;

public class FourthHomeWorkTest extends AbstractWebPage {

    private FourthHomeWorkMethod fourthHomeWork = new FourthHomeWorkMethod(driver);

    @Test
    public void checkMobileVersionOfSite() {
        fourthHomeWork.checkMainPageWithMobileDevice();
    }

    @Test
    public void checkDesktopVersionOfSite() {
        fourthHomeWork.checkMainPageWithDesktopVersion();
    }

    @Test
    public void purchaseProduct(){
        fourthHomeWork.makeAnOrder();
    }

}

