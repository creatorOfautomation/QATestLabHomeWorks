package firstHomeWork;

import utilsAndHelpers.AbstractWebPage;

public class LoginTest extends AbstractWebPage{

    private static LoginMethod ob = new LoginMethod(driver);

    /**
     *
     * Test of LoginInPage. The Method for this test is on the LoginMethod.LoginInTest
     * @param args
     */
    public static void main(String[] args) {
        ob.LoginInTest();
        driver.quit();
    }
}
