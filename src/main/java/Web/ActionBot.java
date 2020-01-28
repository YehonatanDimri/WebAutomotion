package Web;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import reports.Reports;

public class ActionBot<value> {

    private WebDriver driver;

    public void clickEnter() {
        driver.findElement(By.id("element_id")).sendKeys(Keys.ENTER);

    }

    public void clickDown() {
        driver.findElement(By.id("element_id")).sendKeys(Keys.DOWN);

    }

    public ActionBot(WebDriver driver) {
        this.driver = driver;
    }


    public void click(By2 by2) {

        Reports.report("Click on element: " + by2.description + " (" + by2.by + ")");
        WebElement element = driver.findElement(by2.by);
        element.click();
    }

    public void writeToElement(By2 by2, String text) {
        Reports.report("Write '" + text + "' to element: " + by2.description + " (" + by2.by + ")");
        WebElement element = driver.findElement(by2.by);
        element.sendKeys(text);

    }

    public void selectInDropDownList(By2 by2, String text) {
        WebElement element = driver.findElement(by2.by);
        new Select(element).selectByVisibleText(text);
        Reports.report("Selected '" + text + "' from List: " + by2.description + " (" + by2.by + ")");

    }

    public void selectInDropDownListByVisibleText(By2 by2, String text) {
        Select drpSelect = new Select(driver.findElement(by2.by));
        drpSelect.selectByVisibleText(text);
        Reports.report("Selected '" + text + "' from List: " + by2.description + " (" + by2.by + ")");
    }

    public void assertUrl(String Url) {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, Url);
        Reports.report("The excepted URL" + Url + "is equal to" + URL);
    }


    public void scrollToElement(By2 by2) {
        WebElement element = driver.findElement(by2.by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Reports.report("Scrolled to Element " + by2.description + " (" + by2.by + ")");

    }

    public void selectinsearchList(By2 by2) throws InterruptedException {
        WebElement element = driver.findElement(by2.by);
        Actions action = new Actions(driver);
        Thread.sleep(100);
        action.moveToElement(element).click(element).perform();
        Reports.report("select to Element " + by2.description + " (" + by2.by + ")");

    }


    public void waitElementToBeVisible(By2 by2) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by2.by));
        Reports.report("wait to Element to be visible " + by2.description + " (" + by2.by + ")");
    }

    public void wait1(){
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.visibilityOfAllElements());
    }
    public void wait2() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.wait(40);
    }
}





