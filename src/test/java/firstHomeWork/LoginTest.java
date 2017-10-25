package firstHomeWork;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilsAndHelpers.AbstractWebPage;

public class LoginTest extends AbstractWebPage {

    private LoginMethod loginMethod = new LoginMethod(driver);
    private final String invalidPasswordMessage = "Неверный пароль";
    private final String invalidLoginMessage = "Такого работника нет или пароль указан неверно.";
    private final String correctLogin = "webinar.test@gmail.com";
    private final String correctPassword = "Xcg7299bnSmMuRLp9ITw";
    private final String incorrectLogin = "weebinar.test@gmail.com";
    private final String incorrectPassword = "X";

    @DataProvider
    public Object[][] correctLoginData() {
        return new String[][]{
                {correctLogin, correctPassword},
        };
    }

    @DataProvider
    public Object[][] incorrectLoginData() {
        return new String[][]{
                {correctLogin, incorrectPassword, invalidPasswordMessage},
                {incorrectLogin, correctPassword, invalidLoginMessage}
        };
    }

    @Test(dataProvider = "correctLoginData", invocationCount = 3)
    public void loginTest(String log, String pasw) {

        loginMethod.testCorrectLogin(log, pasw);
    }

    @Test(dataProvider = "incorrectLoginData")
    public void testIncorrectDataForLogging(String login, String password, String errorMessage) {
        loginMethod.testIncorrectDataForLogging(login, password, errorMessage);
    }

}
