package utilsAndHelpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SetWebDriver extends Properties{

    public static int browser = browserNumber;
    private WebDriver driver = returnWebDriver();

    public WebDriver returnWebDriver() {

        switch (browser)
        {
            case 1:
                System.setProperty("webdriver.gecko.driver",
                        new File(SetWebDriver.class.getResource("/geckodriver.exe").getFile()).getPath());
                return new FirefoxDriver();

            case 2:
            default:
                System.setProperty(
                        "webdriver.chrome.driver",
                        new File(SetWebDriver.class.getResource("/chromedriver.exe").getFile()).getPath());
                return new ChromeDriver();

            case 3:
                System.setProperty(
                        "webdriver.chrome.driver",
                        new File(SetWebDriver.class.getResource("/chromedriver.exe").getFile()).getPath());
                Map<String, String> mobileEmulation = new HashMap<String, String>();
                mobileEmulation.put("deviceName", "Nexus 5");

                Map<String, Object> chromeOptions = new HashMap<String, Object>();
                chromeOptions.put("mobileEmulation", mobileEmulation);
                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
                return new ChromeDriver(capabilities);

            case 4:
                System.setProperty("phantomjs.binary.path",
                        new File(SetWebDriver.class.getResource("/phantomjs.exe").getFile()).getPath());
                return new PhantomJSDriver();
        }
    }

    protected  EventFiringWebDriver getConfiguredDriver()
    {
        if (browser == 2 ||browser == 3) {
            driver.manage().window().maximize();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        EventFiringWebDriver wrappedDriver = new EventFiringWebDriver(driver);
        wrappedDriver.register(new EventHandler());
        return wrappedDriver;

    }
}
