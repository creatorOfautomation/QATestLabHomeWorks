package utilsAndHelpers;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.*;

public class AbstractWebPage extends SetWebDriver {

    protected  EventFiringWebDriver driver = getConfiguredDriver();
    protected  Actions builder = new Actions(driver);
    @BeforeTest
    public void beforeTheTest() {
        driver.get("http://prestashop-automation.qatestlab.com.ua");
    }

    @AfterTest
    public void afterTests() {
        driver.quit();
    }


}
