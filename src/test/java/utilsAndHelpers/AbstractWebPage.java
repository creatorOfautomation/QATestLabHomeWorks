package utilsAndHelpers;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Мужик on 24.09.2017.
 */
public class AbstractWebPage {

    protected static WebDriver driver = new ChromeDriver();

    @Before
    private void beforeTheTest() {
        driver.manage().window().maximize();
        driver.get("http://prestashop-automation.qatestlab.com.ua");
    }

    @After
    private void afterTests() {
        driver.quit();
    }
}
