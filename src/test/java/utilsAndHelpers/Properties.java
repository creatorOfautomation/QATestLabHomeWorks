package utilsAndHelpers;

import fourthHomeWork.FourthHomeWorkMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

/**
 * Created by Мужик on 08.10.2017.
 * This class will be used for  setting data and parameters for testing
 */
public class Properties {


    /**
     * Which browser use for testing
     * Set the number 1 or 2 where
     * 1 - refers to browser FireFox
     * 2 - refers to browser Chrome
     * 3 - refers to mobile version of Chrome
     */

    public static int browserNumber = 2;

    /**
     * Here are data for logging and links of WebPages
     */
    protected String linkOfAdminLoginPage = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
    protected String emailForLogging = "webinar.test@gmail.com";
    protected String passwordForLogging = "Xcg7299bnSmMuRLp9ITw";


}
