package firstHomeWork;


import org.testng.annotations.Test;
import utilsAndHelpers.AbstractWebPage;

public class LoginTest extends AbstractWebPage{

    private LoginMethod ob = new LoginMethod(driver);

    @Test
    public void loginTest() {
        ob.LoginInTest();
    }

}
