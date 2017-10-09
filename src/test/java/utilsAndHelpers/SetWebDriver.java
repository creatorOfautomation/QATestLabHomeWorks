package utilsAndHelpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SetWebDriver extends Properties{

    private int browser = browserNumber;
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
        }
    }

    protected  EventFiringWebDriver getConfiguredDriver()
    {
        if (browser == 2) {
            driver.manage().window().maximize();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        EventFiringWebDriver wrappedDriver = new EventFiringWebDriver(driver);
        wrappedDriver.register(new EventHandler());
        return wrappedDriver;
    }
}
