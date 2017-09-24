package firstHomeWork;

import utilsAndHelpers.AbstractWebPage;

/**
 * Created by Мужик on 24.09.2017.
 */
public class LoginTest extends AbstractWebPage{

    private static LoginMethod ob = new LoginMethod(driver);

    /**
     *
     * Test of LoginInPage. The Method for this test is on the LoginMethod.LoginInTest
     * @param args
     */
    public static void main(String[] args) {
        ob.LoginInTest();
    }
}
