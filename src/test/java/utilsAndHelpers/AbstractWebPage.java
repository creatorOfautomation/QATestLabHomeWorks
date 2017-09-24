package utilsAndHelpers;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractWebPage {

    protected static WebDriver driver = new ChromeDriver();

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
