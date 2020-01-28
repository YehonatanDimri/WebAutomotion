package CropXWebTests;

import Web.BrowserType;
import Web.WebDriverFactory;
import Web.webdrivers.WebDriverKiller;
import configFile.MainConfig;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import reports.Reports;
import reports.extent.ExtentReportsListener;

import java.io.File;

@Listeners(ExtentReportsListener.class)
public abstract class BaseTest {

    protected static WebDriver driver;

    @BeforeClass
    public void beforeClass() throws Exception {

       // MainConfig.initConfig("MainConfig.properties");
        MainConfig.initConfig("src/MainConfig.properties");

        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            WebDriverKiller.killWebdrivers();
        }
    }

    @BeforeMethod
    public void beforeMethod() {

    }

    @AfterMethod
    public void afterMethod() {

        if (driver != null && MainConfig.closeBrowserAfterTest) {
            driver.quit();
            driver = null;
        }
    }

    @AfterClass
    public void afterClass() {
        if (driver != null && MainConfig.closeBrowserAfterTest) {
            driver.quit();
            driver = null;
        }

    }

    protected void browseToUrl(String url) {

        if (driver == null) {

            BrowserType browserType = BrowserType.valueOf(MainConfig.browserType);
            driver = WebDriverFactory.getWebDriver(browserType);
        }

        Reports.report("Browsing to URL: " + url);
        driver.get(url);
    }
    public static void takeScreenshot() throws Exception {

        if (driver != null) {
            File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        }
        else {
            Reports.warning("driver == null; Can't take screenshot.");
        }
    }

}

