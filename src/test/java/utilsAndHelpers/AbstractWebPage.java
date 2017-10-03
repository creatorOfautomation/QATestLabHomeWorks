package utilsAndHelpers;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class AbstractWebPage extends SetWebDriver {

    protected static EventFiringWebDriver driver = getConfiguredDriver();
    protected static Actions builder = new Actions(driver);

    @Before
    public void beforeTheTest() {
        driver.manage().window().maximize();
        driver.get("http://prestashop-automation.qatestlab.com.ua");
    }

    @After
    public void afterTests() {
        driver.quit();
    }
}
