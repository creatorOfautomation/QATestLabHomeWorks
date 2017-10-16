package utilsAndHelpers;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class AbstractWebPage extends SetWebDriver {

    protected  EventFiringWebDriver driver = getConfiguredDriver();
   //protected RemoteWebDriver driver;
    protected  Actions builder = new Actions(driver);
    private Properties properties = new Properties();

    @BeforeSuite
    public void beforeTheTest() {
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        try {
//            driver = new RemoteWebDriver( new URL("http://localhost:4444/wd/hub"), capabilities);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }

        driver.get("http://prestashop-automation.qatestlab.com.ua");
    }

    @AfterTest
    public void afterTests() {
        driver.quit();
    }

}
